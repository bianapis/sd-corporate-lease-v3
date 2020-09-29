package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLeaseArrangementExchangeInputModelCorporateLeaseArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAdministerExchangeInputModel
 */
public class BQAdministerExchangeInputModel   {
  private String corporateLeaseArrangementInstanceReference = null;

  private String administerInstanceReference = null;

  private String administerPreconditions = null;

  private String administerFeatureSchedule = null;

  private String businessService = null;

  private String administerPostconditions = null;

  private String administerServiceType = null;

  private String administerServiceDescription = null;

  private String administerServiceInputsandOuputs = null;

  private String administerServiceWorkProduct = null;

  private String administerServiceName = null;

  private Object administerExchangeActionTaskRecord = null;

  private CRCorporateLeaseArrangementExchangeInputModelCorporateLeaseArrangementExchangeActionRequest administerExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Corporate Lease Arrangement instance 
   * @return corporateLeaseArrangementInstanceReference
  **/

  public String getCorporateLeaseArrangementInstanceReference() {
    return corporateLeaseArrangementInstanceReference;
  }

  public void setCorporateLeaseArrangementInstanceReference(String corporateLeaseArrangementInstanceReference) {
    this.corporateLeaseArrangementInstanceReference = corporateLeaseArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Administer instance 
   * @return administerInstanceReference
  **/

  public String getAdministerInstanceReference() {
    return administerInstanceReference;
  }

  public void setAdministerInstanceReference(String administerInstanceReference) {
    this.administerInstanceReference = administerInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return administerPreconditions
  **/

  public String getAdministerPreconditions() {
    return administerPreconditions;
  }

  public void setAdministerPreconditions(String administerPreconditions) {
    this.administerPreconditions = administerPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return administerFeatureSchedule
  **/

  public String getAdministerFeatureSchedule() {
    return administerFeatureSchedule;
  }

  public void setAdministerFeatureSchedule(String administerFeatureSchedule) {
    this.administerFeatureSchedule = administerFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Corporate Lease Arrangement specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return administerPostconditions
  **/

  public String getAdministerPostconditions() {
    return administerPostconditions;
  }

  public void setAdministerPostconditions(String administerPostconditions) {
    this.administerPostconditions = administerPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return administerServiceType
  **/

  public String getAdministerServiceType() {
    return administerServiceType;
  }

  public void setAdministerServiceType(String administerServiceType) {
    this.administerServiceType = administerServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return administerServiceDescription
  **/

  public String getAdministerServiceDescription() {
    return administerServiceDescription;
  }

  public void setAdministerServiceDescription(String administerServiceDescription) {
    this.administerServiceDescription = administerServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return administerServiceInputsandOuputs
  **/

  public String getAdministerServiceInputsandOuputs() {
    return administerServiceInputsandOuputs;
  }

  public void setAdministerServiceInputsandOuputs(String administerServiceInputsandOuputs) {
    this.administerServiceInputsandOuputs = administerServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return administerServiceWorkProduct
  **/

  public String getAdministerServiceWorkProduct() {
    return administerServiceWorkProduct;
  }

  public void setAdministerServiceWorkProduct(String administerServiceWorkProduct) {
    this.administerServiceWorkProduct = administerServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return administerServiceName
  **/

  public String getAdministerServiceName() {
    return administerServiceName;
  }

  public void setAdministerServiceName(String administerServiceName) {
    this.administerServiceName = administerServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return administerExchangeActionTaskRecord
  **/

  public Object getAdministerExchangeActionTaskRecord() {
    return administerExchangeActionTaskRecord;
  }

  public void setAdministerExchangeActionTaskRecord(Object administerExchangeActionTaskRecord) {
    this.administerExchangeActionTaskRecord = administerExchangeActionTaskRecord;
  }


  /**
   * Get administerExchangeActionRequest
   * @return administerExchangeActionRequest
  **/

  public CRCorporateLeaseArrangementExchangeInputModelCorporateLeaseArrangementExchangeActionRequest getAdministerExchangeActionRequest() {
    return administerExchangeActionRequest;
  }

  public void setAdministerExchangeActionRequest(CRCorporateLeaseArrangementExchangeInputModelCorporateLeaseArrangementExchangeActionRequest administerExchangeActionRequest) {
    this.administerExchangeActionRequest = administerExchangeActionRequest;
  }


}

