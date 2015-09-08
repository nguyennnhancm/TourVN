package tourvn.core.user.manager.impl;

import tourvn.core.user.entities.Person;
import tourvn.core.user.entities.UserLogin;
import tourvn.core.user.manager.IUserManager;
import tourvn.core.utils.manager.BaseManager;

import javax.ejb.Stateless;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/11/2015
 * Time: 11:39 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class UserManager extends BaseManager implements IUserManager {
    @Override
    public UserLogin login(String username, String password) {
        Query query = getEntityManager().createQuery("select u from UserLogin u where u.id=:username and u.currentPassword=:password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        try {
            return (UserLogin) query.getSingleResult();
        }catch (Exception e){
            logger.info(username + " login false;");
            return null;
        }
    }

    @Override
    public Person getPersonById(String partyId) {
        Query query = getEntityManager().createQuery("select p from Person p where p.partyId=:partyId");
        query.setParameter("partyId", partyId);
        try {
            return (Person) query.getSingleResult();
        }catch (Exception e){
            logger.info("person not exist " + partyId);
            return null;
        }
    }

    @Override
    public UserLogin getUserLoginByPartyId(String partyId) {
        Query query = getEntityManager().createQuery("select p from UserLogin p where p.partyId=:partyId");
        query.setParameter("partyId", partyId);
        try {
            return (UserLogin) query.getSingleResult();
        }catch (Exception e){
            logger.info("person not exist " + partyId);
            return null;
        }
    }

    @Override
    public List<String> getAllStoreByUser(String partyId) {
        Query query = getEntityManager().createQuery("select s.productStoreId from ProductStoreRole s where s.partyId=:partyId and s.roleTypeId=:roleTypeId");
        query.setParameter("partyId", partyId);
        query.setParameter("roleTypeId", "ADMIN_NEWS");
        return query.getResultList();
    }

    @Override
    public Person createPerson(Person person) {
        return null;
    }

    @Override
    public UserLogin createUserLogin(UserLogin userLogin) {
        return null;
    }
}
