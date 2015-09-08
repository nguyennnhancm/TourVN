package tourvn.core.party.controller;

import tourvn.core.party.entities.PartyRelationship;
import tourvn.core.party.entities.PartyRole;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 10:13 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public interface IPartyController {
    public PartyRole createPartyRole(PartyRole partyRole);
    public void createPartyRelationship(PartyRelationship partyRelationship);
}
