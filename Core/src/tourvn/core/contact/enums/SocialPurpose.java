package tourvn.core.contact.enums;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:19 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public enum SocialPurpose {
    FACEBOOK("FACEBOOK"),
    YAHOO("YAHOO"),
    TWITTER("TWITTER"),
    GOOGLE_PLUS("GOOGLE_PLUS"),
    HOTMAIL("HOTMAIL"),
    LINKEDIN("LINKEDIN");
    public static final String type="SOCIAL_ACCOUNT";
    private String purpose;

    private SocialPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }
}
