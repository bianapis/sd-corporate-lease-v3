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
 * SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecord
 */
public class SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecord   {
  private String corporateLeaseServiceConfigurationSettingReference = null;

  private String corporateLeaseServiceConfigurationSettingType = null;

  private SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup corporateLeaseServiceConfigurationSetup = null;

  private SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceSubscription corporateLeaseServiceSubscription = null;

  private SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceAgreement corporateLeaseServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return corporateLeaseServiceConfigurationSettingType
  **/

  public String getCorporateLeaseServiceConfigurationSettingType() {
    return corporateLeaseServiceConfigurationSettingType;
  }

  public void setCorporateLeaseServiceConfigurationSettingType(String corporateLeaseServiceConfigurationSettingType) {
    this.corporateLeaseServiceConfigurationSettingType = corporateLeaseServiceConfigurationSettingType;
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


}

