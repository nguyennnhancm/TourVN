package tourvn.core.geo.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:24 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Entity
@javax.persistence.Table(name = "geo_assoc")
@javax.persistence.IdClass(GeoAssocPK.class)
public class GeoAssoc {
    private String geoId;

    @Id
    @javax.persistence.Column(name = "GEO_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    private String geoIdTo;

    @Id
    @javax.persistence.Column(name = "GEO_ID_TO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getGeoIdTo() {
        return geoIdTo;
    }

    public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }

    private String geoAssocTypeId;

    @Basic
    @javax.persistence.Column(name = "GEO_ASSOC_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGeoAssocTypeId() {
        return geoAssocTypeId;
    }

    public void setGeoAssocTypeId(String geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
    }

    private Timestamp lastUpdatedStamp;

    @Basic
    @javax.persistence.Column(name = "LAST_UPDATED_STAMP", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    private Timestamp lastUpdatedTxStamp;

    @Basic
    @javax.persistence.Column(name = "LAST_UPDATED_TX_STAMP", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    private Timestamp createdStamp;

    @Basic
    @javax.persistence.Column(name = "CREATED_STAMP", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }

    private Timestamp createdTxStamp;

    @Basic
    @javax.persistence.Column(name = "CREATED_TX_STAMP", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeoAssoc geoAssoc = (GeoAssoc) o;

        if (createdStamp != null ? !createdStamp.equals(geoAssoc.createdStamp) : geoAssoc.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(geoAssoc.createdTxStamp) : geoAssoc.createdTxStamp != null)
            return false;
        if (geoAssocTypeId != null ? !geoAssocTypeId.equals(geoAssoc.geoAssocTypeId) : geoAssoc.geoAssocTypeId != null)
            return false;
        if (geoId != null ? !geoId.equals(geoAssoc.geoId) : geoAssoc.geoId != null) return false;
        if (geoIdTo != null ? !geoIdTo.equals(geoAssoc.geoIdTo) : geoAssoc.geoIdTo != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(geoAssoc.lastUpdatedStamp) : geoAssoc.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(geoAssoc.lastUpdatedTxStamp) : geoAssoc.lastUpdatedTxStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = geoId != null ? geoId.hashCode() : 0;
        result = 31 * result + (geoIdTo != null ? geoIdTo.hashCode() : 0);
        result = 31 * result + (geoAssocTypeId != null ? geoAssocTypeId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
