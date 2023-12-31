package com.utah.frame.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   结算行细行
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table intg_settlement_line
 */
public class IntgProjectLine {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   租户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.tenant_id
     *
     * @mbg.generated
     */
    private String tenantId;

    /**
     * Database Column Remarks:
     *   公司id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     * Database Column Remarks:
     *   买方唯一识别号(公司税号)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.buyer_tax_number
     *
     * @mbg.generated
     */
    private String buyerTaxNumber;

    /**
     * Database Column Remarks:
     *   买方名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.buyer_name
     *
     * @mbg.generated
     */
    private String buyerName;

    /**
     * Database Column Remarks:
     *   卖方唯一识别号(公司税号)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.supplier_tax_number
     *
     * @mbg.generated
     */
    private String supplierTaxNumber;

    /**
     * Database Column Remarks:
     *   卖方名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.supplier_name
     *
     * @mbg.generated
     */
    private String supplierName;

    /**
     * Database Column Remarks:
     *   单据类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * Database Column Remarks:
     *   关联bp结算数据编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.bp_number
     *
     * @mbg.generated
     */
    private String bpNumber;

    /**
     * Database Column Remarks:
     *   关联bp结算行数据编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.bp_line_number
     *
     * @mbg.generated
     */
    private String bpLineNumber;

    /**
     * Database Column Remarks:
     *   文档id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.document_id
     *
     * @mbg.generated
     */
    private String documentId;

    /**
     * Database Column Remarks:
     *   处理状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.deal_status
     *
     * @mbg.generated
     */
    private String dealStatus;

    /**
     * Database Column Remarks:
     *   处理备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.deal_remark
     *
     * @mbg.generated
     */
    private String dealRemark;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.order_number
     *
     * @mbg.generated
     */
    private String orderNumber;

    /**
     * Database Column Remarks:
     *   订单行号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.order_line_number
     *
     * @mbg.generated
     */
    private String orderLineNumber;

    /**
     * Database Column Remarks:
     *   收货单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.receipt_number
     *
     * @mbg.generated
     */
    private String receiptNumber;

    /**
     * Database Column Remarks:
     *   收货单行号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.receipt_line_number
     *
     * @mbg.generated
     */
    private String receiptLineNumber;

    /**
     * Database Column Remarks:
     *   货币(默认值"CNY")
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.currency_code
     *
     * @mbg.generated
     */
    private String currencyCode;

    /**
     * Database Column Remarks:
     *   收货数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.quantity
     *
     * @mbg.generated
     */
    private BigDecimal quantity;

    /**
     * Database Column Remarks:
     *   单位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.unit_code
     *
     * @mbg.generated
     */
    private String unitCode;

    /**
     * Database Column Remarks:
     *   金额(不含税金额)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   税额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.tax_amount
     *
     * @mbg.generated
     */
    private BigDecimal taxAmount;

    /**
     * Database Column Remarks:
     *   物料名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.item_name
     *
     * @mbg.generated
     */
    private String itemName;

    /**
     * Database Column Remarks:
     *   物料代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.item_code
     *
     * @mbg.generated
     */
    private String itemCode;

    /**
     * Database Column Remarks:
     *   规模型号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.model_name
     *
     * @mbg.generated
     */
    private String modelName;

    /**
     * Database Column Remarks:
     *   税率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.tax_rate
     *
     * @mbg.generated
     */
    private BigDecimal taxRate;

    /**
     * Database Column Remarks:
     *   单价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.unit_price
     *
     * @mbg.generated
     */
    private BigDecimal unitPrice;

    /**
     * Database Column Remarks:
     *   搜索字段拼接值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.full_text
     *
     * @mbg.generated
     */
    private String fullText;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * Database Column Remarks:
     *   更新人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * Database Column Remarks:
     *   是否删除;0-未删除，1-已删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.is_deleted
     *
     * @mbg.generated
     */
    private Long isDeleted;

    /**
     * Database Column Remarks:
     *   乐观锁版本
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intg_settlement_line.version
     *
     * @mbg.generated
     */
    private Long version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.id
     *
     * @return the value of intg_settlement_line.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.id
     *
     * @param id the value for intg_settlement_line.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.tenant_id
     *
     * @return the value of intg_settlement_line.tenant_id
     *
     * @mbg.generated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.tenant_id
     *
     * @param tenantId the value for intg_settlement_line.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.company_id
     *
     * @return the value of intg_settlement_line.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.company_id
     *
     * @param companyId the value for intg_settlement_line.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.buyer_tax_number
     *
     * @return the value of intg_settlement_line.buyer_tax_number
     *
     * @mbg.generated
     */
    public String getBuyerTaxNumber() {
        return buyerTaxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.buyer_tax_number
     *
     * @param buyerTaxNumber the value for intg_settlement_line.buyer_tax_number
     *
     * @mbg.generated
     */
    public void setBuyerTaxNumber(String buyerTaxNumber) {
        this.buyerTaxNumber = buyerTaxNumber == null ? null : buyerTaxNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.buyer_name
     *
     * @return the value of intg_settlement_line.buyer_name
     *
     * @mbg.generated
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.buyer_name
     *
     * @param buyerName the value for intg_settlement_line.buyer_name
     *
     * @mbg.generated
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.supplier_tax_number
     *
     * @return the value of intg_settlement_line.supplier_tax_number
     *
     * @mbg.generated
     */
    public String getSupplierTaxNumber() {
        return supplierTaxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.supplier_tax_number
     *
     * @param supplierTaxNumber the value for intg_settlement_line.supplier_tax_number
     *
     * @mbg.generated
     */
    public void setSupplierTaxNumber(String supplierTaxNumber) {
        this.supplierTaxNumber = supplierTaxNumber == null ? null : supplierTaxNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.supplier_name
     *
     * @return the value of intg_settlement_line.supplier_name
     *
     * @mbg.generated
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.supplier_name
     *
     * @param supplierName the value for intg_settlement_line.supplier_name
     *
     * @mbg.generated
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.type
     *
     * @return the value of intg_settlement_line.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.type
     *
     * @param type the value for intg_settlement_line.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.bp_number
     *
     * @return the value of intg_settlement_line.bp_number
     *
     * @mbg.generated
     */
    public String getBpNumber() {
        return bpNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.bp_number
     *
     * @param bpNumber the value for intg_settlement_line.bp_number
     *
     * @mbg.generated
     */
    public void setBpNumber(String bpNumber) {
        this.bpNumber = bpNumber == null ? null : bpNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.bp_line_number
     *
     * @return the value of intg_settlement_line.bp_line_number
     *
     * @mbg.generated
     */
    public String getBpLineNumber() {
        return bpLineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.bp_line_number
     *
     * @param bpLineNumber the value for intg_settlement_line.bp_line_number
     *
     * @mbg.generated
     */
    public void setBpLineNumber(String bpLineNumber) {
        this.bpLineNumber = bpLineNumber == null ? null : bpLineNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.document_id
     *
     * @return the value of intg_settlement_line.document_id
     *
     * @mbg.generated
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.document_id
     *
     * @param documentId the value for intg_settlement_line.document_id
     *
     * @mbg.generated
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId == null ? null : documentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.deal_status
     *
     * @return the value of intg_settlement_line.deal_status
     *
     * @mbg.generated
     */
    public String getDealStatus() {
        return dealStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.deal_status
     *
     * @param dealStatus the value for intg_settlement_line.deal_status
     *
     * @mbg.generated
     */
    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus == null ? null : dealStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.deal_remark
     *
     * @return the value of intg_settlement_line.deal_remark
     *
     * @mbg.generated
     */
    public String getDealRemark() {
        return dealRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.deal_remark
     *
     * @param dealRemark the value for intg_settlement_line.deal_remark
     *
     * @mbg.generated
     */
    public void setDealRemark(String dealRemark) {
        this.dealRemark = dealRemark == null ? null : dealRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.order_number
     *
     * @return the value of intg_settlement_line.order_number
     *
     * @mbg.generated
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.order_number
     *
     * @param orderNumber the value for intg_settlement_line.order_number
     *
     * @mbg.generated
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.order_line_number
     *
     * @return the value of intg_settlement_line.order_line_number
     *
     * @mbg.generated
     */
    public String getOrderLineNumber() {
        return orderLineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.order_line_number
     *
     * @param orderLineNumber the value for intg_settlement_line.order_line_number
     *
     * @mbg.generated
     */
    public void setOrderLineNumber(String orderLineNumber) {
        this.orderLineNumber = orderLineNumber == null ? null : orderLineNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.receipt_number
     *
     * @return the value of intg_settlement_line.receipt_number
     *
     * @mbg.generated
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.receipt_number
     *
     * @param receiptNumber the value for intg_settlement_line.receipt_number
     *
     * @mbg.generated
     */
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber == null ? null : receiptNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.receipt_line_number
     *
     * @return the value of intg_settlement_line.receipt_line_number
     *
     * @mbg.generated
     */
    public String getReceiptLineNumber() {
        return receiptLineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.receipt_line_number
     *
     * @param receiptLineNumber the value for intg_settlement_line.receipt_line_number
     *
     * @mbg.generated
     */
    public void setReceiptLineNumber(String receiptLineNumber) {
        this.receiptLineNumber = receiptLineNumber == null ? null : receiptLineNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.currency_code
     *
     * @return the value of intg_settlement_line.currency_code
     *
     * @mbg.generated
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.currency_code
     *
     * @param currencyCode the value for intg_settlement_line.currency_code
     *
     * @mbg.generated
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.quantity
     *
     * @return the value of intg_settlement_line.quantity
     *
     * @mbg.generated
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.quantity
     *
     * @param quantity the value for intg_settlement_line.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.unit_code
     *
     * @return the value of intg_settlement_line.unit_code
     *
     * @mbg.generated
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.unit_code
     *
     * @param unitCode the value for intg_settlement_line.unit_code
     *
     * @mbg.generated
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.amount
     *
     * @return the value of intg_settlement_line.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.amount
     *
     * @param amount the value for intg_settlement_line.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.tax_amount
     *
     * @return the value of intg_settlement_line.tax_amount
     *
     * @mbg.generated
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.tax_amount
     *
     * @param taxAmount the value for intg_settlement_line.tax_amount
     *
     * @mbg.generated
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.item_name
     *
     * @return the value of intg_settlement_line.item_name
     *
     * @mbg.generated
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.item_name
     *
     * @param itemName the value for intg_settlement_line.item_name
     *
     * @mbg.generated
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.item_code
     *
     * @return the value of intg_settlement_line.item_code
     *
     * @mbg.generated
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.item_code
     *
     * @param itemCode the value for intg_settlement_line.item_code
     *
     * @mbg.generated
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.model_name
     *
     * @return the value of intg_settlement_line.model_name
     *
     * @mbg.generated
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.model_name
     *
     * @param modelName the value for intg_settlement_line.model_name
     *
     * @mbg.generated
     */
    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.tax_rate
     *
     * @return the value of intg_settlement_line.tax_rate
     *
     * @mbg.generated
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.tax_rate
     *
     * @param taxRate the value for intg_settlement_line.tax_rate
     *
     * @mbg.generated
     */
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.unit_price
     *
     * @return the value of intg_settlement_line.unit_price
     *
     * @mbg.generated
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.unit_price
     *
     * @param unitPrice the value for intg_settlement_line.unit_price
     *
     * @mbg.generated
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.full_text
     *
     * @return the value of intg_settlement_line.full_text
     *
     * @mbg.generated
     */
    public String getFullText() {
        return fullText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.full_text
     *
     * @param fullText the value for intg_settlement_line.full_text
     *
     * @mbg.generated
     */
    public void setFullText(String fullText) {
        this.fullText = fullText == null ? null : fullText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.created_by
     *
     * @return the value of intg_settlement_line.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.created_by
     *
     * @param createdBy the value for intg_settlement_line.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.created_at
     *
     * @return the value of intg_settlement_line.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.created_at
     *
     * @param createdAt the value for intg_settlement_line.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.updated_by
     *
     * @return the value of intg_settlement_line.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.updated_by
     *
     * @param updatedBy the value for intg_settlement_line.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.updated_at
     *
     * @return the value of intg_settlement_line.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.updated_at
     *
     * @param updatedAt the value for intg_settlement_line.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.is_deleted
     *
     * @return the value of intg_settlement_line.is_deleted
     *
     * @mbg.generated
     */
    public Long getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.is_deleted
     *
     * @param isDeleted the value for intg_settlement_line.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Long isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intg_settlement_line.version
     *
     * @return the value of intg_settlement_line.version
     *
     * @mbg.generated
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intg_settlement_line.version
     *
     * @param version the value for intg_settlement_line.version
     *
     * @mbg.generated
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}