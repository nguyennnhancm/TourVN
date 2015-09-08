package tourvn.core.utils;

import tourvn.core.contact.controller.IContactController;
import tourvn.core.contact.manager.IContactManager;
import tourvn.core.geo.controller.IGEOController;
import tourvn.core.geo.manager.IGEOManager;
import tourvn.core.party.controller.IPartyController;
import tourvn.core.party.manager.IPartyManager;
import tourvn.core.sequence.manager.ISequenceValue;
import tourvn.core.supplier.ISupplierController;
import tourvn.core.user.controller.IUserController;
import tourvn.core.user.manager.IUserManager;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:27 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class LookupLocator {
    private static String prefix = "java:global/TourVN/";

    public static Object getBean(String jndiName) {
        try {
            return new InitialContext().lookup(prefix + jndiName);
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    public static ISequenceValue getSequenceValue() {
        return (ISequenceValue) getBean("Core/SequenceValue");
    }

    public static IUserManager getUserManager() {
        return (IUserManager) getBean("Core/UserManager");
    }

    public static IUserController getUserController() {
        return (IUserController) getBean("Core/UserController");
    }

    public static IGEOManager getGEOManager(){
        return (IGEOManager) getBean("Core/GEOManager");
    }

    public static IGEOController getGEOController(){
        return (IGEOController) getBean("Core/GEOController");
    }

    public static IContactManager getContactManager(){
        return (IContactManager) getBean("Core/ContactManager");
    }

    public static IContactController getContactController(){
        return (IContactController) getBean("Core/ContactController");
    }

    public static IPartyManager getPartyManager(){
        return (IPartyManager) getBean("Core/PartyManager");
    }

    public static IPartyController getPartyController(){
        return (IPartyController) getBean("Core/PartyController");
    }

    public static ISupplierController getSupplierController(){
        return (ISupplierController) getBean("Core/SupplierController");
    }
}
