package tourvn.core.contact.controller;

import tourvn.core.contact.entities.ContactMech;
import tourvn.core.contact.entities.PostalAddress;
import tourvn.core.contact.entities.TelecomNumber;
import tourvn.core.party.entities.Party;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:04 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public interface IContactController {
    public ContactMech createPrimaryEmail(Party party, ContactMech contactMech);

    public TelecomNumber createPrimaryTelephoneNumber(Party party, TelecomNumber telephoneNumber);

    public PostalAddress createPostalAddress(Party party, PostalAddress postalAddress);

    public TelecomNumber createOtherTelecomNumber(Party party, TelecomNumber telecomNumber, String telecomNumberPurpose);
}
