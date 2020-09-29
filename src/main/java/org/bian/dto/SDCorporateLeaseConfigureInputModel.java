package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseConfigureInputModel
 */
public class SDCorporateLeaseConfigureInputModel   {
  private Object corporateLeaseConfigurationActionTaskRecord = null;

  private String corporateLeaseServicingSessionReference = null;

  private String corporateLeaseServiceReference = null;

  private SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return corporateLeaseServicingSessionReference
  **/

  public String getCorporateLeaseServicingSessionReference() {
    return corporateLeaseServicingSessionReference;
  }

  public void setCorporateLeaseServicingSessionReference(String corporateLeaseServicingSessionReference) {
    this.corporateLeaseServicingSessionReference = corporateLeaseServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return corporateLeaseServiceReference
  **/

  public String getCorporateLeaseServiceReference() {
    return corporateLeaseServiceReference;
  }

  public void setCorporateLeaseServiceReference(String corporateLeaseServiceReference) {
    this.corporateLeaseServiceReference = corporateLeaseServiceReference;
  }


  /**
   * Get corporateLeaseServiceConfigurationRecord
   * @return corporateLeaseServiceConfigurationRecord
  **/

  public SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecord getCorporateLeaseServiceConfigurationRecord() {
    return corporateLeaseServiceConfigurationRecord;
  }

  public void setCorporateLeaseServiceConfigurationRecord(SDCorporateLeaseConfigureInputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord) {
    this.corporateLeaseServiceConfigurationRecord = corporateLeaseServiceConfigurationRecord;
  }


}

