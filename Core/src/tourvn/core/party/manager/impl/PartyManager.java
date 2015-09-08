package tourvn.core.party.manager.impl;

import tourvn.core.party.entities.Party;
import tourvn.core.party.entities.PartyGroup;
import tourvn.core.party.entities.PartyRelationship;
import tourvn.core.party.entities.PartyRole;
import tourvn.core.party.manager.IPartyManager;
import tourvn.core.utils.manager.BaseManager;

import javax.ejb.Stateless;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 11:41 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "PartyManager")
public class PartyManager extends BaseManager implements IPartyManager {
    @Override
    public PartyGroup getPartyGroupById(String partyId) {
        return getEntityManager().find(PartyGroup.class, partyId);
    }

    @Override
    public List<PartyRelationship> getAllSupplier(String partyIdFrom, String roleTypeIdFrom, String roleTypeIdTo) {
        Query query = getEntityManager().createQuery("select pr from PartyRelationship  pr where pr.partyIdFrom=:partyIdFrom and " +
                "pr.roleTypeIdFrom=:roleTypeIdFrom and pr.roleTypeIdTo=:roleTypeIdTo");
        query.setParameter("partyIdFrom",partyIdFrom);
        query.setParameter("roleTypeIdFrom",roleTypeIdFrom);
        query.setParameter("roleTypeIdTo",roleTypeIdTo);
        return query.getResultList();
    }

    @Override
    public Party save(Party party) {
        return getEntityManager().merge(party);
    }

    @Override
    public PartyGroup save(PartyGroup partyGroup) {
        return getEntityManager().merge(partyGroup);
    }

    @Override
    public PartyRole save(PartyRole partyRole) {
        return getEntityManager().merge(partyRole);
    }

    @Override
    public void save(PartyRelationship partyRelationship) {
         getEntityManager().persist(partyRelationship);
    }

//    @Override
//    public List<PartyGroup> getAllSupplierByVendor(String partyId) {
//        Query query = getEntityManager().createQuery("select pg from PartyGroup pg, PartyRelationship pr where " +
//                "pg.partyId=pr.partyIdTo and pr.partyIdFrom=:partyIdFrom " +
//                "and pr.roleTypeIdFrom='TOUR_VN_COMPANY' and pr.roleTypeIdTo='TOUR_VN_SUPPLIER'");
//        query.setParameter("partyIdFrom", partyId);
//        return query.getResultList();
//    }
}
