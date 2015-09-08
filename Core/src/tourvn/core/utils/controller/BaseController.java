package tourvn.core.utils.controller;


import tourvn.core.contact.controller.IContactController;
import tourvn.core.contact.manager.IContactManager;
import tourvn.core.geo.manager.IGEOManager;
import tourvn.core.party.controller.IPartyController;
import tourvn.core.party.manager.IPartyManager;
import tourvn.core.sequence.manager.ISequenceValue;
import tourvn.core.user.manager.IUserManager;
import tourvn.core.utils.LookupLocator;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/4/2015
 * Time: 9:37 AM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseController {
    private ISequenceValue sequenceValue;
    private IUserManager userManager;
    private IGEOManager geoManager;
    private IPartyManager partyManager;
    private IContactManager contactManager;
    private IContactController contactController;
    private IPartyController partyController;

    public ISequenceValue getSequenceValue() {
        if (null == sequenceValue) sequenceValue = LookupLocator.getSequenceValue();
        return sequenceValue;
    }

    public IUserManager getUserManager() {
        if (null == userManager) userManager = LookupLocator.getUserManager();
        return userManager;
    }

    public IGEOManager getGeoManager(){
        if(null == geoManager) geoManager = LookupLocator.getGEOManager();
        return geoManager;
    }

    public IPartyManager getPartyManager() {
        if (null == partyManager) partyManager = LookupLocator.getPartyManager();
        return partyManager;
    }

    public IContactManager getContactManager() {
        if (null == contactManager) contactManager = LookupLocator.getContactManager();
        return contactManager;
    }

    public IContactController getContactController() {
        if (null == contactController) contactController = LookupLocator.getContactController();
        return contactController;
    }

    public IPartyController getPartyController() {
        if (null == partyController) partyController = LookupLocator.getPartyController();
        return partyController;
    }
}
