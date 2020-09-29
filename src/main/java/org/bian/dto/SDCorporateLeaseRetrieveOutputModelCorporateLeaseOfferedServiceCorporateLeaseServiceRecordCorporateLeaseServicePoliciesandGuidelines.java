package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecordCorporateLeaseServicePoliciesandGuidelines
 */
public class SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecordCorporateLeaseServicePoliciesandGuidelines   {
  private String corporateLeaseServiceEligibility = null;

  private String corporateLeaseServiceIntendedUses = null;

  private String corporateLeaseServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return corporateLeaseServiceEligibility
  **/

  public String getCorporateLeaseServiceEligibility() {
    return corporateLeaseServiceEligibility;
  }

  public void setCorporateLeaseServiceEligibility(String corporateLeaseServiceEligibility) {
    this.corporateLeaseServiceEligibility = corporateLeaseServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return corporateLeaseServiceIntendedUses
  **/

  public String getCorporateLeaseServiceIntendedUses() {
    return corporateLeaseServiceIntendedUses;
  }

  public void setCorporateLeaseServiceIntendedUses(String corporateLeaseServiceIntendedUses) {
    this.corporateLeaseServiceIntendedUses = corporateLeaseServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return corporateLeaseServicePricingandTerms
  **/

  public String getCorporateLeaseServicePricingandTerms() {
    return corporateLeaseServicePricingandTerms;
  }

  public void setCorporateLeaseServicePricingandTerms(String corporateLeaseServicePricingandTerms) {
    this.corporateLeaseServicePricingandTerms = corporateLeaseServicePricingandTerms;
  }


}

