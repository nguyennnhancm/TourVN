package tourvn.core.contact.enums;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:19 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public enum AddressPurpose {
    WORK("WORK"), HOME("HOME"), PERSONAL("PERSONAL"), BILLING("BILLING"), DELIVERY("DELIVERY"), PRIMARY("PRIMARY_ADDRESS"), OTHER("OTHER_ADDRESS");
    public static final String type = "POSTAL_ADDRESS";
    private String purpose;

    private AddressPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getType() {
        return type;
    }

    public String getPurpose() {
        return purpose;
    }
}
