package portal.users.bean;

import portal.utils.BasePortalBean;
import tourvn.core.user.entities.UserLogin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/5/2015
 * Time: 4:06 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@SessionScoped
@ManagedBean(name = "Login")
public class LoginBean extends BasePortalBean {
    String username;
    String password;
    boolean login;
    String message;

    public void init(){
        if (null != getSession() && null != getSession().getAttribute("user_login")) {
            FacesContext context = FacesContext.getCurrentInstance();
            try {
                context.getExternalContext().redirect("/pages/dashboard.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String login(){
        if(validateLoginformInfo(username,password)){
            setMessage("");
            UserLogin userLogin = getUserController().login(username, getEncoding().SHA1(password));
            if (null != userLogin){
                //set link/thư mục cho user bởi quyền truy cập

                getSession().setAttribute("user_login", username);
                FacesContext context = FacesContext.getCurrentInstance();
                try {
                    context.getExternalContext().redirect("/");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else setMessage("* Đăng nhập không thành công!");
        }
        return "";
    }

    public String logout(){
         FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            FacesContext context = FacesContext.getCurrentInstance();
            try {
                context.getExternalContext().redirect("/login.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
        }
        return "/login.xhtml?faces-redirect=true";
    }

    public boolean  validateLoginformInfo(String username, String password){
        boolean validate = true;
        if (username.isEmpty() || username.equals("") || password.isEmpty() || password.equals("")){
            setMessage("* Vui lòng nhập thông tin đăng nhập!");
            validate = false;
        }
        else if (username.length() > 100 || password.length() > 100){
            setMessage("* Thông tin đăng nhập không đúng!");
            validate = false;
        }
        return validate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isLogin() {
        if (null != getSession().getAttribute("user_login")) login = true;
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
