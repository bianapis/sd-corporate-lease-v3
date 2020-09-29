package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedService;
import org.bian.dto.SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveInputModel
 */
public class SDCorporateLeaseRetrieveInputModel   {
  private Object corporateLeaseRetrieveActionTaskRecord = null;

  private String corporateLeaseRetrieveActionRequest = null;

  private SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecord corporateLeaseRetrieveActionRecord = null;

  private SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedService corporateLeaseOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateLeaseRetrieveActionTaskRecord
  **/

  public Object getCorporateLeaseRetrieveActionTaskRecord() {
    return corporateLeaseRetrieveActionTaskRecord;
  }

  public void setCorporateLeaseRetrieveActionTaskRecord(Object corporateLeaseRetrieveActionTaskRecord) {
    this.corporateLeaseRetrieveActionTaskRecord = corporateLeaseRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateLeaseRetrieveActionRequest
  **/

  public String getCorporateLeaseRetrieveActionRequest() {
    return corporateLeaseRetrieveActionRequest;
  }

  public void setCorporateLeaseRetrieveActionRequest(String corporateLeaseRetrieveActionRequest) {
    this.corporateLeaseRetrieveActionRequest = corporateLeaseRetrieveActionRequest;
  }


  /**
   * Get corporateLeaseRetrieveActionRecord
   * @return corporateLeaseRetrieveActionRecord
  **/

  public SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecord getCorporateLeaseRetrieveActionRecord() {
    return corporateLeaseRetrieveActionRecord;
  }

  public void setCorporateLeaseRetrieveActionRecord(SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecord corporateLeaseRetrieveActionRecord) {
    this.corporateLeaseRetrieveActionRecord = corporateLeaseRetrieveActionRecord;
  }


  /**
   * Get corporateLeaseOfferedService
   * @return corporateLeaseOfferedService
  **/

  public SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedService getCorporateLeaseOfferedService() {
    return corporateLeaseOfferedService;
  }

  public void setCorporateLeaseOfferedService(SDCorporateLeaseRetrieveInputModelCorporateLeaseOfferedService corporateLeaseOfferedService) {
    this.corporateLeaseOfferedService = corporateLeaseOfferedService;
  }


}

