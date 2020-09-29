package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedService
 */
public class SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedService   {
  private String corporateLeaseServiceReference = null;

  private SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord corporateLeaseServiceRecord = null;


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
   * Get corporateLeaseServiceRecord
   * @return corporateLeaseServiceRecord
  **/

  public SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord getCorporateLeaseServiceRecord() {
    return corporateLeaseServiceRecord;
  }

  public void setCorporateLeaseServiceRecord(SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord corporateLeaseServiceRecord) {
    this.corporateLeaseServiceRecord = corporateLeaseServiceRecord;
  }


}

