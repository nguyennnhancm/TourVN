package tourvn.core.geo.manager.impl;

import tourvn.core.geo.entities.Geo;
import tourvn.core.geo.entities.GeoAssoc;
import tourvn.core.geo.manager.IGEOManager;
import tourvn.core.utils.manager.BaseManager;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 8/27/2015
 * Time: 12:10 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Singleton(name = "GEOManager")
public class GEOManager extends BaseManager implements IGEOManager {
    private HashMap<String, Geo> geoMap = new HashMap<String, Geo>();
    private HashMap<String, HashMap<String,List<Geo>>> assocGeoMap = new HashMap<String, HashMap<String, List<Geo>>>();
    private HashMap<String,String> toGeoAssocMap = new HashMap<String, String>();
    @PostConstruct
    protected void initialize() {
        List<Geo> list = getEntityManager().createQuery("select g from Geo g").getResultList();
        for (Geo geo : list) {
            geoMap.put(geo.getGeoId(), geo);
        }
        List<GeoAssoc> geoAssocs = getEntityManager().createQuery("select ga from GeoAssoc ga").getResultList();
        Geo geo = geoMap.get("VNM");
        if(null!=geo){
            HashMap<String,List<Geo>> VNMSub = new HashMap<String, List<Geo>>();
            List<Geo> subList = new ArrayList<Geo>();
            assocGeoMap.put("VNM",VNMSub);
            VNMSub.put("REGIONS",subList);
            Geo hcmGeo = geoMap.get("TPHCM");
            if(null!=hcmGeo){
                subList.add(hcmGeo);
            }
            Geo haNoiGeo = geoMap.get("HaNoi");
            if(null!=haNoiGeo){
                subList.add(haNoiGeo);
            }
        }
        for (GeoAssoc geoAssoc : geoAssocs) {
            String geoIdTo = geoAssoc.getGeoIdTo();
            String geoId = geoAssoc.getGeoId();
            String assocId = geoAssoc.getGeoAssocTypeId();
            if(!(("TPHCM".equals(geoIdTo)||"HaNoi".equals(geoIdTo))&&"REGIONS".equals(assocId))){
                HashMap<String,List<Geo>> parentGeoMap = assocGeoMap.get(geoId);
                if(null==parentGeoMap){
                    parentGeoMap = new HashMap<String, List<Geo>>();
                    assocGeoMap.put(geoId,parentGeoMap);
                }
                List<Geo> subList = parentGeoMap.get(assocId);
                if(null==subList){
                    subList = new ArrayList<Geo>();
                    parentGeoMap.put(assocId,subList);
                }
                Geo geoTo = geoMap.get(geoIdTo);
                subList.add(geoTo);
                toGeoAssocMap.put(geoAssoc.getGeoIdTo()+geoAssoc.getGeoAssocTypeId(),geoAssoc.getGeoId());
            }
        }
    }

    @Override
    public Geo getGeoById(String geoId) {
        return geoMap.get(geoId);
    }

    @Override
    public List<Geo> getGeoByAssoc(String parentGeoId, String assocTypeId) {

        HashMap<String, List<Geo>> geoParentAssocMap = getGeoAssocMap(parentGeoId);
        List<Geo> geoList = geoParentAssocMap.get(assocTypeId);
        if(null==geoList){
            geoList = new ArrayList<Geo>();
            geoParentAssocMap.put(assocTypeId,geoList);
            // init geo list
            Query query = getEntityManager().createQuery("select g from Geo g where g.geoId in (select ga.geoIdTo from GeoAssoc ga where ga.geoId=:parentId and ga.geoAssocTypeId=:assocTypeId) order by g.geoName asc");
            query.setParameter("parentId", parentGeoId);
            query.setParameter("assocTypeId", assocTypeId);
            List<Geo> searchResult = query.getResultList();
            for(Geo geo: searchResult){
                geoList.add(geo);
                String id = geo.getGeoId();
                geoMap.put(id,geo);
            }
        }
        return geoList;
    }

    public HashMap<String,List<Geo>> getGeoAssocMap(String geoId){
        HashMap<String,List<Geo>> result = assocGeoMap.get(geoId);
        if(null==result){
            result = new HashMap<String, List<Geo>>();
            assocGeoMap.put(geoId,result);
        }
        return result;
    }
}
