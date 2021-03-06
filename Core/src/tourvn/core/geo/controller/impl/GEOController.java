package tourvn.core.geo.controller.impl;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import tourvn.core.geo.controller.IGEOController;
import tourvn.core.geo.entities.Geo;
import tourvn.core.geo.entities.GeoAssoc;
import tourvn.core.utils.controller.BaseController;

import javax.ejb.Stateless;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:09 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "GEOController")
public class GEOController extends BaseController implements IGEOController {
    @Override
    public Geo getGeoById(String geoId) {
        return getGeoManager().getGeoById(geoId);
    }

    @Override
    public List<Geo> getGEOByAssoc(String parentId, String assocTypeId) {
        return getGeoManager().getGeoByAssoc(parentId, assocTypeId);
    }

    public void importGeo(){
        String path = "D:\\temp\\Danh_Sach_Cap_Xa.xls";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet sheet = workbook.getSheet("Sheet1");
            Iterator<Row> rowIterator = sheet.rowIterator();

            Geo geoVN = new Geo();
            geoVN.setGeoId("VN");
            geoVN.setGeoTypeId("COUNTRY");
            geoVN.setGeoName("Việt Nam");
            geoVN.setGeoCode("VN");
            geoVN.setCreatedStamp(new Timestamp(new Date().getTime()));
            getGeoManager().saveGEO(geoVN);
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
                geoWard.setGeoTypeId("WARD");
                geoWard.setGeoName(cellToString(wardName));
                geoWard.setWellKnownText(cellToString(wardLevel));
                geoWard.setCreatedStamp(new Timestamp(new Date().getTime()));


                getGeoManager().saveGEO(geoProvince);
                getGeoManager().saveGEO(geoDistrict);
                getGeoManager().saveGEO(geoWard);
                //
                GeoAssoc geoAssocPC = new GeoAssoc();
                geoAssocPC.setGeoId("VN");
                geoAssocPC.setGeoIdTo(geoProvince.getGeoId());
                geoAssocPC.setGeoAssocTypeId("REGIONS");
                geoAssocPC.setCreatedStamp(new Timestamp(new Date().getTime()));

                GeoAssoc geoAssocDP = new GeoAssoc();
                geoAssocDP.setGeoId(geoProvince.getGeoId());
                geoAssocDP.setGeoIdTo(geoDistrict.getGeoId());
                geoAssocDP.setGeoAssocTypeId("REGIONS");
                geoAssocDP.setCreatedStamp(new Timestamp(new Date().getTime()));

                GeoAssoc geoAssocWD = new GeoAssoc();
                geoAssocWD.setGeoId(geoDistrict.getGeoId());
                geoAssocWD.setGeoIdTo(geoWard.getGeoId());
                geoAssocWD.setGeoAssocTypeId("REGIONS");
                geoAssocWD.setCreatedStamp(new Timestamp(new Date().getTime()));


                getGeoManager().saveGeoAssoc(geoAssocPC);
                getGeoManager().saveGeoAssoc(geoAssocDP);
                getGeoManager().saveGeoAssoc(geoAssocWD);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String cellToString(Cell cell) {
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
