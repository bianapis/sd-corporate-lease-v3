package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillRetrieveInputModelFulfillInstanceAnalysis
 */
public class BQFulfillRetrieveInputModelFulfillInstanceAnalysis   {
  private String fulfillInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fulfillInstanceAnalysisReference
  **/

  public String getFulfillInstanceAnalysisReference() {
    return fulfillInstanceAnalysisReference;
  }

  public void setFulfillInstanceAnalysisReference(String fulfillInstanceAnalysisReference) {
    this.fulfillInstanceAnalysisReference = fulfillInstanceAnalysisReference;
  }


}

