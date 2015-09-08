package tourvn.core.geo.controller.impl;

import tourvn.core.geo.controller.IGEOController;
import tourvn.core.geo.entities.Geo;
import tourvn.core.utils.controller.BaseController;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:09 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "GEOController")
public class GEOController extends BaseController implements IGEOController {
    @Override
    public Geo getGeoById(String geoId) {
        return getGeoManager().getGeoById(geoId);
    }

    @Override
    public List<Geo> getGEOByAssoc(String parentId, String assocTypeId) {
        return getGeoManager().getGeoByAssoc(parentId, assocTypeId);
    }
}
