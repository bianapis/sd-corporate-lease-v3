package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementExchangeOutputModel
 */
public class CRCorporateLeaseArrangementExchangeOutputModel   {
  private String corporateLeaseArrangementParameterType = null;

  private String corporateLeaseArrangementSelectedOption = null;

  private String corporateLeaseArrangementSchedule = null;

  private String corporateLeaseArrangementStatus = null;

  private String corporateLeaseArrangementExchangeActionTaskReference = null;

  private Object corporateLeaseArrangementExchangeActionTaskRecord = null;

  private String corporateLeaseArrangementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Corporate Lease Arrangement 
   * @return corporateLeaseArrangementParameterType
  **/

  public String getCorporateLeaseArrangementParameterType() {
    return corporateLeaseArrangementParameterType;
  }

  public void setCorporateLeaseArrangementParameterType(String corporateLeaseArrangementParameterType) {
    this.corporateLeaseArrangementParameterType = corporateLeaseArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Corporate Lease Arrangement 
   * @return corporateLeaseArrangementSelectedOption
  **/

  public String getCorporateLeaseArrangementSelectedOption() {
    return corporateLeaseArrangementSelectedOption;
  }

  public void setCorporateLeaseArrangementSelectedOption(String corporateLeaseArrangementSelectedOption) {
    this.corporateLeaseArrangementSelectedOption = corporateLeaseArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Corporate Lease Arrangement 
   * @return corporateLeaseArrangementSchedule
  **/

  public String getCorporateLeaseArrangementSchedule() {
    return corporateLeaseArrangementSchedule;
  }

  public void setCorporateLeaseArrangementSchedule(String corporateLeaseArrangementSchedule) {
    this.corporateLeaseArrangementSchedule = corporateLeaseArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Corporate Lease Arrangement 
   * @return corporateLeaseArrangementStatus
  **/

  public String getCorporateLeaseArrangementStatus() {
    return corporateLeaseArrangementStatus;
  }

  public void setCorporateLeaseArrangementStatus(String corporateLeaseArrangementStatus) {
    this.corporateLeaseArrangementStatus = corporateLeaseArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Lease Arrangement instance exchange service call 
   * @return corporateLeaseArrangementExchangeActionTaskReference
  **/

  public String getCorporateLeaseArrangementExchangeActionTaskReference() {
    return corporateLeaseArrangementExchangeActionTaskReference;
  }

  public void setCorporateLeaseArrangementExchangeActionTaskReference(String corporateLeaseArrangementExchangeActionTaskReference) {
    this.corporateLeaseArrangementExchangeActionTaskReference = corporateLeaseArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return corporateLeaseArrangementExchangeActionTaskRecord
  **/

  public Object getCorporateLeaseArrangementExchangeActionTaskRecord() {
    return corporateLeaseArrangementExchangeActionTaskRecord;
  }

  public void setCorporateLeaseArrangementExchangeActionTaskRecord(Object corporateLeaseArrangementExchangeActionTaskRecord) {
    this.corporateLeaseArrangementExchangeActionTaskRecord = corporateLeaseArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return corporateLeaseArrangementExchangeActionResponse
  **/

  public String getCorporateLeaseArrangementExchangeActionResponse() {
    return corporateLeaseArrangementExchangeActionResponse;
  }

  public void setCorporateLeaseArrangementExchangeActionResponse(String corporateLeaseArrangementExchangeActionResponse) {
    this.corporateLeaseArrangementExchangeActionResponse = corporateLeaseArrangementExchangeActionResponse;
  }


}

