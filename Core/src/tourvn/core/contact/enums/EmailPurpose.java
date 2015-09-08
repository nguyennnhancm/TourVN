package tourvn.core.contact.enums;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:19 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public enum EmailPurpose {
    WORK("WORK"),PERSONAL("PERSONAL"),PRIMARY("PRIMARY_EMAIL"),OTHER("OTHER_EMAIL");
    public static final String type="EMAIL_ADDRESS";
    private String purpose;

    private EmailPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getType() {
        return type;
    }

    public String getPurpose() {
        return purpose;
    }
}
