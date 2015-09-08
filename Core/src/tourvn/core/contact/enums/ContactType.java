package tourvn.core.contact.enums;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:19 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public enum ContactType {
    ELECTRONIC_ADDRESS("ELECTRONIC_ADDRESS"),
    POSTAL_ADDRESS("POSTAL_ADDRESS"),
    EMAIL_ADDRESS("EMAIL_ADDRESS"),
    TELECOM_NUMBER("TELECOM_NUMBER");
    private String value;

    private ContactType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
