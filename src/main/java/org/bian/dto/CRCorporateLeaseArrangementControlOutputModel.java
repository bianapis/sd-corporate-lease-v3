package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementControlOutputModel
 */
public class CRCorporateLeaseArrangementControlOutputModel   {
  private String corporateLeaseArrangementParameterType = null;

  private String corporateLeaseArrangementSelectedOption = null;

  private String corporateLeaseArrangementSchedule = null;

  private String corporateLeaseArrangementStatus = null;

  private String corporateLeaseArrangementControlActionTaskReference = null;

  private Object corporateLeaseArrangementControlActionTaskRecord = null;

  private String corporateLeaseArrangementControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Lease Arrangement instance control processing service call 
   * @return corporateLeaseArrangementControlActionTaskReference
  **/

  public String getCorporateLeaseArrangementControlActionTaskReference() {
    return corporateLeaseArrangementControlActionTaskReference;
  }

  public void setCorporateLeaseArrangementControlActionTaskReference(String corporateLeaseArrangementControlActionTaskReference) {
    this.corporateLeaseArrangementControlActionTaskReference = corporateLeaseArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return corporateLeaseArrangementControlActionTaskRecord
  **/

  public Object getCorporateLeaseArrangementControlActionTaskRecord() {
    return corporateLeaseArrangementControlActionTaskRecord;
  }

  public void setCorporateLeaseArrangementControlActionTaskRecord(Object corporateLeaseArrangementControlActionTaskRecord) {
    this.corporateLeaseArrangementControlActionTaskRecord = corporateLeaseArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return corporateLeaseArrangementControlActionResponse
  **/

  public String getCorporateLeaseArrangementControlActionResponse() {
    return corporateLeaseArrangementControlActionResponse;
  }

  public void setCorporateLeaseArrangementControlActionResponse(String corporateLeaseArrangementControlActionResponse) {
    this.corporateLeaseArrangementControlActionResponse = corporateLeaseArrangementControlActionResponse;
  }


}

