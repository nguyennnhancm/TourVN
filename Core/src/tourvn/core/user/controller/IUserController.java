package tourvn.core.user.controller;


import tourvn.core.user.entities.UserLogin;
import tourvn.core.user.model.UserProfile;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/11/2015
 * Time: 11:41 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public interface IUserController {
    public UserLogin login(String username, String password);

    public UserProfile getUserProfileById(String partyId);



}
