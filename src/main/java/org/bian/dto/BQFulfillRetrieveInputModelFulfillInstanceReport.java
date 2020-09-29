package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillRetrieveInputModelFulfillInstanceReport
 */
public class BQFulfillRetrieveInputModelFulfillInstanceReport   {
  private String fulfillInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fulfillInstanceReportReference
  **/

  public String getFulfillInstanceReportReference() {
    return fulfillInstanceReportReference;
  }

  public void setFulfillInstanceReportReference(String fulfillInstanceReportReference) {
    this.fulfillInstanceReportReference = fulfillInstanceReportReference;
  }


}

