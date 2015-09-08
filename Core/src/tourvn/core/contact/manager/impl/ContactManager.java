package tourvn.core.contact.manager.impl;

import tourvn.core.contact.entities.ContactMech;
import tourvn.core.contact.entities.PostalAddress;
import tourvn.core.contact.entities.TelecomNumber;
import tourvn.core.contact.manager.IContactManager;
import tourvn.core.party.entities.PartyContactMech;
import tourvn.core.party.entities.PartyContactMechPurpose;
import tourvn.core.utils.manager.BaseManager;

import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:03 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "ContactManager")
public class ContactManager extends BaseManager implements IContactManager {
    @Override
    public ContactMech save(ContactMech contactMech) {
        return getEntityManager().merge(contactMech);
    }

    @Override
    public TelecomNumber saveTelecomNumber(TelecomNumber telecomNumber) {
        return getEntityManager().merge(telecomNumber);
    }

    @Override
    public PostalAddress savePostalAddress(PostalAddress postalAddress) {
        return getEntityManager().merge(postalAddress);
    }

    @Override
    public PartyContactMech savePartyContactMech(PartyContactMech partyContactMech) {
        return getEntityManager().merge(partyContactMech);
    }

    @Override
    public PartyContactMechPurpose savePartyContactMechPurpose(PartyContactMechPurpose partyContactMechPurpose) {
        return getEntityManager().merge(partyContactMechPurpose);
    }
}
