package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedService;
import org.bian.dto.SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveOutputModel
 */
public class SDCorporateLeaseRetrieveOutputModel   {
  private String corporateLeaseRetrieveActionTaskReference = null;

  private Object corporateLeaseRetrieveActionTaskRecord = null;

  private String corporateLeaseRetrieveActionResponse = null;

  private SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecord corporateLeaseRetrieveActionRecord = null;

  private SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedService corporateLeaseOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return corporateLeaseRetrieveActionTaskReference
  **/

  public String getCorporateLeaseRetrieveActionTaskReference() {
    return corporateLeaseRetrieveActionTaskReference;
  }

  public void setCorporateLeaseRetrieveActionTaskReference(String corporateLeaseRetrieveActionTaskReference) {
    this.corporateLeaseRetrieveActionTaskReference = corporateLeaseRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return corporateLeaseRetrieveActionResponse
  **/

  public String getCorporateLeaseRetrieveActionResponse() {
    return corporateLeaseRetrieveActionResponse;
  }

  public void setCorporateLeaseRetrieveActionResponse(String corporateLeaseRetrieveActionResponse) {
    this.corporateLeaseRetrieveActionResponse = corporateLeaseRetrieveActionResponse;
  }


  /**
   * Get corporateLeaseRetrieveActionRecord
   * @return corporateLeaseRetrieveActionRecord
  **/

  public SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecord getCorporateLeaseRetrieveActionRecord() {
    return corporateLeaseRetrieveActionRecord;
  }

  public void setCorporateLeaseRetrieveActionRecord(SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecord corporateLeaseRetrieveActionRecord) {
    this.corporateLeaseRetrieveActionRecord = corporateLeaseRetrieveActionRecord;
  }


  /**
   * Get corporateLeaseOfferedService
   * @return corporateLeaseOfferedService
  **/

  public SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedService getCorporateLeaseOfferedService() {
    return corporateLeaseOfferedService;
  }

  public void setCorporateLeaseOfferedService(SDCorporateLeaseRetrieveOutputModelCorporateLeaseOfferedService corporateLeaseOfferedService) {
    this.corporateLeaseOfferedService = corporateLeaseOfferedService;
  }


}

