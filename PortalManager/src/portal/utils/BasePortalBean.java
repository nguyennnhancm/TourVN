package portal.utils;


import tourvn.core.geo.controller.IGEOController;
import tourvn.core.party.controller.IPartyController;
import tourvn.core.supplier.ISupplierController;
import tourvn.core.user.controller.IUserController;
import tourvn.core.utils.LookupLocator;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/5/2015
 * Time: 4:25 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public abstract class BasePortalBean {
    protected String tourVNId = "TourVN";
    protected String defaultCountryCode = "VN";
    private IUserController userController;
    private IGEOController geoController;
    private ISupplierController supplierController;
    private IPartyController partyController;
    SHA1Encoding encoding;

    public IUserController getUserController() {
        if (null == userController) userController = LookupLocator.getUserController();
        return userController;
    }

    public IGEOController getGeoController(){
        if (null == geoController) geoController = LookupLocator.getGEOController();
        return geoController;
    }

    public ISupplierController getSupplierController() {
        if (null == supplierController) supplierController = LookupLocator.getSupplierController();
        return supplierController;
    }

    public IPartyController getPartyController() {
        if (null == partyController) partyController = LookupLocator.getPartyController();
        return partyController;
    }

    public void addMessagesInfo(String componentId, String messages) {
        FacesContext.getCurrentInstance().addMessage(componentId, new FacesMessage(FacesMessage.SEVERITY_INFO, messages, null));
    }

    public void addValidateError(String componentId, String validatorMessage) {
        FacesContext.getCurrentInstance().addMessage(componentId, new FacesMessage(FacesMessage.SEVERITY_ERROR, validatorMessage, null));
    }
    public HttpSession getSession(){
        return getRequest().getSession();
    }

    public HttpServletRequest getRequest(){
        FacesContext context = FacesContext.getCurrentInstance();
        return (HttpServletRequest) context.getExternalContext().getRequest();
    }

    public SHA1Encoding getEncoding() {
        if (null == encoding)  encoding = new SHA1Encoding();
        return encoding;
    }

    public void setEncoding(SHA1Encoding encoding) {
        this.encoding = encoding;
    }

}
