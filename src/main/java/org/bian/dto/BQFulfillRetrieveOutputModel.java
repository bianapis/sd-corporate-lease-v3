package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFulfillRetrieveOutputModelFulfillInstanceAnalysis;
import org.bian.dto.BQFulfillRetrieveOutputModelFulfillInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFulfillRetrieveOutputModel
 */
public class BQFulfillRetrieveOutputModel   {
  private String fulfillPreconditions = null;

  private String fulfillFeatureSchedule = null;

  private String businessService = null;

  private String fulfillPostconditions = null;

  private String fulfillServiceType = null;

  private String fulfillServiceDescription = null;

  private String fulfillServiceInputsandOuputs = null;

  private String fulfillServiceWorkProduct = null;

  private String fulfillRetrieveActionTaskReference = null;

  private Object fulfillRetrieveActionTaskRecord = null;

  private String fulfillRetrieveActionResponse = null;

  private BQFulfillRetrieveOutputModelFulfillInstanceReport fulfillInstanceReport = null;

  private BQFulfillRetrieveOutputModelFulfillInstanceAnalysis fulfillInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return fulfillPreconditions
  **/

  public String getFulfillPreconditions() {
    return fulfillPreconditions;
  }

  public void setFulfillPreconditions(String fulfillPreconditions) {
    this.fulfillPreconditions = fulfillPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return fulfillFeatureSchedule
  **/

  public String getFulfillFeatureSchedule() {
    return fulfillFeatureSchedule;
  }

  public void setFulfillFeatureSchedule(String fulfillFeatureSchedule) {
    this.fulfillFeatureSchedule = fulfillFeatureSchedule;
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
   * @return fulfillPostconditions
  **/

  public String getFulfillPostconditions() {
    return fulfillPostconditions;
  }

  public void setFulfillPostconditions(String fulfillPostconditions) {
    this.fulfillPostconditions = fulfillPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return fulfillServiceType
  **/

  public String getFulfillServiceType() {
    return fulfillServiceType;
  }

  public void setFulfillServiceType(String fulfillServiceType) {
    this.fulfillServiceType = fulfillServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return fulfillServiceDescription
  **/

  public String getFulfillServiceDescription() {
    return fulfillServiceDescription;
  }

  public void setFulfillServiceDescription(String fulfillServiceDescription) {
    this.fulfillServiceDescription = fulfillServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return fulfillServiceInputsandOuputs
  **/

  public String getFulfillServiceInputsandOuputs() {
    return fulfillServiceInputsandOuputs;
  }

  public void setFulfillServiceInputsandOuputs(String fulfillServiceInputsandOuputs) {
    this.fulfillServiceInputsandOuputs = fulfillServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return fulfillServiceWorkProduct
  **/

  public String getFulfillServiceWorkProduct() {
    return fulfillServiceWorkProduct;
  }

  public void setFulfillServiceWorkProduct(String fulfillServiceWorkProduct) {
    this.fulfillServiceWorkProduct = fulfillServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fulfill instance retrieve service call 
   * @return fulfillRetrieveActionTaskReference
  **/

  public String getFulfillRetrieveActionTaskReference() {
    return fulfillRetrieveActionTaskReference;
  }

  public void setFulfillRetrieveActionTaskReference(String fulfillRetrieveActionTaskReference) {
    this.fulfillRetrieveActionTaskReference = fulfillRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fulfillRetrieveActionTaskRecord
  **/

  public Object getFulfillRetrieveActionTaskRecord() {
    return fulfillRetrieveActionTaskRecord;
  }

  public void setFulfillRetrieveActionTaskRecord(Object fulfillRetrieveActionTaskRecord) {
    this.fulfillRetrieveActionTaskRecord = fulfillRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fulfillRetrieveActionResponse
  **/

  public String getFulfillRetrieveActionResponse() {
    return fulfillRetrieveActionResponse;
  }

  public void setFulfillRetrieveActionResponse(String fulfillRetrieveActionResponse) {
    this.fulfillRetrieveActionResponse = fulfillRetrieveActionResponse;
  }


  /**
   * Get fulfillInstanceReport
   * @return fulfillInstanceReport
  **/

  public BQFulfillRetrieveOutputModelFulfillInstanceReport getFulfillInstanceReport() {
    return fulfillInstanceReport;
  }

  public void setFulfillInstanceReport(BQFulfillRetrieveOutputModelFulfillInstanceReport fulfillInstanceReport) {
    this.fulfillInstanceReport = fulfillInstanceReport;
  }


  /**
   * Get fulfillInstanceAnalysis
   * @return fulfillInstanceAnalysis
  **/

  public BQFulfillRetrieveOutputModelFulfillInstanceAnalysis getFulfillInstanceAnalysis() {
    return fulfillInstanceAnalysis;
  }

  public void setFulfillInstanceAnalysis(BQFulfillRetrieveOutputModelFulfillInstanceAnalysis fulfillInstanceAnalysis) {
    this.fulfillInstanceAnalysis = fulfillInstanceAnalysis;
  }


}

