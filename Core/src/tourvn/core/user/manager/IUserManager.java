package tourvn.core.user.manager;


import tourvn.core.user.entities.Person;
import tourvn.core.user.entities.UserLogin;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/11/2015
 * Time: 11:39 PM
 * Media Group
 * * To change this template use File | Settings | File Templates.
 */
public interface IUserManager {
    public UserLogin login(String username, String password);

    public Person getPersonById(String partyId);

    public UserLogin getUserLoginByPartyId(String partyId);

    public List<String> getAllStoreByUser(String partyId);

    public Person createPerson(Person person);

    public UserLogin createUserLogin(UserLogin userLogin);
}
