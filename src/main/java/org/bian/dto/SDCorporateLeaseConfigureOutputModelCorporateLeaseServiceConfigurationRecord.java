package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement;
import org.bian.dto.SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup;
import org.bian.dto.SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseConfigureOutputModelCorporateLeaseServiceConfigurationRecord
 */
public class SDCorporateLeaseConfigureOutputModelCorporateLeaseServiceConfigurationRecord   {
  private String corporateLeaseServiceConfigurationSettingDescription = null;

  private SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup corporateLeaseServiceConfigurationSetup = null;

  private SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription corporateLeaseServiceSubscription = null;

  private SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement corporateLeaseServiceAgreement = null;

  private String corporateLeaseServiceStatus = null;


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

  public SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup getCorporateLeaseServiceConfigurationSetup() {
    return corporateLeaseServiceConfigurationSetup;
  }

  public void setCorporateLeaseServiceConfigurationSetup(SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup corporateLeaseServiceConfigurationSetup) {
    this.corporateLeaseServiceConfigurationSetup = corporateLeaseServiceConfigurationSetup;
  }


  /**
   * Get corporateLeaseServiceSubscription
   * @return corporateLeaseServiceSubscription
  **/

  public SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription getCorporateLeaseServiceSubscription() {
    return corporateLeaseServiceSubscription;
  }

  public void setCorporateLeaseServiceSubscription(SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription corporateLeaseServiceSubscription) {
    this.corporateLeaseServiceSubscription = corporateLeaseServiceSubscription;
  }


  /**
   * Get corporateLeaseServiceAgreement
   * @return corporateLeaseServiceAgreement
  **/

  public SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement getCorporateLeaseServiceAgreement() {
    return corporateLeaseServiceAgreement;
  }

  public void setCorporateLeaseServiceAgreement(SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement corporateLeaseServiceAgreement) {
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

