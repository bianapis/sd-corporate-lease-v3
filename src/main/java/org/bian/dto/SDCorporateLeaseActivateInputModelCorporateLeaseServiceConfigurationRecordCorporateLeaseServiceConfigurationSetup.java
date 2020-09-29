package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup
 */
public class SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecordCorporateLeaseServiceConfigurationSetup   {
  private String corporateLeaseServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return corporateLeaseServiceConfigurationParameter
  **/

  public String getCorporateLeaseServiceConfigurationParameter() {
    return corporateLeaseServiceConfigurationParameter;
  }

  public void setCorporateLeaseServiceConfigurationParameter(String corporateLeaseServiceConfigurationParameter) {
    this.corporateLeaseServiceConfigurationParameter = corporateLeaseServiceConfigurationParameter;
  }


}

