package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillRetrieveOutputModelFulfillInstanceReport
 */
public class BQFulfillRetrieveOutputModelFulfillInstanceReport   {
  private Object fulfillInstanceReportRecord = null;

  private String fulfillInstanceReportType = null;

  private String fulfillInstanceReportParameters = null;

  private Object fulfillInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fulfillInstanceReportRecord
  **/

  public Object getFulfillInstanceReportRecord() {
    return fulfillInstanceReportRecord;
  }

  public void setFulfillInstanceReportRecord(Object fulfillInstanceReportRecord) {
    this.fulfillInstanceReportRecord = fulfillInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fulfillInstanceReportType
  **/

  public String getFulfillInstanceReportType() {
    return fulfillInstanceReportType;
  }

  public void setFulfillInstanceReportType(String fulfillInstanceReportType) {
    this.fulfillInstanceReportType = fulfillInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fulfillInstanceReportParameters
  **/

  public String getFulfillInstanceReportParameters() {
    return fulfillInstanceReportParameters;
  }

  public void setFulfillInstanceReportParameters(String fulfillInstanceReportParameters) {
    this.fulfillInstanceReportParameters = fulfillInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fulfillInstanceReport
  **/

  public Object getFulfillInstanceReport() {
    return fulfillInstanceReport;
  }

  public void setFulfillInstanceReport(Object fulfillInstanceReport) {
    this.fulfillInstanceReport = fulfillInstanceReport;
  }


}

