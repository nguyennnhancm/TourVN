package tourvn.core.contact.controller.impl;

import tourvn.core.contact.controller.IContactController;
import tourvn.core.contact.entities.ContactMech;
import tourvn.core.contact.entities.PostalAddress;
import tourvn.core.contact.entities.TelecomNumber;
import tourvn.core.contact.enums.AddressPurpose;
import tourvn.core.contact.enums.ContactType;
import tourvn.core.contact.enums.EmailPurpose;
import tourvn.core.contact.enums.TelecomPurpose;
import tourvn.core.party.entities.Party;
import tourvn.core.party.entities.PartyContactMech;
import tourvn.core.party.entities.PartyContactMechPurpose;
import tourvn.core.utils.controller.BaseController;

import javax.ejb.Stateless;
import java.sql.Timestamp;
import java.util.Date;


/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:04 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "ContactController")
public class ContactController extends BaseController implements IContactController {
    @Override
    public ContactMech createPrimaryEmail(Party party, ContactMech contactMech) {
        //save contactmech
        String contacmechId = getSequenceValue().getSequenceValueItem(ContactMech.class);
        contactMech.setContactMechId(contacmechId);
        contactMech.setContactMechTypeId(ContactType.EMAIL_ADDRESS.getValue());
        getContactManager().save(contactMech);
        //save party contactmech
        PartyContactMech partyContactMech = new PartyContactMech();
        partyContactMech.setPartyId(party.getPartyId());
        partyContactMech.setContactMechId(contacmechId);
        partyContactMech.setThruDate(new Timestamp(new Date().getTime()));
        //save party contactmech purpose
        PartyContactMechPurpose partyContactMechPurpose = new PartyContactMechPurpose();
        partyContactMechPurpose.setContactMechId(contacmechId);
        partyContactMechPurpose.setPartyId(party.getPartyId());
        partyContactMechPurpose.setContactMechPurposeTypeId(EmailPurpose.PRIMARY.getPurpose());
        partyContactMechPurpose.setThruDate(new Timestamp(new Date().getTime()));
        return contactMech;
    }

    @Override
    public TelecomNumber createPrimaryTelephoneNumber(Party party, TelecomNumber telecomNumber) {
        //save contactmech
        ContactMech contactMech = new ContactMech();
        String contacmechId = getSequenceValue().getSequenceValueItem(ContactMech.class);
        contactMech.setContactMechId(contacmechId);
        contactMech.setContactMechTypeId(ContactType.TELECOM_NUMBER.getValue());
        getContactManager().save(contactMech);
        //save TelecomNumber
        telecomNumber.setContactMechId(contacmechId);
        getContactManager().saveTelecomNumber(telecomNumber);
        //save party contactmech
        PartyContactMech partyContactMech = new PartyContactMech();
        partyContactMech.setPartyId(party.getPartyId());
        partyContactMech.setContactMechId(contacmechId);
        partyContactMech.setThruDate(new Timestamp(new Date().getTime()));
        //save party contactmech purpose
        PartyContactMechPurpose partyContactMechPurpose = new PartyContactMechPurpose();
        partyContactMechPurpose.setContactMechId(contacmechId);
        partyContactMechPurpose.setPartyId(party.getPartyId());
        partyContactMechPurpose.setContactMechPurposeTypeId(TelecomPurpose.PRIMARY.getPurpose());
        partyContactMechPurpose.setThruDate(new Timestamp(new Date().getTime()));
        return telecomNumber;
    }

    @Override
    public PostalAddress createPostalAddress(Party party, PostalAddress postalAddress) {
        //save contactmech
        ContactMech contactMech = new ContactMech();
        String contacmechId = getSequenceValue().getSequenceValueItem(ContactMech.class);
        contactMech.setContactMechId(contacmechId);
        contactMech.setContactMechTypeId(ContactType.POSTAL_ADDRESS.getValue());
        getContactManager().save(contactMech);
        //save PostalAddress
        postalAddress.setContactMechId(contacmechId);
        getContactManager().savePostalAddress(postalAddress);
        //save party contactmech
        PartyContactMech partyContactMech = new PartyContactMech();
        partyContactMech.setPartyId(party.getPartyId());
        partyContactMech.setContactMechId(contacmechId);
        partyContactMech.setThruDate(new Timestamp(new Date().getTime()));
        //save party contactmech purpose
        PartyContactMechPurpose partyContactMechPurpose = new PartyContactMechPurpose();
        partyContactMechPurpose.setContactMechId(contacmechId);
        partyContactMechPurpose.setPartyId(party.getPartyId());
        partyContactMechPurpose.setContactMechPurposeTypeId(AddressPurpose.PRIMARY.getPurpose());
        partyContactMechPurpose.setThruDate(new Timestamp(new Date().getTime()));
        return postalAddress;
    }

    @Override
    public TelecomNumber createOtherTelecomNumber(Party party, TelecomNumber telecomNumber, String telecomNumberPurpose) {
        //save contactmech
        ContactMech contactMech = new ContactMech();
        String contacmechId = getSequenceValue().getSequenceValueItem(ContactMech.class);
        contactMech.setContactMechId(contacmechId);
        contactMech.setContactMechTypeId(ContactType.TELECOM_NUMBER.getValue());
        getContactManager().save(contactMech);
        //save TelecomNumber
        telecomNumber.setContactMechId(contacmechId);
        getContactManager().saveTelecomNumber(telecomNumber);
        //save party contactmech
        PartyContactMech partyContactMech = new PartyContactMech();
        partyContactMech.setPartyId(party.getPartyId());
        partyContactMech.setContactMechId(contacmechId);
        partyContactMech.setThruDate(new Timestamp(new Date().getTime()));
        //save party contactmech purpose
        PartyContactMechPurpose partyContactMechPurpose = new PartyContactMechPurpose();
        partyContactMechPurpose.setContactMechId(contacmechId);
        partyContactMechPurpose.setPartyId(party.getPartyId());
        partyContactMechPurpose.setContactMechPurposeTypeId(telecomNumberPurpose);
        partyContactMechPurpose.setThruDate(new Timestamp(new Date().getTime()));
        return telecomNumber;
    }
}
