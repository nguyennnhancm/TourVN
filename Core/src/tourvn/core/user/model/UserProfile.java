package tourvn.core.user.model;

import tourvn.core.contact.model.ContactProfile;
import tourvn.core.user.entities.Person;
import tourvn.core.user.entities.UserLogin;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 6:15 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class UserProfile {
    private Person person;
    private UserLogin userLogin;
    private ContactProfile contactProfile;
    private OrgProfile orgProfile; // hiện 1 user chỉ cho thuộc 1 org với role org là TOUR_VN_COMPANY , TOUR_VN_SUPPLIER.

    public Person getPerson() {
        if (null == person) person = new Person();
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public UserLogin getUserLogin() {
        if (null == userLogin) userLogin = new UserLogin();
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public ContactProfile getContactProfile() {
        if (null == contactProfile) contactProfile = new ContactProfile();
        return contactProfile;
    }

    public void setContactProfile(ContactProfile contactProfile) {
        this.contactProfile = contactProfile;
    }

    public OrgProfile getOrgProfile() {
        if (null == orgProfile) orgProfile = new OrgProfile();
        return orgProfile;
    }

    public void setOrgProfile(OrgProfile orgProfile) {
        this.orgProfile = orgProfile;
    }
}
