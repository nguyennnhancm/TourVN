package importGEO;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import tourvn.core.geo.entities.Geo;
import tourvn.core.geo.entities.GeoAssoc;
import tourvn.core.geo.manager.IGEOManager;
import tourvn.core.utils.LookupLocator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 9/11/2015
 * Time: 3:15 PM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
public class ImportGEOFromFile {
    String path = "D:\\temp\\Danh_Sach_Cap_Xa.xls";

    IGEOManager geoManager = LookupLocator.getGEOManager();

    @Test
    public void importGeo(){
        try {
            InputStream inputStream = new FileInputStream(path);
            Workbook workbook = new HSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.rowIterator();

            Geo geoVN = new Geo();
            geoVN.setGeoId("VN");
            geoVN.setGeoTypeId("COUNTRY");
            geoVN.setGeoName("Việt Nam");
            geoVN.setGeoCode("VN");
            geoVN.setCreatedStamp(new Timestamp(new Date().getTime()));
            while (rowIterator.hasNext()) {
                Row row = (Row) rowIterator.next();
                Cell wardId = row.getCell(0);
                Cell wardName = row.getCell(1);
                Cell wardEngName = row.getCell(2);
                Cell wardLevel = row.getCell(3);
                Cell districtId = row.getCell(4);
                Cell districtName = row.getCell(5);
                Cell provinceId = row.getCell(6);
                Cell provinceName = row.getCell(7);

                //save province
                Geo geoProvince = new Geo();
                geoProvince.setGeoId(cellToString(provinceId));
                geoProvince.setGeoTypeId("PROVINCE");
                geoProvince.setGeoName(cellToString(provinceName));
                geoProvince.setCreatedStamp(new Timestamp(new Date().getTime()));

                Geo geoDistrict = new Geo();
                geoDistrict.setGeoId(cellToString(districtId));
                geoDistrict.setGeoTypeId("DISTRICT");
                geoDistrict.setGeoName(cellToString(districtName));
                geoDistrict.setCreatedStamp(new Timestamp(new Date().getTime()));

                Geo geoWard = new Geo();
                geoWard.setGeoId(cellToString(wardId));
                geoWard.setGeoTypeId("DISTRICT");
                geoWard.setGeoName(cellToString(wardName));
                geoWard.setWellKnownText(cellToString(wardLevel));
                geoWard.setCreatedStamp(new Timestamp(new Date().getTime()));


                geoManager.saveGEO(geoProvince);
                geoManager.saveGEO(geoDistrict);
                geoManager.saveGEO(geoWard);
                //
                GeoAssoc geoAssocPC = new GeoAssoc();
                geoAssocPC.setGeoId("VN");
                geoAssocPC.setGeoIdTo(geoProvince.getGeoId());
                geoAssocPC.setGeoAssocTypeId("REGIONS");
                geoAssocPC.setCreatedStamp(new Timestamp(new Date().getTime()));

                GeoAssoc geoAssocDP = new GeoAssoc();
                geoAssocPC.setGeoId(geoProvince.getGeoId());
                geoAssocPC.setGeoIdTo(geoDistrict.getGeoId());
                geoAssocPC.setGeoAssocTypeId("REGIONS");
                geoAssocPC.setCreatedStamp(new Timestamp(new Date().getTime()));

                GeoAssoc geoAssocWD = new GeoAssoc();
                geoAssocPC.setGeoId(geoDistrict.getGeoId());
                geoAssocPC.setGeoIdTo(geoWard.getGeoId());
                geoAssocPC.setGeoAssocTypeId("REGIONS");
                geoAssocPC.setCreatedStamp(new Timestamp(new Date().getTime()));


                geoManager.saveGeoAssoc(geoAssocPC);
                geoManager.saveGeoAssoc(geoAssocDP);
                geoManager.saveGeoAssoc(geoAssocWD);

            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String cellToString(Cell cell) {
        int type;
        Object result = new Object();
        if(null != cell){
            type = cell.getCellType();
            switch (type) {

                case 0: // numeric value in Excel
                    result = cell.getNumericCellValue();
                    String str = result.toString();
                    for(int i=0;i<20;i++){
                        if(str.endsWith("E"+i) || str.endsWith("e"+i)){
                            str = str.replace("E"+i,"");  str = str.replace("e"+i,"");
                        }
                    }
                    result = str;
                    break;
                case 1: // String Value in Excel
                    result = cell.getStringCellValue();
                    break;
                default:
                    result = "";
            }
        }
        return result.toString();
    }

}
