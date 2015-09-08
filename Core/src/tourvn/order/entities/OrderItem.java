package tourvn.order.entities;

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
 * Time: 10:27 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
@Entity
@javax.persistence.Table(name = "order_item")
public class OrderItem implements Serializable{
    private String orderId;

    @Id
    @javax.persistence.Column(name = "ORDER_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private String orderItemSeqId;

    @Id
    @javax.persistence.Column(name = "ORDER_ITEM_SEQ_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    private String externalId;

    @Basic
    @javax.persistence.Column(name = "EXTERNAL_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    private String orderItemTypeId;

    @Basic
    @javax.persistence.Column(name = "ORDER_ITEM_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getOrderItemTypeId() {
        return orderItemTypeId;
    }

    public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }

    private String orderItemGroupSeqId;

    @Basic
    @javax.persistence.Column(name = "ORDER_ITEM_GROUP_SEQ_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getOrderItemGroupSeqId() {
        return orderItemGroupSeqId;
    }

    public void setOrderItemGroupSeqId(String orderItemGroupSeqId) {
        this.orderItemGroupSeqId = orderItemGroupSeqId;
    }

    private String isItemGroupPrimary;

    @Basic
    @javax.persistence.Column(name = "IS_ITEM_GROUP_PRIMARY", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIsItemGroupPrimary() {
        return isItemGroupPrimary;
    }

    public void setIsItemGroupPrimary(String isItemGroupPrimary) {
        this.isItemGroupPrimary = isItemGroupPrimary;
    }

    private String fromInventoryItemId;

    @Basic
    @javax.persistence.Column(name = "FROM_INVENTORY_ITEM_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getFromInventoryItemId() {
        return fromInventoryItemId;
    }

    public void setFromInventoryItemId(String fromInventoryItemId) {
        this.fromInventoryItemId = fromInventoryItemId;
    }

    private String budgetId;

    @Basic
    @javax.persistence.Column(name = "BUDGET_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    private String budgetItemSeqId;

    @Basic
    @javax.persistence.Column(name = "BUDGET_ITEM_SEQ_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getBudgetItemSeqId() {
        return budgetItemSeqId;
    }

    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }

    private String productId;

    @Basic
    @javax.persistence.Column(name = "PRODUCT_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    private String supplierProductId;

    @Basic
    @javax.persistence.Column(name = "SUPPLIER_PRODUCT_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSupplierProductId() {
        return supplierProductId;
    }

    public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }

    private String productFeatureId;

    @Basic
    @javax.persistence.Column(name = "PRODUCT_FEATURE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    private String prodCatalogId;

    @Basic
    @javax.persistence.Column(name = "PROD_CATALOG_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    private String productCategoryId;

    @Basic
    @javax.persistence.Column(name = "PRODUCT_CATEGORY_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    private String isPromo;

    @Basic
    @javax.persistence.Column(name = "IS_PROMO", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(String isPromo) {
        this.isPromo = isPromo;
    }

    private String quoteId;

    @Basic
    @javax.persistence.Column(name = "QUOTE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    private String quoteItemSeqId;

    @Basic
    @javax.persistence.Column(name = "QUOTE_ITEM_SEQ_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getQuoteItemSeqId() {
        return quoteItemSeqId;
    }

    public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }

    private String shoppingListId;

    @Basic
    @javax.persistence.Column(name = "SHOPPING_LIST_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    private String shoppingListItemSeqId;

    @Basic
    @javax.persistence.Column(name = "SHOPPING_LIST_ITEM_SEQ_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getShoppingListItemSeqId() {
        return shoppingListItemSeqId;
    }

    public void setShoppingListItemSeqId(String shoppingListItemSeqId) {
        this.shoppingListItemSeqId = shoppingListItemSeqId;
    }

    private String subscriptionId;

    @Basic
    @javax.persistence.Column(name = "SUBSCRIPTION_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    private String deploymentId;

    @Basic
    @javax.persistence.Column(name = "DEPLOYMENT_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    private BigDecimal quantity;

    @Basic
    @javax.persistence.Column(name = "QUANTITY", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    private BigDecimal cancelQuantity;

    @Basic
    @javax.persistence.Column(name = "CANCEL_QUANTITY", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    private BigDecimal selectedAmount;

    @Basic
    @javax.persistence.Column(name = "SELECTED_AMOUNT", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getSelectedAmount() {
        return selectedAmount;
    }

    public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }

    private BigDecimal unitPrice;

    @Basic
    @javax.persistence.Column(name = "UNIT_PRICE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    private BigDecimal unitListPrice;

    @Basic
    @javax.persistence.Column(name = "UNIT_LIST_PRICE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getUnitListPrice() {
        return unitListPrice;
    }

    public void setUnitListPrice(BigDecimal unitListPrice) {
        this.unitListPrice = unitListPrice;
    }

    private BigDecimal unitAverageCost;

    @Basic
    @javax.persistence.Column(name = "UNIT_AVERAGE_COST", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getUnitAverageCost() {
        return unitAverageCost;
    }

    public void setUnitAverageCost(BigDecimal unitAverageCost) {
        this.unitAverageCost = unitAverageCost;
    }

    private BigDecimal unitRecurringPrice;

    @Basic
    @javax.persistence.Column(name = "UNIT_RECURRING_PRICE", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getUnitRecurringPrice() {
        return unitRecurringPrice;
    }

    public void setUnitRecurringPrice(BigDecimal unitRecurringPrice) {
        this.unitRecurringPrice = unitRecurringPrice;
    }

    private String isModifiedPrice;

    @Basic
    @javax.persistence.Column(name = "IS_MODIFIED_PRICE", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIsModifiedPrice() {
        return isModifiedPrice;
    }

    public void setIsModifiedPrice(String isModifiedPrice) {
        this.isModifiedPrice = isModifiedPrice;
    }

    private String recurringFreqUomId;

    @Basic
    @javax.persistence.Column(name = "RECURRING_FREQ_UOM_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getRecurringFreqUomId() {
        return recurringFreqUomId;
    }

    public void setRecurringFreqUomId(String recurringFreqUomId) {
        this.recurringFreqUomId = recurringFreqUomId;
    }

    private String itemDescription;

    @Basic
    @javax.persistence.Column(name = "ITEM_DESCRIPTION", nullable = true, insertable = true, updatable = true, length = 255)
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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

    private String correspondingPoId;

    @Basic
    @javax.persistence.Column(name = "CORRESPONDING_PO_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCorrespondingPoId() {
        return correspondingPoId;
    }

    public void setCorrespondingPoId(String correspondingPoId) {
        this.correspondingPoId = correspondingPoId;
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

    private String syncStatusId;

    @Basic
    @javax.persistence.Column(name = "SYNC_STATUS_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSyncStatusId() {
        return syncStatusId;
    }

    public void setSyncStatusId(String syncStatusId) {
        this.syncStatusId = syncStatusId;
    }

    private Timestamp estimatedShipDate;

    @Basic
    @javax.persistence.Column(name = "ESTIMATED_SHIP_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(Timestamp estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    private Timestamp estimatedDeliveryDate;

    @Basic
    @javax.persistence.Column(name = "ESTIMATED_DELIVERY_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Timestamp estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    private Timestamp autoCancelDate;

    @Basic
    @javax.persistence.Column(name = "AUTO_CANCEL_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getAutoCancelDate() {
        return autoCancelDate;
    }

    public void setAutoCancelDate(Timestamp autoCancelDate) {
        this.autoCancelDate = autoCancelDate;
    }

    private Timestamp dontCancelSetDate;

    @Basic
    @javax.persistence.Column(name = "DONT_CANCEL_SET_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getDontCancelSetDate() {
        return dontCancelSetDate;
    }

    public void setDontCancelSetDate(Timestamp dontCancelSetDate) {
        this.dontCancelSetDate = dontCancelSetDate;
    }

    private String dontCancelSetUserLogin;

    @Basic
    @javax.persistence.Column(name = "DONT_CANCEL_SET_USER_LOGIN", nullable = true, insertable = true, updatable = true, length = 250)
    public String getDontCancelSetUserLogin() {
        return dontCancelSetUserLogin;
    }

    public void setDontCancelSetUserLogin(String dontCancelSetUserLogin) {
        this.dontCancelSetUserLogin = dontCancelSetUserLogin;
    }

    private Timestamp shipBeforeDate;

    @Basic
    @javax.persistence.Column(name = "SHIP_BEFORE_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getShipBeforeDate() {
        return shipBeforeDate;
    }

    public void setShipBeforeDate(Timestamp shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }

    private Timestamp shipAfterDate;

    @Basic
    @javax.persistence.Column(name = "SHIP_AFTER_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getShipAfterDate() {
        return shipAfterDate;
    }

    public void setShipAfterDate(Timestamp shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }

    private Timestamp cancelBackOrderDate;

    @Basic
    @javax.persistence.Column(name = "CANCEL_BACK_ORDER_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getCancelBackOrderDate() {
        return cancelBackOrderDate;
    }

    public void setCancelBackOrderDate(Timestamp cancelBackOrderDate) {
        this.cancelBackOrderDate = cancelBackOrderDate;
    }

    private String overrideGlAccountId;

    @Basic
    @javax.persistence.Column(name = "OVERRIDE_GL_ACCOUNT_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    private String salesOpportunityId;

    @Basic
    @javax.persistence.Column(name = "SALES_OPPORTUNITY_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(String salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    private String changeByUserLoginId;

    @Basic
    @javax.persistence.Column(name = "CHANGE_BY_USER_LOGIN_ID", nullable = true, insertable = true, updatable = true, length = 250)
    public String getChangeByUserLoginId() {
        return changeByUserLoginId;
    }

    public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
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

    private String acctgTagEnumId1;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID1", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(String acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }

    private String acctgTagEnumId2;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID2", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId2() {
        return acctgTagEnumId2;
    }

    public void setAcctgTagEnumId2(String acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }

    private String acctgTagEnumId3;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID3", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId3() {
        return acctgTagEnumId3;
    }

    public void setAcctgTagEnumId3(String acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }

    private String acctgTagEnumId4;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID4", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId4() {
        return acctgTagEnumId4;
    }

    public void setAcctgTagEnumId4(String acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }

    private String acctgTagEnumId5;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID5", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId5() {
        return acctgTagEnumId5;
    }

    public void setAcctgTagEnumId5(String acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }

    private String acctgTagEnumId6;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID6", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId6() {
        return acctgTagEnumId6;
    }

    public void setAcctgTagEnumId6(String acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }

    private String acctgTagEnumId7;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID7", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId7() {
        return acctgTagEnumId7;
    }

    public void setAcctgTagEnumId7(String acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }

    private String acctgTagEnumId8;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID8", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId8() {
        return acctgTagEnumId8;
    }

    public void setAcctgTagEnumId8(String acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }

    private String acctgTagEnumId9;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID9", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId9() {
        return acctgTagEnumId9;
    }

    public void setAcctgTagEnumId9(String acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }

    private String acctgTagEnumId10;

    @Basic
    @javax.persistence.Column(name = "ACCTG_TAG_ENUM_ID10", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAcctgTagEnumId10() {
        return acctgTagEnumId10;
    }

    public void setAcctgTagEnumId10(String acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (acctgTagEnumId1 != null ? !acctgTagEnumId1.equals(orderItem.acctgTagEnumId1) : orderItem.acctgTagEnumId1 != null)
            return false;
        if (acctgTagEnumId10 != null ? !acctgTagEnumId10.equals(orderItem.acctgTagEnumId10) : orderItem.acctgTagEnumId10 != null)
            return false;
        if (acctgTagEnumId2 != null ? !acctgTagEnumId2.equals(orderItem.acctgTagEnumId2) : orderItem.acctgTagEnumId2 != null)
            return false;
        if (acctgTagEnumId3 != null ? !acctgTagEnumId3.equals(orderItem.acctgTagEnumId3) : orderItem.acctgTagEnumId3 != null)
            return false;
        if (acctgTagEnumId4 != null ? !acctgTagEnumId4.equals(orderItem.acctgTagEnumId4) : orderItem.acctgTagEnumId4 != null)
            return false;
        if (acctgTagEnumId5 != null ? !acctgTagEnumId5.equals(orderItem.acctgTagEnumId5) : orderItem.acctgTagEnumId5 != null)
            return false;
        if (acctgTagEnumId6 != null ? !acctgTagEnumId6.equals(orderItem.acctgTagEnumId6) : orderItem.acctgTagEnumId6 != null)
            return false;
        if (acctgTagEnumId7 != null ? !acctgTagEnumId7.equals(orderItem.acctgTagEnumId7) : orderItem.acctgTagEnumId7 != null)
            return false;
        if (acctgTagEnumId8 != null ? !acctgTagEnumId8.equals(orderItem.acctgTagEnumId8) : orderItem.acctgTagEnumId8 != null)
            return false;
        if (acctgTagEnumId9 != null ? !acctgTagEnumId9.equals(orderItem.acctgTagEnumId9) : orderItem.acctgTagEnumId9 != null)
            return false;
        if (autoCancelDate != null ? !autoCancelDate.equals(orderItem.autoCancelDate) : orderItem.autoCancelDate != null)
            return false;
        if (budgetId != null ? !budgetId.equals(orderItem.budgetId) : orderItem.budgetId != null) return false;
        if (budgetItemSeqId != null ? !budgetItemSeqId.equals(orderItem.budgetItemSeqId) : orderItem.budgetItemSeqId != null)
            return false;
        if (cancelBackOrderDate != null ? !cancelBackOrderDate.equals(orderItem.cancelBackOrderDate) : orderItem.cancelBackOrderDate != null)
            return false;
        if (cancelQuantity != null ? !cancelQuantity.equals(orderItem.cancelQuantity) : orderItem.cancelQuantity != null)
            return false;
        if (changeByUserLoginId != null ? !changeByUserLoginId.equals(orderItem.changeByUserLoginId) : orderItem.changeByUserLoginId != null)
            return false;
        if (comments != null ? !comments.equals(orderItem.comments) : orderItem.comments != null) return false;
        if (correspondingPoId != null ? !correspondingPoId.equals(orderItem.correspondingPoId) : orderItem.correspondingPoId != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(orderItem.createdStamp) : orderItem.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(orderItem.createdTxStamp) : orderItem.createdTxStamp != null)
            return false;
        if (deploymentId != null ? !deploymentId.equals(orderItem.deploymentId) : orderItem.deploymentId != null)
            return false;
        if (dontCancelSetDate != null ? !dontCancelSetDate.equals(orderItem.dontCancelSetDate) : orderItem.dontCancelSetDate != null)
            return false;
        if (dontCancelSetUserLogin != null ? !dontCancelSetUserLogin.equals(orderItem.dontCancelSetUserLogin) : orderItem.dontCancelSetUserLogin != null)
            return false;
        if (estimatedDeliveryDate != null ? !estimatedDeliveryDate.equals(orderItem.estimatedDeliveryDate) : orderItem.estimatedDeliveryDate != null)
            return false;
        if (estimatedShipDate != null ? !estimatedShipDate.equals(orderItem.estimatedShipDate) : orderItem.estimatedShipDate != null)
            return false;
        if (externalId != null ? !externalId.equals(orderItem.externalId) : orderItem.externalId != null) return false;
        if (fromInventoryItemId != null ? !fromInventoryItemId.equals(orderItem.fromInventoryItemId) : orderItem.fromInventoryItemId != null)
            return false;
        if (isItemGroupPrimary != null ? !isItemGroupPrimary.equals(orderItem.isItemGroupPrimary) : orderItem.isItemGroupPrimary != null)
            return false;
        if (isModifiedPrice != null ? !isModifiedPrice.equals(orderItem.isModifiedPrice) : orderItem.isModifiedPrice != null)
            return false;
        if (isPromo != null ? !isPromo.equals(orderItem.isPromo) : orderItem.isPromo != null) return false;
        if (itemDescription != null ? !itemDescription.equals(orderItem.itemDescription) : orderItem.itemDescription != null)
            return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(orderItem.lastUpdatedStamp) : orderItem.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(orderItem.lastUpdatedTxStamp) : orderItem.lastUpdatedTxStamp != null)
            return false;
        if (orderId != null ? !orderId.equals(orderItem.orderId) : orderItem.orderId != null) return false;
        if (orderItemGroupSeqId != null ? !orderItemGroupSeqId.equals(orderItem.orderItemGroupSeqId) : orderItem.orderItemGroupSeqId != null)
            return false;
        if (orderItemSeqId != null ? !orderItemSeqId.equals(orderItem.orderItemSeqId) : orderItem.orderItemSeqId != null)
            return false;
        if (orderItemTypeId != null ? !orderItemTypeId.equals(orderItem.orderItemTypeId) : orderItem.orderItemTypeId != null)
            return false;
        if (overrideGlAccountId != null ? !overrideGlAccountId.equals(orderItem.overrideGlAccountId) : orderItem.overrideGlAccountId != null)
            return false;
        if (prodCatalogId != null ? !prodCatalogId.equals(orderItem.prodCatalogId) : orderItem.prodCatalogId != null)
            return false;
        if (productCategoryId != null ? !productCategoryId.equals(orderItem.productCategoryId) : orderItem.productCategoryId != null)
            return false;
        if (productFeatureId != null ? !productFeatureId.equals(orderItem.productFeatureId) : orderItem.productFeatureId != null)
            return false;
        if (productId != null ? !productId.equals(orderItem.productId) : orderItem.productId != null) return false;
        if (quantity != null ? !quantity.equals(orderItem.quantity) : orderItem.quantity != null) return false;
        if (quoteId != null ? !quoteId.equals(orderItem.quoteId) : orderItem.quoteId != null) return false;
        if (quoteItemSeqId != null ? !quoteItemSeqId.equals(orderItem.quoteItemSeqId) : orderItem.quoteItemSeqId != null)
            return false;
        if (recurringFreqUomId != null ? !recurringFreqUomId.equals(orderItem.recurringFreqUomId) : orderItem.recurringFreqUomId != null)
            return false;
        if (salesOpportunityId != null ? !salesOpportunityId.equals(orderItem.salesOpportunityId) : orderItem.salesOpportunityId != null)
            return false;
        if (selectedAmount != null ? !selectedAmount.equals(orderItem.selectedAmount) : orderItem.selectedAmount != null)
            return false;
        if (shipAfterDate != null ? !shipAfterDate.equals(orderItem.shipAfterDate) : orderItem.shipAfterDate != null)
            return false;
        if (shipBeforeDate != null ? !shipBeforeDate.equals(orderItem.shipBeforeDate) : orderItem.shipBeforeDate != null)
            return false;
        if (shoppingListId != null ? !shoppingListId.equals(orderItem.shoppingListId) : orderItem.shoppingListId != null)
            return false;
        if (shoppingListItemSeqId != null ? !shoppingListItemSeqId.equals(orderItem.shoppingListItemSeqId) : orderItem.shoppingListItemSeqId != null)
            return false;
        if (statusId != null ? !statusId.equals(orderItem.statusId) : orderItem.statusId != null) return false;
        if (subscriptionId != null ? !subscriptionId.equals(orderItem.subscriptionId) : orderItem.subscriptionId != null)
            return false;
        if (supplierProductId != null ? !supplierProductId.equals(orderItem.supplierProductId) : orderItem.supplierProductId != null)
            return false;
        if (syncStatusId != null ? !syncStatusId.equals(orderItem.syncStatusId) : orderItem.syncStatusId != null)
            return false;
        if (unitAverageCost != null ? !unitAverageCost.equals(orderItem.unitAverageCost) : orderItem.unitAverageCost != null)
            return false;
        if (unitListPrice != null ? !unitListPrice.equals(orderItem.unitListPrice) : orderItem.unitListPrice != null)
            return false;
        if (unitPrice != null ? !unitPrice.equals(orderItem.unitPrice) : orderItem.unitPrice != null) return false;
        if (unitRecurringPrice != null ? !unitRecurringPrice.equals(orderItem.unitRecurringPrice) : orderItem.unitRecurringPrice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (orderItemSeqId != null ? orderItemSeqId.hashCode() : 0);
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (orderItemTypeId != null ? orderItemTypeId.hashCode() : 0);
        result = 31 * result + (orderItemGroupSeqId != null ? orderItemGroupSeqId.hashCode() : 0);
        result = 31 * result + (isItemGroupPrimary != null ? isItemGroupPrimary.hashCode() : 0);
        result = 31 * result + (fromInventoryItemId != null ? fromInventoryItemId.hashCode() : 0);
        result = 31 * result + (budgetId != null ? budgetId.hashCode() : 0);
        result = 31 * result + (budgetItemSeqId != null ? budgetItemSeqId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (supplierProductId != null ? supplierProductId.hashCode() : 0);
        result = 31 * result + (productFeatureId != null ? productFeatureId.hashCode() : 0);
        result = 31 * result + (prodCatalogId != null ? prodCatalogId.hashCode() : 0);
        result = 31 * result + (productCategoryId != null ? productCategoryId.hashCode() : 0);
        result = 31 * result + (isPromo != null ? isPromo.hashCode() : 0);
        result = 31 * result + (quoteId != null ? quoteId.hashCode() : 0);
        result = 31 * result + (quoteItemSeqId != null ? quoteItemSeqId.hashCode() : 0);
        result = 31 * result + (shoppingListId != null ? shoppingListId.hashCode() : 0);
        result = 31 * result + (shoppingListItemSeqId != null ? shoppingListItemSeqId.hashCode() : 0);
        result = 31 * result + (subscriptionId != null ? subscriptionId.hashCode() : 0);
        result = 31 * result + (deploymentId != null ? deploymentId.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (cancelQuantity != null ? cancelQuantity.hashCode() : 0);
        result = 31 * result + (selectedAmount != null ? selectedAmount.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (unitListPrice != null ? unitListPrice.hashCode() : 0);
        result = 31 * result + (unitAverageCost != null ? unitAverageCost.hashCode() : 0);
        result = 31 * result + (unitRecurringPrice != null ? unitRecurringPrice.hashCode() : 0);
        result = 31 * result + (isModifiedPrice != null ? isModifiedPrice.hashCode() : 0);
        result = 31 * result + (recurringFreqUomId != null ? recurringFreqUomId.hashCode() : 0);
        result = 31 * result + (itemDescription != null ? itemDescription.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (correspondingPoId != null ? correspondingPoId.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (syncStatusId != null ? syncStatusId.hashCode() : 0);
        result = 31 * result + (estimatedShipDate != null ? estimatedShipDate.hashCode() : 0);
        result = 31 * result + (estimatedDeliveryDate != null ? estimatedDeliveryDate.hashCode() : 0);
        result = 31 * result + (autoCancelDate != null ? autoCancelDate.hashCode() : 0);
        result = 31 * result + (dontCancelSetDate != null ? dontCancelSetDate.hashCode() : 0);
        result = 31 * result + (dontCancelSetUserLogin != null ? dontCancelSetUserLogin.hashCode() : 0);
        result = 31 * result + (shipBeforeDate != null ? shipBeforeDate.hashCode() : 0);
        result = 31 * result + (shipAfterDate != null ? shipAfterDate.hashCode() : 0);
        result = 31 * result + (cancelBackOrderDate != null ? cancelBackOrderDate.hashCode() : 0);
        result = 31 * result + (overrideGlAccountId != null ? overrideGlAccountId.hashCode() : 0);
        result = 31 * result + (salesOpportunityId != null ? salesOpportunityId.hashCode() : 0);
        result = 31 * result + (changeByUserLoginId != null ? changeByUserLoginId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId1 != null ? acctgTagEnumId1.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId2 != null ? acctgTagEnumId2.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId3 != null ? acctgTagEnumId3.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId4 != null ? acctgTagEnumId4.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId5 != null ? acctgTagEnumId5.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId6 != null ? acctgTagEnumId6.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId7 != null ? acctgTagEnumId7.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId8 != null ? acctgTagEnumId8.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId9 != null ? acctgTagEnumId9.hashCode() : 0);
        result = 31 * result + (acctgTagEnumId10 != null ? acctgTagEnumId10.hashCode() : 0);
        return result;
    }
}
