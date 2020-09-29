package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedService
 */
public class SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedService   {
  private String corporateLeaseServiceReference = null;

  private SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord corporateLeaseServiceRecord = null;


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

  public SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord getCorporateLeaseServiceRecord() {
    return corporateLeaseServiceRecord;
  }

  public void setCorporateLeaseServiceRecord(SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedServiceCorporateLeaseServiceRecord corporateLeaseServiceRecord) {
    this.corporateLeaseServiceRecord = corporateLeaseServiceRecord;
  }


}

