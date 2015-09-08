package tourvn.core.party.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
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
@javax.persistence.Table(name = "party_relationship")
public class PartyRelationship implements Serializable{
    private String partyIdFrom;

    @Id
    @javax.persistence.Column(name = "PARTY_ID_FROM", nullable = false, insertable = true, updatable = true, length = 20)
    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    private String partyIdTo;

    @Id
    @javax.persistence.Column(name = "PARTY_ID_TO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    private String roleTypeIdFrom;

    @Id
    @javax.persistence.Column(name = "ROLE_TYPE_ID_FROM", nullable = false, insertable = true, updatable = true, length = 20)
    public String getRoleTypeIdFrom() {
        return roleTypeIdFrom;
    }

    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }

    private String roleTypeIdTo;

    @Id
    @javax.persistence.Column(name = "ROLE_TYPE_ID_TO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getRoleTypeIdTo() {
        return roleTypeIdTo;
    }

    public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }

    private Timestamp fromDate;

    @Id
    @javax.persistence.Column(name = "FROM_DATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    private Timestamp thruDate;

    @Basic
    @javax.persistence.Column(name = "THRU_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getThruDate() {
        return thruDate;
    }

    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }

    private String statusId;

    @Basic
    @javax.persistence.Column(name = "STATUS_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    private String relationshipName;

    @Basic
    @javax.persistence.Column(name = "RELATIONSHIP_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    private String securityGroupId;

    @Basic
    @javax.persistence.Column(name = "SECURITY_GROUP_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    private String priorityTypeId;

    @Basic
    @javax.persistence.Column(name = "PRIORITY_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPriorityTypeId() {
        return priorityTypeId;
    }

    public void setPriorityTypeId(String priorityTypeId) {
        this.priorityTypeId = priorityTypeId;
    }

    private String partyRelationshipTypeId;

    @Basic
    @javax.persistence.Column(name = "PARTY_RELATIONSHIP_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPartyRelationshipTypeId() {
        return partyRelationshipTypeId;
    }

    public void setPartyRelationshipTypeId(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
    }

    private String permissionsEnumId;

    @Basic
    @javax.persistence.Column(name = "PERMISSIONS_ENUM_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPermissionsEnumId() {
        return permissionsEnumId;
    }

    public void setPermissionsEnumId(String permissionsEnumId) {
        this.permissionsEnumId = permissionsEnumId;
    }

    private String positionTitle;

    @Basic
    @javax.persistence.Column(name = "POSITION_TITLE", nullable = true, insertable = true, updatable = true, length = 100)
    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
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

        PartyRelationship that = (PartyRelationship) o;

        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (createdStamp != null ? !createdStamp.equals(that.createdStamp) : that.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(that.createdTxStamp) : that.createdTxStamp != null)
            return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(that.lastUpdatedStamp) : that.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(that.lastUpdatedTxStamp) : that.lastUpdatedTxStamp != null)
            return false;
        if (partyIdFrom != null ? !partyIdFrom.equals(that.partyIdFrom) : that.partyIdFrom != null) return false;
        if (partyIdTo != null ? !partyIdTo.equals(that.partyIdTo) : that.partyIdTo != null) return false;
        if (partyRelationshipTypeId != null ? !partyRelationshipTypeId.equals(that.partyRelationshipTypeId) : that.partyRelationshipTypeId != null)
            return false;
        if (permissionsEnumId != null ? !permissionsEnumId.equals(that.permissionsEnumId) : that.permissionsEnumId != null)
            return false;
        if (positionTitle != null ? !positionTitle.equals(that.positionTitle) : that.positionTitle != null)
            return false;
        if (priorityTypeId != null ? !priorityTypeId.equals(that.priorityTypeId) : that.priorityTypeId != null)
            return false;
        if (relationshipName != null ? !relationshipName.equals(that.relationshipName) : that.relationshipName != null)
            return false;
        if (roleTypeIdFrom != null ? !roleTypeIdFrom.equals(that.roleTypeIdFrom) : that.roleTypeIdFrom != null)
            return false;
        if (roleTypeIdTo != null ? !roleTypeIdTo.equals(that.roleTypeIdTo) : that.roleTypeIdTo != null) return false;
        if (securityGroupId != null ? !securityGroupId.equals(that.securityGroupId) : that.securityGroupId != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (thruDate != null ? !thruDate.equals(that.thruDate) : that.thruDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partyIdFrom != null ? partyIdFrom.hashCode() : 0;
        result = 31 * result + (partyIdTo != null ? partyIdTo.hashCode() : 0);
        result = 31 * result + (roleTypeIdFrom != null ? roleTypeIdFrom.hashCode() : 0);
        result = 31 * result + (roleTypeIdTo != null ? roleTypeIdTo.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (thruDate != null ? thruDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (relationshipName != null ? relationshipName.hashCode() : 0);
        result = 31 * result + (securityGroupId != null ? securityGroupId.hashCode() : 0);
        result = 31 * result + (priorityTypeId != null ? priorityTypeId.hashCode() : 0);
        result = 31 * result + (partyRelationshipTypeId != null ? partyRelationshipTypeId.hashCode() : 0);
        result = 31 * result + (permissionsEnumId != null ? permissionsEnumId.hashCode() : 0);
        result = 31 * result + (positionTitle != null ? positionTitle.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
