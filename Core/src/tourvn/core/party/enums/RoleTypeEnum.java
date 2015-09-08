package tourvn.core.party.enums;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:19 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public enum RoleTypeEnum {
    ADMIN_SUPPLIER("ADMIN_SUPPLIER"),
    TOUR_VN_SUPPLIER("TOUR_VN_SUPPLIER"),
    TOUR_VN_COMPANY("TOUR_VN_COMPANY");
    private String value;

    private RoleTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
