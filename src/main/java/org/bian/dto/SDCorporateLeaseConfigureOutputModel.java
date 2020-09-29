package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseConfigureOutputModelCorporateLeaseServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseConfigureOutputModel
 */
public class SDCorporateLeaseConfigureOutputModel   {
  private String corporateLeaseConfigurationActionTaskReference = null;

  private Object corporateLeaseConfigurationActionTaskRecord = null;

  private SDCorporateLeaseConfigureOutputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord = null;

  private String corporateLeaseServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return corporateLeaseConfigurationActionTaskReference
  **/

  public String getCorporateLeaseConfigurationActionTaskReference() {
    return corporateLeaseConfigurationActionTaskReference;
  }

  public void setCorporateLeaseConfigurationActionTaskReference(String corporateLeaseConfigurationActionTaskReference) {
    this.corporateLeaseConfigurationActionTaskReference = corporateLeaseConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return corporateLeaseConfigurationActionTaskRecord
  **/

  public Object getCorporateLeaseConfigurationActionTaskRecord() {
    return corporateLeaseConfigurationActionTaskRecord;
  }

  public void setCorporateLeaseConfigurationActionTaskRecord(Object corporateLeaseConfigurationActionTaskRecord) {
    this.corporateLeaseConfigurationActionTaskRecord = corporateLeaseConfigurationActionTaskRecord;
  }


  /**
   * Get corporateLeaseServiceConfigurationRecord
   * @return corporateLeaseServiceConfigurationRecord
  **/

  public SDCorporateLeaseConfigureOutputModelCorporateLeaseServiceConfigurationRecord getCorporateLeaseServiceConfigurationRecord() {
    return corporateLeaseServiceConfigurationRecord;
  }

  public void setCorporateLeaseServiceConfigurationRecord(SDCorporateLeaseConfigureOutputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord) {
    this.corporateLeaseServiceConfigurationRecord = corporateLeaseServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return corporateLeaseServicingSessionStatus
  **/

  public String getCorporateLeaseServicingSessionStatus() {
    return corporateLeaseServicingSessionStatus;
  }

  public void setCorporateLeaseServicingSessionStatus(String corporateLeaseServicingSessionStatus) {
    this.corporateLeaseServicingSessionStatus = corporateLeaseServicingSessionStatus;
  }


}

