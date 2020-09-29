package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLeaseArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementRequestInputModel
 */
public class CRCorporateLeaseArrangementRequestInputModel   {
  private String corporateLeaseServicingSessionReference = null;

  private String corporateLeaseArrangementInstanceReference = null;

  private String corporateLeaseArrangementParameterType = null;

  private String corporateLeaseArrangementSelectedOption = null;

  private String corporateLeaseArrangementType = null;

  private String corporateLeaseArrangementReference = null;

  private String corporateLeaseArrangementSchedule = null;

  private String corporateLeaseArrangementStatus = null;

  private String corporateLeaseArrangementCurrency = null;

  private String corporateLeaseArrangementRegulationReference = null;

  private String corporateLeaseArrangementRegulationType = null;

  private String corporateLeaseArrangementJurisdiction = null;

  private String corporateLeaseArrangementBookingLocation = null;

  private String corporateLeaseArrangementAccountType = null;

  private String corporateLeaseArrangementAccountReference = null;

  private Object corporateLeaseArrangementRequestActionTaskRecord = null;

  private CRCorporateLeaseArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return corporateLeaseServicingSessionReference
  **/

  public String getCorporateLeaseServicingSessionReference() {
    return corporateLeaseServicingSessionReference;
  }

  public void setCorporateLeaseServicingSessionReference(String corporateLeaseServicingSessionReference) {
    this.corporateLeaseServicingSessionReference = corporateLeaseServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Corporate Lease Arrangement 
   * @return corporateLeaseArrangementType
  **/

  public String getCorporateLeaseArrangementType() {
    return corporateLeaseArrangementType;
  }

  public void setCorporateLeaseArrangementType(String corporateLeaseArrangementType) {
    this.corporateLeaseArrangementType = corporateLeaseArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Corporate Lease Arrangement 
   * @return corporateLeaseArrangementReference
  **/

  public String getCorporateLeaseArrangementReference() {
    return corporateLeaseArrangementReference;
  }

  public void setCorporateLeaseArrangementReference(String corporateLeaseArrangementReference) {
    this.corporateLeaseArrangementReference = corporateLeaseArrangementReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Corporate Lease Arrangement 
   * @return corporateLeaseArrangementCurrency
  **/

  public String getCorporateLeaseArrangementCurrency() {
    return corporateLeaseArrangementCurrency;
  }

  public void setCorporateLeaseArrangementCurrency(String corporateLeaseArrangementCurrency) {
    this.corporateLeaseArrangementCurrency = corporateLeaseArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Corporate Lease Arrangement 
   * @return corporateLeaseArrangementRegulationReference
  **/

  public String getCorporateLeaseArrangementRegulationReference() {
    return corporateLeaseArrangementRegulationReference;
  }

  public void setCorporateLeaseArrangementRegulationReference(String corporateLeaseArrangementRegulationReference) {
    this.corporateLeaseArrangementRegulationReference = corporateLeaseArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Corporate Lease Arrangement 
   * @return corporateLeaseArrangementRegulationType
  **/

  public String getCorporateLeaseArrangementRegulationType() {
    return corporateLeaseArrangementRegulationType;
  }

  public void setCorporateLeaseArrangementRegulationType(String corporateLeaseArrangementRegulationType) {
    this.corporateLeaseArrangementRegulationType = corporateLeaseArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Corporate Lease Arrangement in case of legal dispute. 
   * @return corporateLeaseArrangementJurisdiction
  **/

  public String getCorporateLeaseArrangementJurisdiction() {
    return corporateLeaseArrangementJurisdiction;
  }

  public void setCorporateLeaseArrangementJurisdiction(String corporateLeaseArrangementJurisdiction) {
    this.corporateLeaseArrangementJurisdiction = corporateLeaseArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Corporate Lease Arrangement, are entered. 
   * @return corporateLeaseArrangementBookingLocation
  **/

  public String getCorporateLeaseArrangementBookingLocation() {
    return corporateLeaseArrangementBookingLocation;
  }

  public void setCorporateLeaseArrangementBookingLocation(String corporateLeaseArrangementBookingLocation) {
    this.corporateLeaseArrangementBookingLocation = corporateLeaseArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Corporate Lease Arrangement 
   * @return corporateLeaseArrangementAccountType
  **/

  public String getCorporateLeaseArrangementAccountType() {
    return corporateLeaseArrangementAccountType;
  }

  public void setCorporateLeaseArrangementAccountType(String corporateLeaseArrangementAccountType) {
    this.corporateLeaseArrangementAccountType = corporateLeaseArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Corporate Lease Arrangement 
   * @return corporateLeaseArrangementAccountReference
  **/

  public String getCorporateLeaseArrangementAccountReference() {
    return corporateLeaseArrangementAccountReference;
  }

  public void setCorporateLeaseArrangementAccountReference(String corporateLeaseArrangementAccountReference) {
    this.corporateLeaseArrangementAccountReference = corporateLeaseArrangementAccountReference;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCorporateLeaseArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCorporateLeaseArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

