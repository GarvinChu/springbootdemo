package com.utah.common;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public interface Constants {

  String RULE_CONFIG_PARAM_MATCH_ENABLED_PARAM = "ruleNames=matchAgainstBPEanbled";
  String RULE_CONFIG_PARAM_MATCH_ENABLED_PARAM_COMMERCIAL = "ruleNames=commercialMatchAgainstBPEanbled";

  String OFFLINE_FAPIAO_MATCH_RESULT_PROPERTY = "offlineFapiaoMatchResultProperty";
  String RULE_CONFIG_PARAM_MATCH_FILTER_CONDITION_PARAM =
      "ruleNames=matchAgainstBPCondition";
  String RULE_CONFIG_PARAM_MATCH_FILTER_CONDITION_PARAM_COMMERCIAL =
      "ruleNames=commercialMatchAgainstBPCondition";
  String RULE_CONFIG_PARAM_MATCH_FILTER_RANGE_PARAM =
      "ruleNames=matchAgainstBPRange";
  String RULE_CONFIG_PARAM_MATCH_CONDITIONS_PARAM = "automaticallyMatchConditions";
  String TARGET_TYPE_FAPIAO = "FAPIAO";

  String TARGET_TYPE_COMMERCIAL_INVOICE = "COMMERCIALINVOICE";
  String CONDITION_FILTERS_KEY_OF_MAP = "conditionFilters";

  String PROFORMA_DERIVED_DOC_TYPE = "ProformaDerivedDocType";

  String PROFORMA_DERIVED_DOC_NUMBER = "ProformaDerivedDocNumber";

  String PROFORMA_DERIVED_DOC_ID = "ProformaDerivedDocId";

  String EVENT_TYPE_INVOICE_MATCH_CONFIRMED = "invoicematchconfirmed";

  String SYNCHRONIZATION_INSTANCE_MATCH = "synchronizationInstanceMatch";

  String META_VAT_TYPE = "vatType";
  String META_INVOICE_TYPE = "invoiceType";

  String FTP_DIR_OUTBOX = "outbox";
  String FTP_DIR_PROCESSING = "processing";
  String FTP_DIR_SUCCESS = "success";

  String FTP_DIR_FAILURE = "failure";

  String CHINA_TAX_NUMBER_KEY = "CN:VAT";
  String PRIMARY_BANK_ACCOUNT_KEY = "CN:PBA";
  String MASTER_TAX_NUMBER_KEY = "BILL_EXPORT_MASTER_TAX_NUMBER_KEY";

  String COMPANY_CITY = "city";
  String COMPANY_STATE = "state";
  String COMPANY_STREET = "street";
  String COMPANY_ZIP = "zip";
  String VOIDED = "VOIDED";

  String PRIMARY = "Primary";
  String ADDITIONAL = "Additional";

  String PROFILE_ID = "profileId";
  String PROFORMA_PROFILE = "baiwang.invoice.proforma.cn.1.0";
  String PROFORMA_CHANGE_PROFILE = "baiwang.invoice.proformachange.cn.1.0";
  String COMMERCIAL_INVOICE_TYPE = "commercialInvoice";
  String COMMERCIAL_INVOICE_PROFILE = "ubl.invoice.2.1.cn";

  String GENERAL_VAT_PROFILE = "baiwang.invoice.fapiao.normal.1.0";
  String EINVOICE_VAT_PROFILE = "baiwang.invoice.einvoice.cn.1.0";
  String SPECIAL_VAT_PROFILE = "baiwang.invoice.fapiao.special.1.0";

  String BP_RELATION_ASSOCIATED_PROCESSED = "BPRELATIONASSOCIATEDPROCESSED";
  String BP_RELATION_ASSOCIATED_PROCESS_FAILED = "BPRELATIONASSOCIATEDPROCESSFAILED";
  String BP_RELATION_REJECTED_PROCESSED = "BPRELATIONREJECTEDPROCESSED";

  String HANDLE_RELATION = "HANDLE_RELATION";

  String BILLING_PROPOSAL_PROFILE_ID = "urn:baiwang.com:profile:cnbillingproposal:ver1.0";
  String BILLING_PROPOSAL_PROFILE = "baiwang.billingproposal.cn.1.0";

  String BILLING_PROPOSAL_CHANGE_PROFILE_ID =
      "urn:baiwang.com:profile:cnbillingproposalchange:ver1.0";
  String BILLING_PROPOSAL_CHANGE_PROFILE = "baiwang.billingproposalchange.cn.1.0";

  String BILLING_PROPOSAL_RESPONSE_PROFILE = "baiwang.billingproposalresponse.cn.1.0";

  //智数
  String BP_ZHISHU_DOCUMENT_PROFILE_ID = "baiwang.billingproposal.cn.1.0.zhishu";
  String BP_ZHISHU_PROFILE_ID = "urn:baiwang.com:profile:cnbillingproposal:ver1.0:zhishu";
  String BP_ZHISHU_NAMESPACE = "urn:oasis:names:specification:ubl:schema:xsd:BillingProposal-2";

  String BILLING_PROPOSAL_DOCUMENT_TYPE = "billingproposal";

  String BILLING_PROPOSAL_MATCHING = "billingProposalMatching";

  String PROFORMA_RESPONSE_PROFILE = "baiwang.proformaresponse.cn.1.0";
  String PROFORMA_RESPONSE_PROFILE_ID = "urn:baiwang.com:profile:cnproformaresponse:ver1.0";

  String TAG_FLIPPED = "flipped";
  String PROPERTY_INVOICE_DOCUMENT_ID = "invoiceDocumentId";
  String PROPERTY_TOTAL = "document.total";

  String SYSTEM_AUTO_APPROVAL = "System auto approval";

  int PRICE_ROUNDING_SCALE = 8;
  int QUANTITY_ROUNDING_SCALE = 8;
  int AMOUNT_ROUNDING_SCALE = 2;
  BigDecimal HUNDRED = new BigDecimal("100.00");

  String CONNECTION_PROPERTY_SELLER_IDENTIFIER = "SellerCode";
  String PROPERTY_COLLABORATION_EDITABLE = "collaborationEditable";

  String BACKEND_ACCEPTED_STATUS = "BusinessAccept";

  String PROFORMA_CHANGE_NUMBER_HEADER = "PC-";
  String TAX_RATE_SYMBOL = "CN_VAT_RATE";
  String CN_TAX_CODE = "CN_VAT_CLASSIFICATION_CODE";
  String INVOICE_ITEM_NAME = "INVOICE_ITEM_NAME";
  String MODEL_NAME = "ModelName";
  String ORIGINAL_UNIT_CODE = "ORIGINAL_UNIT_CODE";
  //PE UNIT
  String UNIT_OF_MEASURE = "Unit of Measure";

  String SUPPLIER_NAME = "supplierName";
  String SUPPLIER_TAX_NUMBERS = "BILL_EXPORT_SUPPLIER_TAX_NUMBER_MAP";
  String UPDATED_TIME = "updatedTime";
  String CODE_MAPPING_LIST = "codeMappingList";

  //product excel
  String UNICODE = "UTF-8";
  Charset UTF8 = Charset.forName(UNICODE);
  String PRODUCT_INFO_EXCEL_TEMPLATE_NAME = "商品目录表模板.xls";
  String PRODUCT_INFO_EXCEL_NAME = "商品目录表.xls";
  String PRODUCT_ITEM_CODE_MAPPING_EXCEL_NAME = "产品名称关联对照表（买家：";
  String PRODUCT_ITEM_CODE_MAPPING_EXCEL_NAME_WITH_ITEM_CODE_NO_SKUID = "尚未维护的商品列表";
  String PRODUCT_ITEM_CODE_MAPPING_UPLOAD_RESULT_EXCEL_NAME = "产品名称关联对照表上传结果报告（买家：";
  String PRODUCT_ITEM_CODE_MAPPING_EXCEL_TEMPLATE_NAME = "产品名称关联对照表（模板）.xlsx";

  String AUTO_FILL_FIELD_ITEM_NAME = "itemName";
  String AUTO_FILL_FIELD_MODEL_NAME = "modelName";
  String AUTO_FILL_FIELD_TAX_RATE = "taxRate";
  String AUTO_FILL_FIELD_UNIT_CODE = "unitCode";
  String AUTO_FILL_FIELD_PRICE = "price";

  String DOCUMENT_CURRENCY = "document.currency";
  String DOCUMENT_ISSUEDATE = "document.issuedate";
  String FAPIAO_SCAN_AP_APP = "Tradeshift.FapiaoScanAP";
  String FAPIAO_SCAN_AP_COMPONENT = "FAPIAOSCANAPMATCHING";
  String ASSIGNMENT_TYPE_FAPIAO_SCAN_AP = "FAPIAOSCANAPMATCHING";
  String FAPIAO_SCAN_AP_COMPONENT_COMMERCIAL = "FAPIAOSCANAPCOMMERCIALMATCHING";
  String ASSIGNMENT_TYPE_FAPIAO_SCAN_AP_COMMERCIAL = "FAPIAOSCANAPCOMMERCIALMATCHING";
  String LANGUAGE_CHINESE = "zh-cn";

  String TRADESHIFT_VENDOR_ID = "tradeshift";
  String PROFORMA_MATCHING_APP = "Tradeshift.ProformaMatching";
  String PROFORMA_MATCHING_COMPONENT = "PROFORMAMATCHING";
  String ASSIGNMENT_TYPE_PROFORMA_MATCHING = "PROFORMAMATCHING";

  String SUBJECT_TYPE_NEW_TASK = "newTask";
  String APPLICATION_JSON = "application/json";
  String TEXT_CSV = "text/csv";
  String LAYOUT_TYPE_ASSIGNMENT = "assignment";

  int UNIT_CODE_MAX_LENGTH = 20;

  String PROFORMA_NUMBER_VALID_PATTERN = "^([0-9a-zA-Z]|-)+$";
  String BP_SEARCH_MULTI_ORDER_PREFIX_PATTERN = "^((P|p)(o|O)|(o|O)(r|R)(d|D)(e|E)(r|R)|订单)[:：].+";
  String BP_SEARCH_MULTI_ORDER_REPLACE_PATTERN = "^((P|p)(o|O)|(o|O)(r|R)(d|D)(e|E)(r|R)|订单)[:：]";
  //    String ORDER_SPLIT_INDICATOR = "[,，;；\\s\\u3000]+";
  String CSV_INPUT_TYPE = "CSV";
  String JSON_INPUT_TYPE = "JSON";
  String EXCEL_INPUT_TYPE = "excel";

  String MAPPING_OPERATION_DELETE = "删除";

  String TRADESHIFT_CONNECTION = "TradeshiftConnection";
  String CONNECTION_ACCEPTED_STATUS = "ACCEPTED";
  int DISPUTE_OPERATION_COMMENTS_LENGTH = 50;
  int VOID_REASON_LENGTH = 50;
  String PERSON_REFERENCE_SPLIT_SYMBOL = ",";

  String PROFORMA_META_KEY_PERSON_REFERENCE = "PROFORMA_META_KEY_PERSON_REFERENCE";
  String PROFORMA_HEADER_FIELD_ISSUE_DATE = "issueDate";
  String PROFORMA_HEADER_FIELD_PERSON_REFERENCE = "personReference";
  String PROFORMA_FLIPPED_STATUS_ISSUE_DATE = "PROFORMA_ISSUE_DATE";

  String PROFORMA_HEADER_REJECT_REASON = "rejectReason";

  long SCHEDULE_SECONDS = 1000L;
  long SCHEDULE_MINUTES = 60 * SCHEDULE_SECONDS;
  long SCHEDULE_DAY = 60000 * 60 * 24L;
  String QUEUE_EXCHANGE_NAME = "proforma.collaboration";
  String AUTO_ACCEPT = "SHOULD_AUTO_ACCEPT";

  String VOID_REQUEST_RESPONSE_COMMENT = "VOID_REQUEST_RESPONSE_COMMENT";
  String VOID_REQUEST_RESPONSE_REASON = "VOID_REQUEST_RESPONSE_REASON";
  String VOID_REQUEST_RESPONSE_STATUS = "VOID_REQUEST_RESPONSE_STATUS";
  String VOID_REQUEST_RESPONSE_STATUS_REJECTED = "Rejected";
  String VOID_REQUEST_RESPONSE_STATUS_ACCEPTED = "Accepted";

  String VOID_REQUEST_STATUS = "VOID_REQUEST_STATUS";
  String VOID_REQUEST_STATUS_SUCCESS = "Success";
  String VOID_REQUEST_STATUS_FAILED = "Failed";

  List<String> VOID_REQUEST_META_KEYS = Arrays.asList(
      Constants.VOID_REQUEST_RESPONSE_COMMENT,
      Constants.VOID_REQUEST_RESPONSE_REASON,
      Constants.VOID_REQUEST_RESPONSE_STATUS,
      Constants.VOID_REQUEST_STATUS);

  String EVENT_SUPPLIER_RECEIVED_BP = "SupplierReceivedBP";
  String EVENT_BUYER_ACK_SUPPLIER_RECEIVED_BP = "BuyerAckSupplierReceivedBP";

  String EVENT_SUPPLIER_RECEIVED_VOIDED_BP = "SupplierReceivedVoidedBP";
  String EVENT_BUYER_ACK_SUPPLIER_RECEIVED_VOIDED_BP = "BuyerAckSupplierReceivedVoidedBP";

  String EVENT_BUYER_RECEIVED_PROFORMA = "BuyerReceivedProforma";
  String EVENT_SUPPLIER_ACK_BUYER_RECEIVED_PROFORMA = "SupplierAckBuyerReceivedProforma";

  String VOID_BP_PROFORMA_LOCK = "void-bp-vs-create-proforma-conflict";

  String EVENT_BUYER_REJECT_PROFORMA_REQUEST = "BuyerRejectProformaRequest";
  String EVENT_SUPPLIER_ACK_REJECT_PROFORMA_REQUEST = "SupplierAckBuyerRejectProformaRequest";

  String EVENT_SUPPLIER_RECEIVED_REJECTED_STATUS = "SupplierReceivedRejectedStatus";
  String EVENT_BUYER_ACK_SUPPLIER_RECEIVED_REJECTED_STATUS = "BuyerAckSupplierReceivedRejectedStatus";

  String REJECT_PROFORMA_OBSOLETE_PREMADE_LOCK = "reject-proforma-obsolete-premade-conflict";

  String EVENT_BUYER_RECEIVED_PROFORMA_CHANGE_OBSOLETE_PREMADE = "BuyerReceivedProformaChangeObsoletePremade";
  String EVENT_SUPPLIER_ACK_BUYER_RECEIVED_PROFORMA_CHANGE_OBSOLETE_PREMADE =
      "SupplierAckBuyerReceivedProformaChangeObsoletePremade";

  String EVENT_SUPPLIER_SENT_VOID_REQUEST = "supplierSentVoidRequest";
  String EVENT_BUYER_RECEIVED_VOID_REQUEST = "buyerReceivedVoidRequest";

  String EVENT_BUYER_REJECT_VOID_REQUEST = "buyerRejectVoidRequest";
  String EVENT_SUPPLIER_RECEIVED_VOID_REQUEST_REJECTED = "supplierReceivedVoidRequestRejected";

  String EVENT_MATCH_INSTANCE_CONFIRMED = "matchInstanceCompleted";
  String EVENT_MATCH_INSTANCE_TERMINATED = "matchInstanceTerminated";

  String PROFORMA_ROUTING_KEY_DATA_SYNC = "proforma.collaboration.data.sync";

  int BP_UPLOAD_FILE_SIZE_LIMIT_MB = 10;
  int MAX_PROFORMA_LINE_COUNT = 5000;

//    ID JOB_IDENTIFIER_SCHEDULE_TRANSACTIONS = ID.wrap(UUID.fromString("3a83ac55-0cab-4dfd-8105-224b463566fd"));
//    ID JOB_IDENTIFIER_SCHEDULE_INSTANCES = ID.wrap(UUID.fromString("01f545f8-1f8f-43fb-b765-8d47559dd981"));
//    ID JOB_IDENTIFIER_SCHEDULE_SOURCE_LINE_VALIDATION =
//            ID.wrap(UUID.fromString("f7c6284b-5890-4947-bcf1-f901ded336bb"));
//    ID JOB_IDENTIFIER_SCHEDULE_PARSE_CSV = ID.wrap(UUID.fromString("61291643-d716-4d9f-8dbf-bd9548ae12b5"));
//    ID JOB_IDENTIFIER_SCHEDULE_SAVE_AND_DISPATCH_BP = ID.wrap(UUID.fromString("0865351c-8f99-43cd-821a-9cea87cb83cf"));
//    ID JOB_IDENTIFIER_SCHEDULE_FETCH_UNTAGGED_BILLING_PROPOSAL_CHANGE =
//            ID.wrap(UUID.fromString("7b619538-b527-4c7b-bc59-4aede4d07830"));
//    ID JOB_IDENTIFIER_SCHEDULE_FETCH_UNTAGGED_BILLING_PROPOSAL =
//            ID.wrap(UUID.fromString("0647c022-098a-45b5-ad3d-9d4a3b0516f5"));
//    ID JOB_IDENTIFIER_SCHEDULE_BPRELATION = ID.wrap(UUID.fromString("bbb2be69-d8d0-4ede-a201-920b38f899e6"));
//    ID JOB_BILLING_PROPOSAL_ARCHIVE = ID.wrap(UUID.fromString("abb2be69-d7d0-4ede-a201-920b38f899e7"));

  int BILLING_PROPOSAL_LINE_AUTO_ARCHIVE_MONTHS = 3;
  int BILLING_PROPOSAL_LINE_AUTO_ARCHIVE_MONTHS_RANGE = 6;

  List<String> FAPIAO_PROFILES = Arrays.asList(GENERAL_VAT_PROFILE, EINVOICE_VAT_PROFILE,
      SPECIAL_VAT_PROFILE);
  List<String> COMMERCIAL_INVOICE_PROFILES = Arrays.asList(COMMERCIAL_INVOICE_PROFILE);
  List<String> TARGET_DOCUMENT_PROFILES = Arrays.asList(GENERAL_VAT_PROFILE, EINVOICE_VAT_PROFILE,
      SPECIAL_VAT_PROFILE, COMMERCIAL_INVOICE_PROFILE);
  String TARGET_DOCUMENT_RECEIVED_PROCESS_SUCCESS = "TARGETDOCUMENTRECEIVEDPROCESSSUCCESS";
  String TARGET_DOCUMENT_REJECTED_PROCESS_SUCCESS = "TARGETDOCUMENTREJECTEDPROCESSSUCCESS";
  String TARGET_DOCUMENT_PROCESS_FAILED = "TARGETDOCUMENTPROCESSFAILED";


  /**
   * 更新对账单行信息
   */
  String UPDATE_PROFORMA_LINE = "updateProformaLine";
}
