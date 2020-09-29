package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement
 */
public class SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement   {
  private String corporateLeaseServiceAgreementReference = null;

  private String corporateLeaseServiceUserReference = null;

  private String corporateLeaseServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return corporateLeaseServiceAgreementReference
  **/

  public String getCorporateLeaseServiceAgreementReference() {
    return corporateLeaseServiceAgreementReference;
  }

  public void setCorporateLeaseServiceAgreementReference(String corporateLeaseServiceAgreementReference) {
    this.corporateLeaseServiceAgreementReference = corporateLeaseServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return corporateLeaseServiceUserReference
  **/

  public String getCorporateLeaseServiceUserReference() {
    return corporateLeaseServiceUserReference;
  }

  public void setCorporateLeaseServiceUserReference(String corporateLeaseServiceUserReference) {
    this.corporateLeaseServiceUserReference = corporateLeaseServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return corporateLeaseServiceAgreementTermsandConditions
  **/

  public String getCorporateLeaseServiceAgreementTermsandConditions() {
    return corporateLeaseServiceAgreementTermsandConditions;
  }

  public void setCorporateLeaseServiceAgreementTermsandConditions(String corporateLeaseServiceAgreementTermsandConditions) {
    this.corporateLeaseServiceAgreementTermsandConditions = corporateLeaseServiceAgreementTermsandConditions;
  }


}

