package tourvn.core.party.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:28 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class PartyContactMechPurposePK implements Serializable {
    private String partyId;

    @Column(name = "PARTY_ID", nullable = false, insertable = true, updatable = true, length = 20)
    @Id
    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    private String contactMechId;

    @Column(name = "CONTACT_MECH_ID", nullable = false, insertable = true, updatable = true, length = 20)
    @Id
    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    private String contactMechPurposeTypeId;

    @Column(name = "CONTACT_MECH_PURPOSE_TYPE_ID", nullable = false, insertable = true, updatable = true, length = 20)
    @Id
    public String getContactMechPurposeTypeId() {
        return contactMechPurposeTypeId;
    }

    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    private Timestamp fromDate;

    @Column(name = "FROM_DATE", nullable = false, insertable = true, updatable = true)
    @Id
    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartyContactMechPurposePK that = (PartyContactMechPurposePK) o;

        if (contactMechId != null ? !contactMechId.equals(that.contactMechId) : that.contactMechId != null)
            return false;
        if (contactMechPurposeTypeId != null ? !contactMechPurposeTypeId.equals(that.contactMechPurposeTypeId) : that.contactMechPurposeTypeId != null)
            return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partyId != null ? partyId.hashCode() : 0;
        result = 31 * result + (contactMechId != null ? contactMechId.hashCode() : 0);
        result = 31 * result + (contactMechPurposeTypeId != null ? contactMechPurposeTypeId.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        return result;
    }
}
