package portal.supplier.bean;

import portal.utils.BasePortalBean;
import tourvn.core.contact.entities.PostalAddress;
import tourvn.core.geo.entities.Geo;
import tourvn.core.user.model.OrgProfile;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/31/2015
 * Time: 2:20 PM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "ManageSupplier")
public class ManageSupplierBean extends BasePortalBean {
    List<OrgProfile> supplierList;
    private String name;
    private String status;
    private String rating;
    private static Geo provinceGEO;
    private static List<Geo> provinceList;
    private static List<Geo> districtList;
    private PostalAddress postalAddress;

    @PostConstruct
    public void init() {
        if (null == provinceList) {
            Geo country = getGeoController().getGeoById(defaultCountryCode);
            provinceList = new ArrayList<Geo>(getGeoController().getGEOByAssoc(country.getGeoId(), "REGIONS"));
        }
    }


    public void processValueChange() {
        provinceGEO = getGeoController().getGeoById(getPostalAddress().getStateProvinceGeoId());
        if (null != provinceGEO) {
            districtList = new ArrayList<Geo>(getGeoController().getGEOByAssoc(provinceGEO.getGeoId(), "REGIONS"));
        } else {
            districtList.removeAll(districtList);
        }
    }

    public List<Geo> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<Geo> provinceList) {
        this.provinceList = provinceList;
    }

    public List<Geo> getDistrictList() {
        if (null == districtList) districtList = new ArrayList<Geo>();
//        if (null == getUserProfile().getOrgProfile().getContactProfile().getPrimaryPostalAddress().getStateProvinceGeoId()) districtList.clear();
        return districtList;
    }

    public void setDistrictList(List<Geo> districtList) {
        this.districtList = districtList;
    }

    public PostalAddress getPostalAddress() {
        if (null == postalAddress) postalAddress = new PostalAddress();
        return postalAddress;
    }

    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    public static Geo getProvinceGEO() {
        return provinceGEO;
    }

    public static void setProvinceGEO(Geo provinceGEO) {
        provinceGEO = provinceGEO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public List<OrgProfile> getSupplierList() {
        //
        supplierList = getSupplierController().getAllSupplierByVendor(tourVNId);
        return supplierList;
    }

    public void setSupplierList(List<OrgProfile> supplierList) {
        this.supplierList = supplierList;
    }
}
