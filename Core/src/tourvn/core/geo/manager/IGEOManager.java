package tourvn.core.geo.manager;

import tourvn.core.geo.entities.Geo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:09 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public interface IGEOManager {
    public Geo getGeoById(String geoId);

    public List<Geo> getGeoByAssoc(String parentGeoId, String assocTypeId);
}
