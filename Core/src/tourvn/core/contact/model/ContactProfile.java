package tourvn.core.contact.model;

import tourvn.core.contact.entities.ContactMech;
import tourvn.core.contact.entities.PostalAddress;
import tourvn.core.contact.entities.TelecomNumber;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 6:27 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class ContactProfile {
    private ContactMech primaryEmail;
    private TelecomNumber primaryPhoneNumber;
    private TelecomNumber otherPhoneNumber;
    private PostalAddress primaryPostalAddress;

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
}
