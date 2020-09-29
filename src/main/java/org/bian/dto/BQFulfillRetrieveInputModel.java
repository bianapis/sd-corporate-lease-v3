package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFulfillRetrieveInputModelFulfillInstanceAnalysis;
import org.bian.dto.BQFulfillRetrieveInputModelFulfillInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFulfillRetrieveInputModel
 */
public class BQFulfillRetrieveInputModel   {
  private Object fulfillRetrieveActionTaskRecord = null;

  private String fulfillRetrieveActionRequest = null;

  private BQFulfillRetrieveInputModelFulfillInstanceReport fulfillInstanceReport = null;

  private BQFulfillRetrieveInputModelFulfillInstanceAnalysis fulfillInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fulfillRetrieveActionTaskRecord
  **/

  public Object getFulfillRetrieveActionTaskRecord() {
    return fulfillRetrieveActionTaskRecord;
  }

  public void setFulfillRetrieveActionTaskRecord(Object fulfillRetrieveActionTaskRecord) {
    this.fulfillRetrieveActionTaskRecord = fulfillRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fulfillRetrieveActionRequest
  **/

  public String getFulfillRetrieveActionRequest() {
    return fulfillRetrieveActionRequest;
  }

  public void setFulfillRetrieveActionRequest(String fulfillRetrieveActionRequest) {
    this.fulfillRetrieveActionRequest = fulfillRetrieveActionRequest;
  }


  /**
   * Get fulfillInstanceReport
   * @return fulfillInstanceReport
  **/

  public BQFulfillRetrieveInputModelFulfillInstanceReport getFulfillInstanceReport() {
    return fulfillInstanceReport;
  }

  public void setFulfillInstanceReport(BQFulfillRetrieveInputModelFulfillInstanceReport fulfillInstanceReport) {
    this.fulfillInstanceReport = fulfillInstanceReport;
  }


  /**
   * Get fulfillInstanceAnalysis
   * @return fulfillInstanceAnalysis
  **/

  public BQFulfillRetrieveInputModelFulfillInstanceAnalysis getFulfillInstanceAnalysis() {
    return fulfillInstanceAnalysis;
  }

  public void setFulfillInstanceAnalysis(BQFulfillRetrieveInputModelFulfillInstanceAnalysis fulfillInstanceAnalysis) {
    this.fulfillInstanceAnalysis = fulfillInstanceAnalysis;
  }


}

