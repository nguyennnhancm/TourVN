package tourvn.core.user.controller.impl;


import tourvn.core.user.controller.IUserController;
import tourvn.core.user.entities.UserLogin;
import tourvn.core.user.model.UserProfile;
import tourvn.core.utils.controller.BaseController;

import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/11/2015
 * Time: 11:42 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class UserController extends BaseController implements IUserController {
    @Override
    public UserLogin login(String username, String password) {
        return getUserManager().login(username, password);
    }

    @Override
    public UserProfile getUserProfileById(String partyId) {
        //get person
        //get user login
        //get contact profile

        return null;
    }

}
