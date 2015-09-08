package tourvn.core.user.model;

import tourvn.core.contact.model.ContactProfile;
import tourvn.core.party.entities.PartyGroup;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 6:32 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class OrgProfile {
    private PartyGroup partyGroup;
    private ContactProfile contactProfile;

    public PartyGroup getPartyGroup() {
        if (null == partyGroup) partyGroup = new PartyGroup();
        return partyGroup;
    }

    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }

    public ContactProfile getContactProfile() {
        if (null == contactProfile) contactProfile = new ContactProfile();
        return contactProfile;
    }

    public void setContactProfile(ContactProfile contactProfile) {
        this.contactProfile = contactProfile;
    }
}
