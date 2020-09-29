package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecordCorporateLeaseServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord
 */
public class SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord   {
  private String corporateLeaseServiceType = null;

  private String corporateLeaseServiceVersion = null;

  private String corporateLeaseServiceDescription = null;

  private SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecordCorporateLeaseServicePoliciesandGuidelines corporateLeaseServicePoliciesandGuidelines = null;

  private String corporateLeaseServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return corporateLeaseServiceType
  **/

  public String getCorporateLeaseServiceType() {
    return corporateLeaseServiceType;
  }

  public void setCorporateLeaseServiceType(String corporateLeaseServiceType) {
    this.corporateLeaseServiceType = corporateLeaseServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return corporateLeaseServiceVersion
  **/

  public String getCorporateLeaseServiceVersion() {
    return corporateLeaseServiceVersion;
  }

  public void setCorporateLeaseServiceVersion(String corporateLeaseServiceVersion) {
    this.corporateLeaseServiceVersion = corporateLeaseServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return corporateLeaseServiceDescription
  **/

  public String getCorporateLeaseServiceDescription() {
    return corporateLeaseServiceDescription;
  }

  public void setCorporateLeaseServiceDescription(String corporateLeaseServiceDescription) {
    this.corporateLeaseServiceDescription = corporateLeaseServiceDescription;
  }


  /**
   * Get corporateLeaseServicePoliciesandGuidelines
   * @return corporateLeaseServicePoliciesandGuidelines
  **/

  public SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecordCorporateLeaseServicePoliciesandGuidelines getCorporateLeaseServicePoliciesandGuidelines() {
    return corporateLeaseServicePoliciesandGuidelines;
  }

  public void setCorporateLeaseServicePoliciesandGuidelines(SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecordCorporateLeaseServicePoliciesandGuidelines corporateLeaseServicePoliciesandGuidelines) {
    this.corporateLeaseServicePoliciesandGuidelines = corporateLeaseServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return corporateLeaseServiceSchedule
  **/

  public String getCorporateLeaseServiceSchedule() {
    return corporateLeaseServiceSchedule;
  }

  public void setCorporateLeaseServiceSchedule(String corporateLeaseServiceSchedule) {
    this.corporateLeaseServiceSchedule = corporateLeaseServiceSchedule;
  }


}

