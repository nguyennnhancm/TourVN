package tourvn.core.party.controller.impl;

import tourvn.core.party.controller.IPartyController;
import tourvn.core.party.entities.PartyRelationship;
import tourvn.core.party.entities.PartyRole;
import tourvn.core.utils.controller.BaseController;

import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 11:40 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "PartyController")
public class PartyController extends BaseController implements IPartyController {

    @Override
    public PartyRole createPartyRole(PartyRole partyRole) {
        return getPartyManager().save(partyRole);
    }

    @Override
    public void createPartyRelationship(PartyRelationship partyRelationship) {
         getPartyManager().save(partyRelationship);
    }
}
