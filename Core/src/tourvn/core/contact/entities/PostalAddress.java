package tourvn.core.contact.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:34 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Entity
@javax.persistence.Table(name = "postal_address")
public class PostalAddress {
    private String contactMechId;

    @Id
    @javax.persistence.Column(name = "CONTACT_MECH_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    private String toName;

    @Basic
    @javax.persistence.Column(name = "TO_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    private String attnName;

    @Basic
    @javax.persistence.Column(name = "ATTN_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getAttnName() {
        return attnName;
    }

    public void setAttnName(String attnName) {
        this.attnName = attnName;
    }

    private String address1;

    @Basic
    @javax.persistence.Column(name = "ADDRESS1", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;

    @Basic
    @javax.persistence.Column(name = "ADDRESS2", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String directions;

    @Basic
    @javax.persistence.Column(name = "DIRECTIONS", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    private String city;

    @Basic
    @javax.persistence.Column(name = "CITY", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String postalCode;

    @Basic
    @javax.persistence.Column(name = "POSTAL_CODE", nullable = true, insertable = true, updatable = true, length = 60)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String postalCodeExt;

    @Basic
    @javax.persistence.Column(name = "POSTAL_CODE_EXT", nullable = true, insertable = true, updatable = true, length = 60)
    public String getPostalCodeExt() {
        return postalCodeExt;
    }

    public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
    }

    private String countryGeoId;

    @Basic
    @javax.persistence.Column(name = "COUNTRY_GEO_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCountryGeoId() {
        return countryGeoId;
    }

    public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }

    private String stateProvinceGeoId;

    @Basic
    @javax.persistence.Column(name = "STATE_PROVINCE_GEO_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getStateProvinceGeoId() {
        return stateProvinceGeoId;
    }

    public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }

    private String countyGeoId;

    @Basic
    @javax.persistence.Column(name = "COUNTY_GEO_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCountyGeoId() {
        return countyGeoId;
    }

    public void setCountyGeoId(String countyGeoId) {
        this.countyGeoId = countyGeoId;
    }

    private String postalCodeGeoId;

    @Basic
    @javax.persistence.Column(name = "POSTAL_CODE_GEO_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPostalCodeGeoId() {
        return postalCodeGeoId;
    }

    public void setPostalCodeGeoId(String postalCodeGeoId) {
        this.postalCodeGeoId = postalCodeGeoId;
    }

    private String geoPointId;

    @Basic
    @javax.persistence.Column(name = "GEO_POINT_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGeoPointId() {
        return geoPointId;
    }

    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
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

        PostalAddress that = (PostalAddress) o;

        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (attnName != null ? !attnName.equals(that.attnName) : that.attnName != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (contactMechId != null ? !contactMechId.equals(that.contactMechId) : that.contactMechId != null)
            return false;
        if (countryGeoId != null ? !countryGeoId.equals(that.countryGeoId) : that.countryGeoId != null) return false;
        if (countyGeoId != null ? !countyGeoId.equals(that.countyGeoId) : that.countyGeoId != null) return false;
        if (createdStamp != null ? !createdStamp.equals(that.createdStamp) : that.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(that.createdTxStamp) : that.createdTxStamp != null)
            return false;
        if (directions != null ? !directions.equals(that.directions) : that.directions != null) return false;
        if (geoPointId != null ? !geoPointId.equals(that.geoPointId) : that.geoPointId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(that.lastUpdatedStamp) : that.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(that.lastUpdatedTxStamp) : that.lastUpdatedTxStamp != null)
            return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (postalCodeExt != null ? !postalCodeExt.equals(that.postalCodeExt) : that.postalCodeExt != null)
            return false;
        if (postalCodeGeoId != null ? !postalCodeGeoId.equals(that.postalCodeGeoId) : that.postalCodeGeoId != null)
            return false;
        if (stateProvinceGeoId != null ? !stateProvinceGeoId.equals(that.stateProvinceGeoId) : that.stateProvinceGeoId != null)
            return false;
        if (toName != null ? !toName.equals(that.toName) : that.toName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactMechId != null ? contactMechId.hashCode() : 0;
        result = 31 * result + (toName != null ? toName.hashCode() : 0);
        result = 31 * result + (attnName != null ? attnName.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (directions != null ? directions.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (postalCodeExt != null ? postalCodeExt.hashCode() : 0);
        result = 31 * result + (countryGeoId != null ? countryGeoId.hashCode() : 0);
        result = 31 * result + (stateProvinceGeoId != null ? stateProvinceGeoId.hashCode() : 0);
        result = 31 * result + (countyGeoId != null ? countyGeoId.hashCode() : 0);
        result = 31 * result + (postalCodeGeoId != null ? postalCodeGeoId.hashCode() : 0);
        result = 31 * result + (geoPointId != null ? geoPointId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
