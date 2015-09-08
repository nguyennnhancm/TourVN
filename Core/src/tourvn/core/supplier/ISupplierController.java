package tourvn.core.supplier;

import tourvn.core.user.model.OrgProfile;
import tourvn.core.user.model.UserProfile;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/31/2015
 * Time: 7:59 PM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
public interface ISupplierController {
    public UserProfile createSupplier(String partyVendor, UserProfile userProfile);

    public List<OrgProfile> getAllSupplierByVendor(String partyId);
}
