package tourvn.core.contact.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:19 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class ContactMechTypePurposePK implements Serializable {
    private String contactMechTypeId;
    private String contactMechPurposeTypeId;

    @Column(name = "CONTACT_MECH_TYPE_ID", nullable = false, insertable = true, updatable = true, length = 20)
    @Id
    public String getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    @Column(name = "CONTACT_MECH_PURPOSE_TYPE_ID", nullable = false, insertable = true, updatable = true, length = 20)
    @Id
    public String getContactMechPurposeTypeId() {
        return contactMechPurposeTypeId;
    }

    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactMechTypePurposePK that = (ContactMechTypePurposePK) o;

        if (contactMechPurposeTypeId != null ? !contactMechPurposeTypeId.equals(that.contactMechPurposeTypeId) : that.contactMechPurposeTypeId != null)
            return false;
        if (contactMechTypeId != null ? !contactMechTypeId.equals(that.contactMechTypeId) : that.contactMechTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactMechTypeId != null ? contactMechTypeId.hashCode() : 0;
        result = 31 * result + (contactMechPurposeTypeId != null ? contactMechPurposeTypeId.hashCode() : 0);
        return result;
    }
}
