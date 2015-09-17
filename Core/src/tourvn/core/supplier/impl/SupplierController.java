package tourvn.core.supplier.impl;

import tourvn.core.contact.enums.AddressPurpose;
import tourvn.core.contact.enums.EmailPurpose;
import tourvn.core.contact.enums.TelecomPurpose;
import tourvn.core.contact.model.ContactProfile;
import tourvn.core.party.entities.*;
import tourvn.core.party.enums.RoleTypeEnum;
import tourvn.core.supplier.ISupplierController;
import tourvn.core.user.entities.UserLogin;
import tourvn.core.user.model.OrgProfile;
import tourvn.core.user.model.UserProfile;
import tourvn.core.utils.controller.BaseController;

import javax.ejb.Stateless;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/31/2015
 * Time: 7:59 PM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "SupplierController")
public class SupplierController extends BaseController implements ISupplierController {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public UserProfile createSupplier(String partyVendor, UserProfile userProfile, OrgProfile orgProfile) {
        //tạo party
        String partyId = getSequenceValue().getSequenceValueItem(Party.class);
        orgProfile.getParty().setPartyId(partyId);
        orgProfile.getParty().setPartyTypeId("PARTY_GROUP");
        orgProfile.getParty().setCreatedDate(new Timestamp(new Date().getTime()));
        getPartyManager().save(orgProfile.getParty());
        //lưu party group
        orgProfile.getPartyGroup().setPartyId(partyId);
        getPartyManager().save(orgProfile.getPartyGroup());
        ////Save Rating
        orgProfile.getPartyAttribute().setPartyId(partyId);
        getPartyManager().save(orgProfile.getPartyAttribute());
        // Save images
            if (orgProfile.getImageList().size() > 0){
                //Tạo partyContent với type là image
                //Tạo content
            }
        //party role
        PartyRole partyRole = new PartyRole();
        partyRole.setPartyId(partyId);
        partyRole.setRoleTypeId(RoleTypeEnum.TOUR_VN_SUPPLIER.getValue());
        getPartyManager().save(partyRole);
        //contactmech(email, sdt, address)
        //primary email
        getContactController().createPrimaryEmail(orgProfile.getParty(), orgProfile.getContactProfile().getPrimaryEmail());
        //primary phone number
        getContactController().createPrimaryTelephoneNumber(orgProfile.getParty(), orgProfile.getContactProfile().getPrimaryPhoneNumber());
        //primary address
        getContactController().createPostalAddress(orgProfile.getParty(), orgProfile.getContactProfile().getPrimaryPostalAddress());
        //other phone number
        getContactController().createOtherTelecomNumber(orgProfile.getParty(), orgProfile.getContactProfile().getPrimaryPhoneNumber(), TelecomPurpose.OTHER.getPurpose());

        //party userlogin
        String partyIdUserLogin = getSequenceValue().getSequenceValueItem(Party.class);
        Party partyUserLogin = new Party();
        partyUserLogin.setPartyId(partyIdUserLogin);
        partyUserLogin.setPartyTypeId("PERSON");
        partyUserLogin.setCreatedDate(new Timestamp(new Date().getTime()));
        getPartyManager().save(partyUserLogin);
        //userlogin
        UserLogin userLogin = userProfile.getUserLogin();
        userLogin.setPartyId(partyIdUserLogin);
        userLogin.setEnabled("Y");
        getUserManager().createUserLogin(userLogin);
        //user role
        PartyRole partyRoleUserLogin = new PartyRole();
        partyRoleUserLogin.setPartyId(partyIdUserLogin);
        partyRoleUserLogin.setRoleTypeId(RoleTypeEnum.ADMIN_SUPPLIER.getValue());
        getPartyManager().save(partyRoleUserLogin);
        //partyrelationship supplier - userlogin
        PartyRelationship partyRelationship = new PartyRelationship();
        partyRelationship.setPartyIdFrom(partyId);
        partyRelationship.setPartyIdTo(partyIdUserLogin);
        partyRelationship.setRoleTypeIdFrom(RoleTypeEnum.TOUR_VN_SUPPLIER.getValue());
        partyRelationship.setRoleTypeIdTo(RoleTypeEnum.ADMIN_SUPPLIER.getValue());
        partyRelationship.setFromDate(new Timestamp(new Date().getTime()));
        getPartyManager().save(partyRelationship);
//        partyrelationship site manager - supplier
        PartyRelationship partyRelationshipVendor = new PartyRelationship();
        partyRelationshipVendor.setPartyIdFrom(partyVendor);
        partyRelationshipVendor.setPartyIdTo(partyId);
        partyRelationshipVendor.setRoleTypeIdFrom(RoleTypeEnum.TOUR_VN_COMPANY.getValue());
        partyRelationshipVendor.setRoleTypeIdTo(RoleTypeEnum.TOUR_VN_SUPPLIER.getValue());
        partyRelationshipVendor.setFromDate(new Timestamp(new Date().getTime()));
        getPartyManager().save(partyRelationshipVendor);
//        load UserProfile

        return userProfile;
    }

    @Override
    public List<OrgProfile> getAllSupplierByVendor(String partyId) {
        //get all supplier
        List<PartyRelationship> partyRelationshipList = getPartyManager().getAllSupplier(partyId, RoleTypeEnum.TOUR_VN_COMPANY.getValue(),
                RoleTypeEnum.TOUR_VN_SUPPLIER.getValue());
        if (null != partyRelationshipList) {
            List<OrgProfile> orgProfileList = new ArrayList<OrgProfile>();
            for (PartyRelationship partyRelationship : partyRelationshipList) {
                orgProfileList.add(getOrgProfileById(partyRelationship.getPartyIdTo()));
            }
            return orgProfileList;
        }
        logger.warning(SupplierController.class + partyId + " find not supplier!!!!!!!!!");
        return new ArrayList<OrgProfile>();
    }

    public OrgProfile getOrgProfileById(String partyId) {
        OrgProfile orgProfile = new OrgProfile();
        //partyGroup
        orgProfile.setPartyGroup(getPartyManager().getPartyGroupById(partyId));
        // Contact
        ContactProfile contactProfile = new ContactProfile();
        for (PartyContactMechPurpose partyContactMechPurpose : getPartyManager().getAllPartyContactmechPurpose(partyId)) {
            //get email
            if (partyContactMechPurpose.getContactMechPurposeTypeId().equals(EmailPurpose.PRIMARY.getPurpose())) {
                contactProfile.setPrimaryEmail(getContactManager().getContactmech(partyContactMechPurpose.getContactMechId()));
            } else if (partyContactMechPurpose.getContactMechPurposeTypeId().equals(TelecomPurpose.PRIMARY.getPurpose())){
            //get phone
                contactProfile.setPrimaryPhoneNumber(getContactManager().getTeleComNumber(partyContactMechPurpose.getContactMechId()));
            }else if (partyContactMechPurpose.getContactMechPurposeTypeId().equals(TelecomPurpose.OTHER.getPurpose())){
                // get other phone
                contactProfile.setOtherPhoneNumber(getContactManager().getTeleComNumber(partyContactMechPurpose.getContactMechId()));
            }else if (partyContactMechPurpose.getContactMechPurposeTypeId().equals(AddressPurpose.PRIMARY.getPurpose())){
                // get address
                contactProfile.setPrimaryPostalAddress(getContactManager().getPostalAddress(partyContactMechPurpose.getContactMechId()));
            }
        }
        orgProfile.setContactProfile(contactProfile);
        return orgProfile;
    }

}
