package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord
 */
public class SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord   {
  private String corporateLeaseServiceVersion = null;


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


}

