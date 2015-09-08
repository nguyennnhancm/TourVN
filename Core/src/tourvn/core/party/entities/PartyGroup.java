package tourvn.core.party.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:29 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Entity
@javax.persistence.Table(name = "party_group")
public class PartyGroup {
    private String partyId;

    @Id
    @javax.persistence.Column(name = "PARTY_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    private String groupName;

    @Basic
    @javax.persistence.Column(name = "GROUP_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private String groupNameLocal;

    @Basic
    @javax.persistence.Column(name = "GROUP_NAME_LOCAL", nullable = true, insertable = true, updatable = true, length = 100)
    public String getGroupNameLocal() {
        return groupNameLocal;
    }

    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }

    private String officeSiteName;

    @Basic
    @javax.persistence.Column(name = "OFFICE_SITE_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getOfficeSiteName() {
        return officeSiteName;
    }

    public void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }

    private BigDecimal annualRevenue;

    @Basic
    @javax.persistence.Column(name = "ANNUAL_REVENUE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    private Integer numEmployees;

    @Basic
    @javax.persistence.Column(name = "NUM_EMPLOYEES", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(Integer numEmployees) {
        this.numEmployees = numEmployees;
    }

    private String tickerSymbol;

    @Basic
    @javax.persistence.Column(name = "TICKER_SYMBOL", nullable = true, insertable = true, updatable = true, length = 10)
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    private String comments;

    @Basic
    @javax.persistence.Column(name = "COMMENTS", nullable = true, insertable = true, updatable = true, length = 255)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    private String logoImageUrl;

    @Basic
    @javax.persistence.Column(name = "LOGO_IMAGE_URL", nullable = true, insertable = true, updatable = true, length = 255)
    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
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

    private String isIncorporated;

    @Basic
    @javax.persistence.Column(name = "IS_INCORPORATED", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIsIncorporated() {
        return isIncorporated;
    }

    public void setIsIncorporated(String isIncorporated) {
        this.isIncorporated = isIncorporated;
    }

    private String federalTaxId;

    @Basic
    @javax.persistence.Column(name = "FEDERAL_TAX_ID", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    private String requires1099;

    @Basic
    @javax.persistence.Column(name = "REQUIRES1099", nullable = true, insertable = true, updatable = true, length = 1)
    public String getRequires1099() {
        return requires1099;
    }

    public void setRequires1099(String requires1099) {
        this.requires1099 = requires1099;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartyGroup that = (PartyGroup) o;

        if (annualRevenue != null ? !annualRevenue.equals(that.annualRevenue) : that.annualRevenue != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (createdStamp != null ? !createdStamp.equals(that.createdStamp) : that.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(that.createdTxStamp) : that.createdTxStamp != null)
            return false;
        if (federalTaxId != null ? !federalTaxId.equals(that.federalTaxId) : that.federalTaxId != null) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (groupNameLocal != null ? !groupNameLocal.equals(that.groupNameLocal) : that.groupNameLocal != null)
            return false;
        if (isIncorporated != null ? !isIncorporated.equals(that.isIncorporated) : that.isIncorporated != null)
            return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(that.lastUpdatedStamp) : that.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(that.lastUpdatedTxStamp) : that.lastUpdatedTxStamp != null)
            return false;
        if (logoImageUrl != null ? !logoImageUrl.equals(that.logoImageUrl) : that.logoImageUrl != null) return false;
        if (numEmployees != null ? !numEmployees.equals(that.numEmployees) : that.numEmployees != null) return false;
        if (officeSiteName != null ? !officeSiteName.equals(that.officeSiteName) : that.officeSiteName != null)
            return false;
        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;
        if (requires1099 != null ? !requires1099.equals(that.requires1099) : that.requires1099 != null) return false;
        if (tickerSymbol != null ? !tickerSymbol.equals(that.tickerSymbol) : that.tickerSymbol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partyId != null ? partyId.hashCode() : 0;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (groupNameLocal != null ? groupNameLocal.hashCode() : 0);
        result = 31 * result + (officeSiteName != null ? officeSiteName.hashCode() : 0);
        result = 31 * result + (annualRevenue != null ? annualRevenue.hashCode() : 0);
        result = 31 * result + (numEmployees != null ? numEmployees.hashCode() : 0);
        result = 31 * result + (tickerSymbol != null ? tickerSymbol.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (logoImageUrl != null ? logoImageUrl.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (isIncorporated != null ? isIncorporated.hashCode() : 0);
        result = 31 * result + (federalTaxId != null ? federalTaxId.hashCode() : 0);
        result = 31 * result + (requires1099 != null ? requires1099.hashCode() : 0);
        return result;
    }
}
