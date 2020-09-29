package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseActivateOutputModel
 */
public class SDCorporateLeaseActivateOutputModel   {
  private String corporateLeaseActivationActionTaskReference = null;

  private Object corporateLeaseActivationActionTaskRecord = null;

  private String corporateLeaseServicingSessionReference = null;

  private Object corporateLeaseServicingSessionRecord = null;

  private SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord = null;

  private String corporateLeaseServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return corporateLeaseActivationActionTaskReference
  **/

  public String getCorporateLeaseActivationActionTaskReference() {
    return corporateLeaseActivationActionTaskReference;
  }

  public void setCorporateLeaseActivationActionTaskReference(String corporateLeaseActivationActionTaskReference) {
    this.corporateLeaseActivationActionTaskReference = corporateLeaseActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return corporateLeaseActivationActionTaskRecord
  **/

  public Object getCorporateLeaseActivationActionTaskRecord() {
    return corporateLeaseActivationActionTaskRecord;
  }

  public void setCorporateLeaseActivationActionTaskRecord(Object corporateLeaseActivationActionTaskRecord) {
    this.corporateLeaseActivationActionTaskRecord = corporateLeaseActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return corporateLeaseServicingSessionRecord
  **/

  public Object getCorporateLeaseServicingSessionRecord() {
    return corporateLeaseServicingSessionRecord;
  }

  public void setCorporateLeaseServicingSessionRecord(Object corporateLeaseServicingSessionRecord) {
    this.corporateLeaseServicingSessionRecord = corporateLeaseServicingSessionRecord;
  }


  /**
   * Get corporateLeaseServiceConfigurationRecord
   * @return corporateLeaseServiceConfigurationRecord
  **/

  public SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecord getCorporateLeaseServiceConfigurationRecord() {
    return corporateLeaseServiceConfigurationRecord;
  }

  public void setCorporateLeaseServiceConfigurationRecord(SDCorporateLeaseActivateOutputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord) {
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

