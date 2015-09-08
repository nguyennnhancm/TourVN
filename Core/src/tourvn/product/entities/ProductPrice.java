package tourvn.product.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:44 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Entity
@javax.persistence.Table(name = "product_price")
public class ProductPrice implements Serializable {
    private String productId;

    @Id
    @javax.persistence.Column(name = "PRODUCT_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    private String productPriceTypeId;

    @Id
    @javax.persistence.Column(name = "PRODUCT_PRICE_TYPE_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
    }

    private String productPricePurposeId;

    @Id
    @javax.persistence.Column(name = "PRODUCT_PRICE_PURPOSE_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId;
    }

    private String currencyUomId;

    @Id
    @javax.persistence.Column(name = "CURRENCY_UOM_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    private String productStoreGroupId;

    @Id
    @javax.persistence.Column(name = "PRODUCT_STORE_GROUP_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId;
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

    private BigDecimal price;

    @Basic
    @javax.persistence.Column(name = "PRICE", nullable = true, insertable = true, updatable = true, precision = 3)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private String termUomId;

    @Basic
    @javax.persistence.Column(name = "TERM_UOM_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getTermUomId() {
        return termUomId;
    }

    public void setTermUomId(String termUomId) {
        this.termUomId = termUomId;
    }

    private String customPriceCalcService;

    @Basic
    @javax.persistence.Column(name = "CUSTOM_PRICE_CALC_SERVICE", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCustomPriceCalcService() {
        return customPriceCalcService;
    }

    public void setCustomPriceCalcService(String customPriceCalcService) {
        this.customPriceCalcService = customPriceCalcService;
    }

    private Timestamp createdDate;

    @Basic
    @javax.persistence.Column(name = "CREATED_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    private String createdByUserLogin;

    @Basic
    @javax.persistence.Column(name = "CREATED_BY_USER_LOGIN", nullable = true, insertable = true, updatable = true, length = 250)
    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    private Timestamp lastModifiedDate;

    @Basic
    @javax.persistence.Column(name = "LAST_MODIFIED_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    private String lastModifiedByUserLogin;

    @Basic
    @javax.persistence.Column(name = "LAST_MODIFIED_BY_USER_LOGIN", nullable = true, insertable = true, updatable = true, length = 250)
    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

        ProductPrice that = (ProductPrice) o;

        if (createdByUserLogin != null ? !createdByUserLogin.equals(that.createdByUserLogin) : that.createdByUserLogin != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdStamp != null ? !createdStamp.equals(that.createdStamp) : that.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(that.createdTxStamp) : that.createdTxStamp != null)
            return false;
        if (currencyUomId != null ? !currencyUomId.equals(that.currencyUomId) : that.currencyUomId != null)
            return false;
        if (customPriceCalcService != null ? !customPriceCalcService.equals(that.customPriceCalcService) : that.customPriceCalcService != null)
            return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (lastModifiedByUserLogin != null ? !lastModifiedByUserLogin.equals(that.lastModifiedByUserLogin) : that.lastModifiedByUserLogin != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(that.lastUpdatedStamp) : that.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(that.lastUpdatedTxStamp) : that.lastUpdatedTxStamp != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (productPricePurposeId != null ? !productPricePurposeId.equals(that.productPricePurposeId) : that.productPricePurposeId != null)
            return false;
        if (productPriceTypeId != null ? !productPriceTypeId.equals(that.productPriceTypeId) : that.productPriceTypeId != null)
            return false;
        if (productStoreGroupId != null ? !productStoreGroupId.equals(that.productStoreGroupId) : that.productStoreGroupId != null)
            return false;
        if (termUomId != null ? !termUomId.equals(that.termUomId) : that.termUomId != null) return false;
        if (thruDate != null ? !thruDate.equals(that.thruDate) : that.thruDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (productPriceTypeId != null ? productPriceTypeId.hashCode() : 0);
        result = 31 * result + (productPricePurposeId != null ? productPricePurposeId.hashCode() : 0);
        result = 31 * result + (currencyUomId != null ? currencyUomId.hashCode() : 0);
        result = 31 * result + (productStoreGroupId != null ? productStoreGroupId.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (thruDate != null ? thruDate.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (termUomId != null ? termUomId.hashCode() : 0);
        result = 31 * result + (customPriceCalcService != null ? customPriceCalcService.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdByUserLogin != null ? createdByUserLogin.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedByUserLogin != null ? lastModifiedByUserLogin.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
