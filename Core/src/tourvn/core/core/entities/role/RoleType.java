package tourvn.core.core.entities.role;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/1/2015
 * Time: 8:18 AM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "role_type")
public class RoleType implements Serializable{
    private String roleTypeId;
    private String hasTable;
    private String description;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private RoleType roleTypeByParentTypeId;

    @Id
    @Column(name = "ROLE_TYPE_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Basic
    @Column(name = "HAS_TABLE", nullable = true, insertable = true, updatable = true, length = 1)
    public String getHasTable() {
        return hasTable;
    }

    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "LAST_UPDATED_STAMP", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    @Basic
    @Column(name = "LAST_UPDATED_TX_STAMP", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    @Basic
    @Column(name = "CREATED_STAMP", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }

    @Basic
    @Column(name = "CREATED_TX_STAMP", nullable = true, insertable = true, updatable = true)
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

        RoleType roleType = (RoleType) o;

        if (createdStamp != null ? !createdStamp.equals(roleType.createdStamp) : roleType.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(roleType.createdTxStamp) : roleType.createdTxStamp != null)
            return false;
        if (description != null ? !description.equals(roleType.description) : roleType.description != null)
            return false;
        if (hasTable != null ? !hasTable.equals(roleType.hasTable) : roleType.hasTable != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(roleType.lastUpdatedStamp) : roleType.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(roleType.lastUpdatedTxStamp) : roleType.lastUpdatedTxStamp != null)
            return false;
        if (roleTypeId != null ? !roleTypeId.equals(roleType.roleTypeId) : roleType.roleTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleTypeId != null ? roleTypeId.hashCode() : 0;
        result = 31 * result + (hasTable != null ? hasTable.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    public RoleType getRoleTypeByParentTypeId() {
        return roleTypeByParentTypeId;
    }

    public void setRoleTypeByParentTypeId(RoleType roleTypeByParentTypeId) {
        this.roleTypeByParentTypeId = roleTypeByParentTypeId;
    }
}
