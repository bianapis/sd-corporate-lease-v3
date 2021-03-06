package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAdministerUpdateOutputModel
 */
public class BQAdministerUpdateOutputModel   {
  private String administerPreconditions = null;

  private String administerFeatureSchedule = null;

  private String businessService = null;

  private String administerPostconditions = null;

  private String administerServiceType = null;

  private String administerServiceDescription = null;

  private String administerServiceInputsandOuputs = null;

  private String administerServiceWorkProduct = null;

  private String administerServiceName = null;

  private String administerUpdateActionTaskReference = null;

  private Object administerUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return administerUpdateActionTaskReference
  **/

  public String getAdministerUpdateActionTaskReference() {
    return administerUpdateActionTaskReference;
  }

  public void setAdministerUpdateActionTaskReference(String administerUpdateActionTaskReference) {
    this.administerUpdateActionTaskReference = administerUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return administerUpdateActionTaskRecord
  **/

  public Object getAdministerUpdateActionTaskRecord() {
    return administerUpdateActionTaskRecord;
  }

  public void setAdministerUpdateActionTaskRecord(Object administerUpdateActionTaskRecord) {
    this.administerUpdateActionTaskRecord = administerUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

