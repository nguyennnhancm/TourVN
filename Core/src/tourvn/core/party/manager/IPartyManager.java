package tourvn.core.party.manager;

import tourvn.core.party.entities.Party;
import tourvn.core.party.entities.PartyGroup;
import tourvn.core.party.entities.PartyRelationship;
import tourvn.core.party.entities.PartyRole;

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

//    public List<PartyGroup> getAllSupplierByVendor(String partyId);
}
