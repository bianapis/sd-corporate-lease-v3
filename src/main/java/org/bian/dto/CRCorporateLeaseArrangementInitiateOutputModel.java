package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementInitiateOutputModel
 */
public class CRCorporateLeaseArrangementInitiateOutputModel   {
  private String corporateLeaseArrangementInstanceReference = null;

  private String corporateLeaseArrangementInitiateActionReference = null;

  private Object corporateLeaseArrangementInitiateActionRecord = null;

  private String corporateLeaseArrangementInstanceStatus = null;

  private String corporateLeaseArrangementParameterType = null;

  private String corporateLeaseArrangementSelectedOption = null;

  private String corporateLeaseArrangementSchedule = null;

  private String corporateLeaseArrangementStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Lease Arrangement instance 
   * @return corporateLeaseArrangementInstanceReference
  **/

  public String getCorporateLeaseArrangementInstanceReference() {
    return corporateLeaseArrangementInstanceReference;
  }

  public void setCorporateLeaseArrangementInstanceReference(String corporateLeaseArrangementInstanceReference) {
    this.corporateLeaseArrangementInstanceReference = corporateLeaseArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return corporateLeaseArrangementInitiateActionReference
  **/

  public String getCorporateLeaseArrangementInitiateActionReference() {
    return corporateLeaseArrangementInitiateActionReference;
  }

  public void setCorporateLeaseArrangementInitiateActionReference(String corporateLeaseArrangementInitiateActionReference) {
    this.corporateLeaseArrangementInitiateActionReference = corporateLeaseArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return corporateLeaseArrangementInitiateActionRecord
  **/

  public Object getCorporateLeaseArrangementInitiateActionRecord() {
    return corporateLeaseArrangementInitiateActionRecord;
  }

  public void setCorporateLeaseArrangementInitiateActionRecord(Object corporateLeaseArrangementInitiateActionRecord) {
    this.corporateLeaseArrangementInitiateActionRecord = corporateLeaseArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Lease Arrangement instance (e.g. initialised, pending, active) 
   * @return corporateLeaseArrangementInstanceStatus
  **/

  public String getCorporateLeaseArrangementInstanceStatus() {
    return corporateLeaseArrangementInstanceStatus;
  }

  public void setCorporateLeaseArrangementInstanceStatus(String corporateLeaseArrangementInstanceStatus) {
    this.corporateLeaseArrangementInstanceStatus = corporateLeaseArrangementInstanceStatus;
  }


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


}

