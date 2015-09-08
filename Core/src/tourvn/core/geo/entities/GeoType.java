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
@javax.persistence.Table(name = "geo_type")
public class GeoType {
    private String geoTypeId;

    @Id
    @javax.persistence.Column(name = "GEO_TYPE_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getGeoTypeId() {
        return geoTypeId;
    }

    public void setGeoTypeId(String geoTypeId) {
        this.geoTypeId = geoTypeId;
    }

    private String parentTypeId;

    @Basic
    @javax.persistence.Column(name = "PARENT_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    private String hasTable;

    @Basic
    @javax.persistence.Column(name = "HAS_TABLE", nullable = true, insertable = true, updatable = true, length = 1)
    public String getHasTable() {
        return hasTable;
    }

    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        GeoType geoType = (GeoType) o;

        if (createdStamp != null ? !createdStamp.equals(geoType.createdStamp) : geoType.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(geoType.createdTxStamp) : geoType.createdTxStamp != null)
            return false;
        if (description != null ? !description.equals(geoType.description) : geoType.description != null) return false;
        if (geoTypeId != null ? !geoTypeId.equals(geoType.geoTypeId) : geoType.geoTypeId != null) return false;
        if (hasTable != null ? !hasTable.equals(geoType.hasTable) : geoType.hasTable != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(geoType.lastUpdatedStamp) : geoType.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(geoType.lastUpdatedTxStamp) : geoType.lastUpdatedTxStamp != null)
            return false;
        if (parentTypeId != null ? !parentTypeId.equals(geoType.parentTypeId) : geoType.parentTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = geoTypeId != null ? geoTypeId.hashCode() : 0;
        result = 31 * result + (parentTypeId != null ? parentTypeId.hashCode() : 0);
        result = 31 * result + (hasTable != null ? hasTable.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
