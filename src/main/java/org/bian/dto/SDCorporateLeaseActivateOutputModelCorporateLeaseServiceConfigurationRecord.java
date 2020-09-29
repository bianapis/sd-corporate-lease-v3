package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup;
import org.bian.dto.SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement;
import org.bian.dto.SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecord
 */
public class SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecord   {
  private String corporateLeaseServiceConfigurationSettingReference = null;

  private String corporateLeaseServiceConfigurationSettingDescription = null;

  private SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup corporateLeaseServiceConfigurationSetup = null;

  private SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription corporateLeaseServiceSubscription = null;

  private SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement corporateLeaseServiceAgreement = null;

  private String corporateLeaseServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return corporateLeaseServiceConfigurationSettingReference
  **/

  public String getCorporateLeaseServiceConfigurationSettingReference() {
    return corporateLeaseServiceConfigurationSettingReference;
  }

  public void setCorporateLeaseServiceConfigurationSettingReference(String corporateLeaseServiceConfigurationSettingReference) {
    this.corporateLeaseServiceConfigurationSettingReference = corporateLeaseServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return corporateLeaseServiceConfigurationSettingDescription
  **/

  public String getCorporateLeaseServiceConfigurationSettingDescription() {
    return corporateLeaseServiceConfigurationSettingDescription;
  }

  public void setCorporateLeaseServiceConfigurationSettingDescription(String corporateLeaseServiceConfigurationSettingDescription) {
    this.corporateLeaseServiceConfigurationSettingDescription = corporateLeaseServiceConfigurationSettingDescription;
  }


  /**
   * Get corporateLeaseServiceConfigurationSetup
   * @return corporateLeaseServiceConfigurationSetup
  **/

  public SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup getCorporateLeaseServiceConfigurationSetup() {
    return corporateLeaseServiceConfigurationSetup;
  }

  public void setCorporateLeaseServiceConfigurationSetup(SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup corporateLeaseServiceConfigurationSetup) {
    this.corporateLeaseServiceConfigurationSetup = corporateLeaseServiceConfigurationSetup;
  }


  /**
   * Get corporateLeaseServiceSubscription
   * @return corporateLeaseServiceSubscription
  **/

  public SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription getCorporateLeaseServiceSubscription() {
    return corporateLeaseServiceSubscription;
  }

  public void setCorporateLeaseServiceSubscription(SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription corporateLeaseServiceSubscription) {
    this.corporateLeaseServiceSubscription = corporateLeaseServiceSubscription;
  }


  /**
   * Get corporateLeaseServiceAgreement
   * @return corporateLeaseServiceAgreement
  **/

  public SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement getCorporateLeaseServiceAgreement() {
    return corporateLeaseServiceAgreement;
  }

  public void setCorporateLeaseServiceAgreement(SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement corporateLeaseServiceAgreement) {
    this.corporateLeaseServiceAgreement = corporateLeaseServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return corporateLeaseServiceStatus
  **/

  public String getCorporateLeaseServiceStatus() {
    return corporateLeaseServiceStatus;
  }

  public void setCorporateLeaseServiceStatus(String corporateLeaseServiceStatus) {
    this.corporateLeaseServiceStatus = corporateLeaseServiceStatus;
  }


}

