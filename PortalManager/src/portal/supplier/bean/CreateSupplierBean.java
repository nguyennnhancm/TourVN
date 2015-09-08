package portal.supplier.bean;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.TabChangeEvent;
import portal.utils.BasePortalBean;
import tourvn.core.contact.entities.ContactMech;
import tourvn.core.contact.entities.PostalAddress;
import tourvn.core.contact.entities.TelecomNumber;
import tourvn.core.geo.entities.Geo;
import tourvn.core.party.entities.PartyGroup;
import tourvn.core.user.entities.UserLogin;
import tourvn.core.user.model.UserProfile;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/31/2015
 * Time: 2:10 PM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "CreateSupplier")
public class CreateSupplierBean extends BasePortalBean{

    private UserProfile userProfile;
    private static Geo provinceGEO;
    private static List<Geo> provinceList;
    private static List<Geo> districtList;
    private UserLogin userLogin;
    private PartyGroup partyGroup;
    private ContactMech primaryEmail;
    private TelecomNumber primaryPhoneNumber;
    private TelecomNumber otherPhoneNumber;
    private PostalAddress primaryPostalAddress;
    private String rePassword;

    @PostConstruct
    public void init() {
        if (null == provinceList) {
            Geo country = getGeoController().getGeoById(defaultCountryCode);
            provinceList = new ArrayList<Geo>(getGeoController().getGEOByAssoc(country.getGeoId(), "REGIONS"));
        }
    }

    public String createNewSupplier(){
        //validate
        getUserProfile().setUserLogin(userLogin);
        userProfile.getUserLogin().setCurrentPassword(getEncoding().SHA1(userLogin.getCurrentPassword()));
        userProfile.getOrgProfile().setPartyGroup(partyGroup);
        userProfile.getOrgProfile().getContactProfile().setPrimaryEmail(primaryEmail);
        userProfile.getOrgProfile().getContactProfile().setPrimaryPhoneNumber(primaryPhoneNumber);
        userProfile.getOrgProfile().getContactProfile().setPrimaryPostalAddress(primaryPostalAddress);
        userProfile.getOrgProfile().getContactProfile().setOtherPhoneNumber(otherPhoneNumber);
        getSupplierController().createSupplier(tourVNId, userProfile);
        //
        RequestContext.getCurrentInstance().execute("PF('addSupplier').hide();");
        return "";
    }

    public Integer selectedTabIndex = 0;

    public Integer getSelectedTabIndex() {
        return selectedTabIndex;
    }

    public void setSelectedTabIndex(Integer selectedTabIndex) {
        this.selectedTabIndex = selectedTabIndex;
    }

    public void onTabChange(TabChangeEvent event) {
        try {
            selectedTabIndex = Integer.parseInt((String) event.getTab().getAttributes().get("tabIndex"));
        } catch (Exception e) {
            selectedTabIndex = 0;
        }
    }

    public void processValueChange() {
        provinceGEO = getGeoController().getGeoById(getPrimaryPostalAddress().getStateProvinceGeoId());
        if (null != provinceGEO) {
            districtList = new ArrayList<Geo>(getGeoController().getGEOByAssoc(provinceGEO.getGeoId(), "REGIONS"));
        } else {
            districtList.removeAll(districtList);
        }
    }

    public synchronized void handleFileUpload(FileUploadEvent event) {

    }

    public List<Geo> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<Geo> provinceList) {
        this.provinceList = provinceList;
    }

    public List<Geo> getDistrictList() {
        if (null == districtList) districtList = new ArrayList<Geo>();
        return districtList;
    }

    public void setDistrictList(List<Geo> districtList) {
        this.districtList = districtList;
    }

    public static Geo getProvinceGEO() {
        return provinceGEO;
    }

    public static void setProvinceGEO(Geo provinceGEO) {
        CreateSupplierBean.provinceGEO = provinceGEO;
    }

    public String getDefaultCountryCode() {
        return defaultCountryCode;
    }

    public void setDefaultCountryCode(String defaultCountryCode) {
        this.defaultCountryCode = defaultCountryCode;
    }

    public UserProfile getUserProfile() {
        if (null == userProfile) userProfile = new UserProfile();
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public PartyGroup getPartyGroup() {
        if (null == partyGroup) partyGroup = new PartyGroup();
        return partyGroup;
    }

    public UserLogin getUserLogin() {
        if (null == userLogin) userLogin = new UserLogin();
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }

    public ContactMech getPrimaryEmail() {
        if (null == primaryEmail) primaryEmail = new ContactMech();
        return primaryEmail;
    }

    public void setPrimaryEmail(ContactMech primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public TelecomNumber getPrimaryPhoneNumber() {
        if (null == primaryPhoneNumber) primaryPhoneNumber = new TelecomNumber();
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(TelecomNumber primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public TelecomNumber getOtherPhoneNumber() {
        if (null == otherPhoneNumber) otherPhoneNumber = new TelecomNumber();
        return otherPhoneNumber;
    }

    public void setOtherPhoneNumber(TelecomNumber otherPhoneNumber) {
        this.otherPhoneNumber = otherPhoneNumber;
    }

    public PostalAddress getPrimaryPostalAddress() {
        if (null == primaryPostalAddress) primaryPostalAddress = new PostalAddress();
        return primaryPostalAddress;
    }

    public void setPrimaryPostalAddress(PostalAddress primaryPostalAddress) {
        this.primaryPostalAddress = primaryPostalAddress;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
