package tourvn.core.party.manager;

import tourvn.core.party.entities.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:12 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public interface IPartyManager {

    public PartyGroup getPartyGroupById(String partyId);

    public List<PartyRelationship> getAllSupplier(String partyIdFrom, String roleTypeIdFrom, String roleTypeIdTo);

    public Party save(Party party);

    public PartyGroup save(PartyGroup partyGroup);

    public PartyRole save(PartyRole partyRole);

    public void save(PartyRelationship partyRelationship);

    public PartyAttribute save(PartyAttribute partyAttribute);

    public List<PartyContactMechPurpose> getAllPartyContactmechPurpose(String partyId);

//    public List<PartyGroup> getAllSupplierByVendor(String partyId);
}
