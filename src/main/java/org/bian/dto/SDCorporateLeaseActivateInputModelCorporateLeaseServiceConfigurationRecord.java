package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecord
 */
public class SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecord   {
  private String corporateLeaseServiceConfigurationSettingReference = null;

  private String corporateLeaseServiceConfigurationSettingType = null;

  private SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup corporateLeaseServiceConfigurationSetup = null;


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

  public SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup getCorporateLeaseServiceConfigurationSetup() {
    return corporateLeaseServiceConfigurationSetup;
  }

  public void setCorporateLeaseServiceConfigurationSetup(SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup corporateLeaseServiceConfigurationSetup) {
    this.corporateLeaseServiceConfigurationSetup = corporateLeaseServiceConfigurationSetup;
  }


}

