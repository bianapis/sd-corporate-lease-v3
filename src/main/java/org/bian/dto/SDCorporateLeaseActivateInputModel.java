package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseActivateInputModel
 */
public class SDCorporateLeaseActivateInputModel   {
  private Object corporateLeaseActivationActionTaskRecord = null;

  private String corporateLeaseCenterReference = null;

  private String corporateLeaseServiceReference = null;

  private SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return corporateLeaseCenterReference
  **/

  public String getCorporateLeaseCenterReference() {
    return corporateLeaseCenterReference;
  }

  public void setCorporateLeaseCenterReference(String corporateLeaseCenterReference) {
    this.corporateLeaseCenterReference = corporateLeaseCenterReference;
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

  public SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecord getCorporateLeaseServiceConfigurationRecord() {
    return corporateLeaseServiceConfigurationRecord;
  }

  public void setCorporateLeaseServiceConfigurationRecord(SDCorporateLeaseActivateInputModelCorporateLeaseServiceConfigurationRecord corporateLeaseServiceConfigurationRecord) {
    this.corporateLeaseServiceConfigurationRecord = corporateLeaseServiceConfigurationRecord;
  }


}

