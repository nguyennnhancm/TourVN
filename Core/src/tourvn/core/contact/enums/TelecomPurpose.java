package tourvn.core.contact.enums;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:19 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public enum TelecomPurpose {
    HOME("HOME"),WORK("WORK"),MOBILE("MOBILE"),PRIMARY("PRIMARY_PHONE"),OTHER("OTHER_PHONE"),FAX_NUMBER("FAX_NUMBER");
    public static final String type="TELEPHONE_NUMBER";
    private String purpose;

    private TelecomPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getType() {
        return type;
    }

    public String getPurpose() {
        return purpose;
    }
}
