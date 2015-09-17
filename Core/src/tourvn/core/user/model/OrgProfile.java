package tourvn.core.user.model;

import tourvn.core.contact.model.ContactProfile;
import tourvn.core.party.entities.Party;
import tourvn.core.party.entities.PartyAttribute;
import tourvn.core.party.entities.PartyGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 6:32 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class OrgProfile {
    private Party party;
    private PartyGroup partyGroup;
    private PartyAttribute partyAttribute;
    private ContactProfile contactProfile;
    private List<Image> imageList;

    public PartyGroup getPartyGroup() {
        if (null == partyGroup) partyGroup = new PartyGroup();
        return partyGroup;
    }

    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }

    public Party getParty() {
        if (null == party) party = new Party();
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public PartyAttribute getPartyAttribute() {
        if (null == partyAttribute) partyAttribute = new PartyAttribute();
        return partyAttribute;
    }

    public void setPartyAttribute(PartyAttribute partyAttribute) {
        this.partyAttribute = partyAttribute;
    }

    public ContactProfile getContactProfile() {
        if (null == contactProfile) contactProfile = new ContactProfile();
        return contactProfile;
    }

    public void setContactProfile(ContactProfile contactProfile) {
        this.contactProfile = contactProfile;
    }

    public List<Image> getImageList() {
        if (null == imageList) imageList = new ArrayList<Image>();
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}
