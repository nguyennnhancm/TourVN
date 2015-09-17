package tourvn.core.contact.manager;

import tourvn.core.contact.entities.ContactMech;
import tourvn.core.contact.entities.PostalAddress;
import tourvn.core.contact.entities.TelecomNumber;
import tourvn.core.party.entities.PartyContactMech;
import tourvn.core.party.entities.PartyContactMechPurpose;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:02 PM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
public interface IContactManager {

    public ContactMech save(ContactMech contactMech);

    public TelecomNumber saveTelecomNumber(TelecomNumber telecomNumber);

    public PostalAddress savePostalAddress(PostalAddress postalAddress);

    public PartyContactMech savePartyContactMech(PartyContactMech partyContactMech);

    public PartyContactMechPurpose savePartyContactMechPurpose(PartyContactMechPurpose partyContactMechPurpose);

    public ContactMech getContactmech(String contacmechId);

    public TelecomNumber getTeleComNumber(String contactmechId);

    public PostalAddress getPostalAddress(String contactmechId);
}
