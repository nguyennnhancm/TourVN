package tourvn.product.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:37 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Entity
@javax.persistence.Table(name = "product_category")
public class ProductCategory implements Serializable {
    private String productCategoryId;

    @Id
    @javax.persistence.Column(name = "PRODUCT_CATEGORY_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    private String productCategoryTypeId;

    @Basic
    @javax.persistence.Column(name = "PRODUCT_CATEGORY_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getProductCategoryTypeId() {
        return productCategoryTypeId;
    }

    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
    }

    private String primaryParentCategoryId;

    @Basic
    @javax.persistence.Column(name = "PRIMARY_PARENT_CATEGORY_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPrimaryParentCategoryId() {
        return primaryParentCategoryId;
    }

    public void setPrimaryParentCategoryId(String primaryParentCategoryId) {
        this.primaryParentCategoryId = primaryParentCategoryId;
    }

    private String categoryName;

    @Basic
    @javax.persistence.Column(name = "CATEGORY_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    private String longDescription;

    @Basic
    @javax.persistence.Column(name = "LONG_DESCRIPTION", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    private String categoryImageUrl;

    @Basic
    @javax.persistence.Column(name = "CATEGORY_IMAGE_URL", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }

    private String linkOneImageUrl;

    @Basic
    @javax.persistence.Column(name = "LINK_ONE_IMAGE_URL", nullable = true, insertable = true, updatable = true, length = 255)
    public String getLinkOneImageUrl() {
        return linkOneImageUrl;
    }

    public void setLinkOneImageUrl(String linkOneImageUrl) {
        this.linkOneImageUrl = linkOneImageUrl;
    }

    private String linkTwoImageUrl;

    @Basic
    @javax.persistence.Column(name = "LINK_TWO_IMAGE_URL", nullable = true, insertable = true, updatable = true, length = 255)
    public String getLinkTwoImageUrl() {
        return linkTwoImageUrl;
    }

    public void setLinkTwoImageUrl(String linkTwoImageUrl) {
        this.linkTwoImageUrl = linkTwoImageUrl;
    }

    private String detailScreen;

    @Basic
    @javax.persistence.Column(name = "DETAIL_SCREEN", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }

    private String showInSelect;

    @Basic
    @javax.persistence.Column(name = "SHOW_IN_SELECT", nullable = true, insertable = true, updatable = true, length = 1)
    public String getShowInSelect() {
        return showInSelect;
    }

    public void setShowInSelect(String showInSelect) {
        this.showInSelect = showInSelect;
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

        ProductCategory that = (ProductCategory) o;

        if (categoryImageUrl != null ? !categoryImageUrl.equals(that.categoryImageUrl) : that.categoryImageUrl != null)
            return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (createdStamp != null ? !createdStamp.equals(that.createdStamp) : that.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(that.createdTxStamp) : that.createdTxStamp != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (detailScreen != null ? !detailScreen.equals(that.detailScreen) : that.detailScreen != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(that.lastUpdatedStamp) : that.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(that.lastUpdatedTxStamp) : that.lastUpdatedTxStamp != null)
            return false;
        if (linkOneImageUrl != null ? !linkOneImageUrl.equals(that.linkOneImageUrl) : that.linkOneImageUrl != null)
            return false;
        if (linkTwoImageUrl != null ? !linkTwoImageUrl.equals(that.linkTwoImageUrl) : that.linkTwoImageUrl != null)
            return false;
        if (longDescription != null ? !longDescription.equals(that.longDescription) : that.longDescription != null)
            return false;
        if (primaryParentCategoryId != null ? !primaryParentCategoryId.equals(that.primaryParentCategoryId) : that.primaryParentCategoryId != null)
            return false;
        if (productCategoryId != null ? !productCategoryId.equals(that.productCategoryId) : that.productCategoryId != null)
            return false;
        if (productCategoryTypeId != null ? !productCategoryTypeId.equals(that.productCategoryTypeId) : that.productCategoryTypeId != null)
            return false;
        if (showInSelect != null ? !showInSelect.equals(that.showInSelect) : that.showInSelect != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productCategoryId != null ? productCategoryId.hashCode() : 0;
        result = 31 * result + (productCategoryTypeId != null ? productCategoryTypeId.hashCode() : 0);
        result = 31 * result + (primaryParentCategoryId != null ? primaryParentCategoryId.hashCode() : 0);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (longDescription != null ? longDescription.hashCode() : 0);
        result = 31 * result + (categoryImageUrl != null ? categoryImageUrl.hashCode() : 0);
        result = 31 * result + (linkOneImageUrl != null ? linkOneImageUrl.hashCode() : 0);
        result = 31 * result + (linkTwoImageUrl != null ? linkTwoImageUrl.hashCode() : 0);
        result = 31 * result + (detailScreen != null ? detailScreen.hashCode() : 0);
        result = 31 * result + (showInSelect != null ? showInSelect.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
