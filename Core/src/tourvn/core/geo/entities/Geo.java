package tourvn.core.geo.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
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
@javax.persistence.Table(name = "geo")
public class Geo implements Serializable{
    private String geoId;

    @Id
    @javax.persistence.Column(name = "GEO_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    private String geoTypeId;

    @Basic
    @javax.persistence.Column(name = "GEO_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGeoTypeId() {
        return geoTypeId;
    }

    public void setGeoTypeId(String geoTypeId) {
        this.geoTypeId = geoTypeId;
    }

    private String geoName;

    @Basic
    @javax.persistence.Column(name = "GEO_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getGeoName() {
        return geoName;
    }

    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }

    private String geoCode;

    @Basic
    @javax.persistence.Column(name = "GEO_CODE", nullable = true, insertable = true, updatable = true, length = 60)
    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    private String geoSecCode;

    @Basic
    @javax.persistence.Column(name = "GEO_SEC_CODE", nullable = true, insertable = true, updatable = true, length = 60)
    public String getGeoSecCode() {
        return geoSecCode;
    }

    public void setGeoSecCode(String geoSecCode) {
        this.geoSecCode = geoSecCode;
    }

    private String abbreviation;

    @Basic
    @javax.persistence.Column(name = "ABBREVIATION", nullable = true, insertable = true, updatable = true, length = 60)
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private String wellKnownText;

    @Basic
    @javax.persistence.Column(name = "WELL_KNOWN_TEXT", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getWellKnownText() {
        return wellKnownText;
    }

    public void setWellKnownText(String wellKnownText) {
        this.wellKnownText = wellKnownText;
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

        Geo geo = (Geo) o;

        if (abbreviation != null ? !abbreviation.equals(geo.abbreviation) : geo.abbreviation != null) return false;
        if (createdStamp != null ? !createdStamp.equals(geo.createdStamp) : geo.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(geo.createdTxStamp) : geo.createdTxStamp != null)
            return false;
        if (geoCode != null ? !geoCode.equals(geo.geoCode) : geo.geoCode != null) return false;
        if (geoId != null ? !geoId.equals(geo.geoId) : geo.geoId != null) return false;
        if (geoName != null ? !geoName.equals(geo.geoName) : geo.geoName != null) return false;
        if (geoSecCode != null ? !geoSecCode.equals(geo.geoSecCode) : geo.geoSecCode != null) return false;
        if (geoTypeId != null ? !geoTypeId.equals(geo.geoTypeId) : geo.geoTypeId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(geo.lastUpdatedStamp) : geo.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(geo.lastUpdatedTxStamp) : geo.lastUpdatedTxStamp != null)
            return false;
        if (wellKnownText != null ? !wellKnownText.equals(geo.wellKnownText) : geo.wellKnownText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = geoId != null ? geoId.hashCode() : 0;
        result = 31 * result + (geoTypeId != null ? geoTypeId.hashCode() : 0);
        result = 31 * result + (geoName != null ? geoName.hashCode() : 0);
        result = 31 * result + (geoCode != null ? geoCode.hashCode() : 0);
        result = 31 * result + (geoSecCode != null ? geoSecCode.hashCode() : 0);
        result = 31 * result + (abbreviation != null ? abbreviation.hashCode() : 0);
        result = 31 * result + (wellKnownText != null ? wellKnownText.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
