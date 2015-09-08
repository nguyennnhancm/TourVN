package tourvn.order.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@javax.persistence.Table(name = "order_header")
public class OrderHeader {
    private String orderId;

    @Id
    @javax.persistence.Column(name = "ORDER_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private String orderTypeId;

    @Basic
    @javax.persistence.Column(name = "ORDER_TYPE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    private String orderName;

    @Basic
    @javax.persistence.Column(name = "ORDER_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
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

    private String salesChannelEnumId;

    @Basic
    @javax.persistence.Column(name = "SALES_CHANNEL_ENUM_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    private Timestamp orderDate;

    @Basic
    @javax.persistence.Column(name = "ORDER_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    private String priority;

    @Basic
    @javax.persistence.Column(name = "PRIORITY", nullable = true, insertable = true, updatable = true, length = 1)
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    private Timestamp entryDate;

    @Basic
    @javax.persistence.Column(name = "ENTRY_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Timestamp entryDate) {
        this.entryDate = entryDate;
    }

    private Timestamp pickSheetPrintedDate;

    @Basic
    @javax.persistence.Column(name = "PICK_SHEET_PRINTED_DATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getPickSheetPrintedDate() {
        return pickSheetPrintedDate;
    }

    public void setPickSheetPrintedDate(Timestamp pickSheetPrintedDate) {
        this.pickSheetPrintedDate = pickSheetPrintedDate;
    }

    private String visitId;

    @Basic
    @javax.persistence.Column(name = "VISIT_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
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

    private String createdBy;

    @Basic
    @javax.persistence.Column(name = "CREATED_BY", nullable = true, insertable = true, updatable = true, length = 250)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private String firstAttemptOrderId;

    @Basic
    @javax.persistence.Column(name = "FIRST_ATTEMPT_ORDER_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getFirstAttemptOrderId() {
        return firstAttemptOrderId;
    }

    public void setFirstAttemptOrderId(String firstAttemptOrderId) {
        this.firstAttemptOrderId = firstAttemptOrderId;
    }

    private String currencyUom;

    @Basic
    @javax.persistence.Column(name = "CURRENCY_UOM", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCurrencyUom() {
        return currencyUom;
    }

    public void setCurrencyUom(String currencyUom) {
        this.currencyUom = currencyUom;
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

    private String billingAccountId;

    @Basic
    @javax.persistence.Column(name = "BILLING_ACCOUNT_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    private String originFacilityId;

    @Basic
    @javax.persistence.Column(name = "ORIGIN_FACILITY_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    private String webSiteId;

    @Basic
    @javax.persistence.Column(name = "WEB_SITE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    private String productStoreId;

    @Basic
    @javax.persistence.Column(name = "PRODUCT_STORE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    private String terminalId;

    @Basic
    @javax.persistence.Column(name = "TERMINAL_ID", nullable = true, insertable = true, updatable = true, length = 60)
    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    private String transactionId;

    @Basic
    @javax.persistence.Column(name = "TRANSACTION_ID", nullable = true, insertable = true, updatable = true, length = 60)
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    private String autoOrderShoppingListId;

    @Basic
    @javax.persistence.Column(name = "AUTO_ORDER_SHOPPING_LIST_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getAutoOrderShoppingListId() {
        return autoOrderShoppingListId;
    }

    public void setAutoOrderShoppingListId(String autoOrderShoppingListId) {
        this.autoOrderShoppingListId = autoOrderShoppingListId;
    }

    private String needsInventoryIssuance;

    @Basic
    @javax.persistence.Column(name = "NEEDS_INVENTORY_ISSUANCE", nullable = true, insertable = true, updatable = true, length = 1)
    public String getNeedsInventoryIssuance() {
        return needsInventoryIssuance;
    }

    public void setNeedsInventoryIssuance(String needsInventoryIssuance) {
        this.needsInventoryIssuance = needsInventoryIssuance;
    }

    private String isRushOrder;

    @Basic
    @javax.persistence.Column(name = "IS_RUSH_ORDER", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIsRushOrder() {
        return isRushOrder;
    }

    public void setIsRushOrder(String isRushOrder) {
        this.isRushOrder = isRushOrder;
    }

    private String internalCode;

    @Basic
    @javax.persistence.Column(name = "INTERNAL_CODE", nullable = true, insertable = true, updatable = true, length = 60)
    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    private BigDecimal remainingSubTotal;

    @Basic
    @javax.persistence.Column(name = "REMAINING_SUB_TOTAL", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getRemainingSubTotal() {
        return remainingSubTotal;
    }

    public void setRemainingSubTotal(BigDecimal remainingSubTotal) {
        this.remainingSubTotal = remainingSubTotal;
    }

    private BigDecimal grandTotal;

    @Basic
    @javax.persistence.Column(name = "GRAND_TOTAL", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    private String isViewed;

    @Basic
    @javax.persistence.Column(name = "IS_VIEWED", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIsViewed() {
        return isViewed;
    }

    public void setIsViewed(String isViewed) {
        this.isViewed = isViewed;
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

    private String billFromPartyId;

    @Basic
    @javax.persistence.Column(name = "BILL_FROM_PARTY_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getBillFromPartyId() {
        return billFromPartyId;
    }

    public void setBillFromPartyId(String billFromPartyId) {
        this.billFromPartyId = billFromPartyId;
    }

    private String billToPartyId;

    @Basic
    @javax.persistence.Column(name = "BILL_TO_PARTY_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getBillToPartyId() {
        return billToPartyId;
    }

    public void setBillToPartyId(String billToPartyId) {
        this.billToPartyId = billToPartyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderHeader that = (OrderHeader) o;

        if (autoOrderShoppingListId != null ? !autoOrderShoppingListId.equals(that.autoOrderShoppingListId) : that.autoOrderShoppingListId != null)
            return false;
        if (billFromPartyId != null ? !billFromPartyId.equals(that.billFromPartyId) : that.billFromPartyId != null)
            return false;
        if (billToPartyId != null ? !billToPartyId.equals(that.billToPartyId) : that.billToPartyId != null)
            return false;
        if (billingAccountId != null ? !billingAccountId.equals(that.billingAccountId) : that.billingAccountId != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdStamp != null ? !createdStamp.equals(that.createdStamp) : that.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(that.createdTxStamp) : that.createdTxStamp != null)
            return false;
        if (currencyUom != null ? !currencyUom.equals(that.currencyUom) : that.currencyUom != null) return false;
        if (entryDate != null ? !entryDate.equals(that.entryDate) : that.entryDate != null) return false;
        if (externalId != null ? !externalId.equals(that.externalId) : that.externalId != null) return false;
        if (firstAttemptOrderId != null ? !firstAttemptOrderId.equals(that.firstAttemptOrderId) : that.firstAttemptOrderId != null)
            return false;
        if (grandTotal != null ? !grandTotal.equals(that.grandTotal) : that.grandTotal != null) return false;
        if (internalCode != null ? !internalCode.equals(that.internalCode) : that.internalCode != null) return false;
        if (isRushOrder != null ? !isRushOrder.equals(that.isRushOrder) : that.isRushOrder != null) return false;
        if (isViewed != null ? !isViewed.equals(that.isViewed) : that.isViewed != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(that.lastUpdatedStamp) : that.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(that.lastUpdatedTxStamp) : that.lastUpdatedTxStamp != null)
            return false;
        if (needsInventoryIssuance != null ? !needsInventoryIssuance.equals(that.needsInventoryIssuance) : that.needsInventoryIssuance != null)
            return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (orderName != null ? !orderName.equals(that.orderName) : that.orderName != null) return false;
        if (orderTypeId != null ? !orderTypeId.equals(that.orderTypeId) : that.orderTypeId != null) return false;
        if (originFacilityId != null ? !originFacilityId.equals(that.originFacilityId) : that.originFacilityId != null)
            return false;
        if (pickSheetPrintedDate != null ? !pickSheetPrintedDate.equals(that.pickSheetPrintedDate) : that.pickSheetPrintedDate != null)
            return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (productStoreId != null ? !productStoreId.equals(that.productStoreId) : that.productStoreId != null)
            return false;
        if (remainingSubTotal != null ? !remainingSubTotal.equals(that.remainingSubTotal) : that.remainingSubTotal != null)
            return false;
        if (salesChannelEnumId != null ? !salesChannelEnumId.equals(that.salesChannelEnumId) : that.salesChannelEnumId != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (syncStatusId != null ? !syncStatusId.equals(that.syncStatusId) : that.syncStatusId != null) return false;
        if (terminalId != null ? !terminalId.equals(that.terminalId) : that.terminalId != null) return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;
        if (visitId != null ? !visitId.equals(that.visitId) : that.visitId != null) return false;
        if (webSiteId != null ? !webSiteId.equals(that.webSiteId) : that.webSiteId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (orderTypeId != null ? orderTypeId.hashCode() : 0);
        result = 31 * result + (orderName != null ? orderName.hashCode() : 0);
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (salesChannelEnumId != null ? salesChannelEnumId.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (entryDate != null ? entryDate.hashCode() : 0);
        result = 31 * result + (pickSheetPrintedDate != null ? pickSheetPrintedDate.hashCode() : 0);
        result = 31 * result + (visitId != null ? visitId.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (firstAttemptOrderId != null ? firstAttemptOrderId.hashCode() : 0);
        result = 31 * result + (currencyUom != null ? currencyUom.hashCode() : 0);
        result = 31 * result + (syncStatusId != null ? syncStatusId.hashCode() : 0);
        result = 31 * result + (billingAccountId != null ? billingAccountId.hashCode() : 0);
        result = 31 * result + (originFacilityId != null ? originFacilityId.hashCode() : 0);
        result = 31 * result + (webSiteId != null ? webSiteId.hashCode() : 0);
        result = 31 * result + (productStoreId != null ? productStoreId.hashCode() : 0);
        result = 31 * result + (terminalId != null ? terminalId.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (autoOrderShoppingListId != null ? autoOrderShoppingListId.hashCode() : 0);
        result = 31 * result + (needsInventoryIssuance != null ? needsInventoryIssuance.hashCode() : 0);
        result = 31 * result + (isRushOrder != null ? isRushOrder.hashCode() : 0);
        result = 31 * result + (internalCode != null ? internalCode.hashCode() : 0);
        result = 31 * result + (remainingSubTotal != null ? remainingSubTotal.hashCode() : 0);
        result = 31 * result + (grandTotal != null ? grandTotal.hashCode() : 0);
        result = 31 * result + (isViewed != null ? isViewed.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (billFromPartyId != null ? billFromPartyId.hashCode() : 0);
        result = 31 * result + (billToPartyId != null ? billToPartyId.hashCode() : 0);
        return result;
    }
}
