package tourvn.core.supplier.impl;

import tourvn.core.contact.enums.TelecomPurpose;
import tourvn.core.party.entities.Party;
import tourvn.core.party.entities.PartyGroup;
import tourvn.core.party.entities.PartyRelationship;
import tourvn.core.party.entities.PartyRole;
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
    public UserProfile createSupplier(String partyVendor, UserProfile userProfile) {
        //tạo party
        String partyId = getSequenceValue().getSequenceValueItem(Party.class);
        Party party = new Party();
        party.setPartyId(partyId);
        party.setPartyTypeId("PARTY_GROUP");
        party.setCreatedDate(new Timestamp(new Date().getTime()));
        getPartyManager().save(party);
        //lưu party group
        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyId(partyId);
        partyGroup.setGroupName(userProfile.getOrgProfile().getPartyGroup().getGroupName());
        getPartyManager().save(partyGroup);
        //party role
        PartyRole partyRole = new PartyRole();
        partyRole.setPartyId(partyId);
        partyRole.setRoleTypeId("TOUR_VN_SUPPLIER");
        getPartyManager().save(partyRole);
        //contactmech(email, sdt, address)
            //primary email
        getContactController().createPrimaryEmail(party, userProfile.getContactProfile().getPrimaryEmail());
            //primary phone number
        getContactController().createPrimaryTelephoneNumber(party, userProfile.getContactProfile().getPrimaryPhoneNumber());
            //primary address
        getContactController().createPostalAddress(party, userProfile.getContactProfile().getPrimaryPostalAddress());
            //other phone number
        getContactController().createOtherTelecomNumber(party, userProfile.getContactProfile().getPrimaryPhoneNumber(), TelecomPurpose.OTHER.getPurpose());

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
        if (null != partyRelationshipList){
            List<OrgProfile> orgProfileList = new ArrayList<OrgProfile>();
            for (PartyRelationship partyRelationship: partyRelationshipList){
                OrgProfile orgProfile = new OrgProfile();
                //partyGroup
                orgProfile.setPartyGroup(getPartyManager().getPartyGroupById(partyRelationship.getPartyIdTo()));
                // Contact
               orgProfileList.add(orgProfile);
            }
            return orgProfileList;
        }
        logger.warning(SupplierController.class + partyId + " find not supplier!!!!!!!!!");
        return new ArrayList<OrgProfile>();
    }

}
