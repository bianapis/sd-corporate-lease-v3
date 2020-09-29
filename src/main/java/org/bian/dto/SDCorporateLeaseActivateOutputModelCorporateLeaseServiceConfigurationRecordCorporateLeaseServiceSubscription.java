package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription
 */
public class SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription   {
  private String corporateLeaseServiceSubscriberReference = null;

  private String corporateLeaseServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return corporateLeaseServiceSubscriberReference
  **/

  public String getCorporateLeaseServiceSubscriberReference() {
    return corporateLeaseServiceSubscriberReference;
  }

  public void setCorporateLeaseServiceSubscriberReference(String corporateLeaseServiceSubscriberReference) {
    this.corporateLeaseServiceSubscriberReference = corporateLeaseServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return corporateLeaseServiceSubscriberAccessProfile
  **/

  public String getCorporateLeaseServiceSubscriberAccessProfile() {
    return corporateLeaseServiceSubscriberAccessProfile;
  }

  public void setCorporateLeaseServiceSubscriberAccessProfile(String corporateLeaseServiceSubscriberAccessProfile) {
    this.corporateLeaseServiceSubscriberAccessProfile = corporateLeaseServiceSubscriberAccessProfile;
  }


}

