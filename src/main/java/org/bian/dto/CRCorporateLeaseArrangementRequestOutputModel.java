package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementRequestOutputModel
 */
public class CRCorporateLeaseArrangementRequestOutputModel   {
  private String corporateLeaseArrangementParameterType = null;

  private String corporateLeaseArrangementSelectedOption = null;

  private String corporateLeaseArrangementSchedule = null;

  private String corporateLeaseArrangementStatus = null;

  private String corporateLeaseArrangementRequestActionTaskReference = null;

  private Object corporateLeaseArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Lease Arrangement instance request service call 
   * @return corporateLeaseArrangementRequestActionTaskReference
  **/

  public String getCorporateLeaseArrangementRequestActionTaskReference() {
    return corporateLeaseArrangementRequestActionTaskReference;
  }

  public void setCorporateLeaseArrangementRequestActionTaskReference(String corporateLeaseArrangementRequestActionTaskReference) {
    this.corporateLeaseArrangementRequestActionTaskReference = corporateLeaseArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return corporateLeaseArrangementRequestActionTaskRecord
  **/

  public Object getCorporateLeaseArrangementRequestActionTaskRecord() {
    return corporateLeaseArrangementRequestActionTaskRecord;
  }

  public void setCorporateLeaseArrangementRequestActionTaskRecord(Object corporateLeaseArrangementRequestActionTaskRecord) {
    this.corporateLeaseArrangementRequestActionTaskRecord = corporateLeaseArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

