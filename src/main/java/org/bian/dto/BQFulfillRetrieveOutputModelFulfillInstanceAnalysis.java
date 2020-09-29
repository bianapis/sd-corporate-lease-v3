package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillRetrieveOutputModelFulfillInstanceAnalysis
 */
public class BQFulfillRetrieveOutputModelFulfillInstanceAnalysis   {
  private Object fulfillInstanceAnalysisRecord = null;

  private String fulfillInstanceAnalysisReportType = null;

  private String fulfillInstanceAnalysisParameters = null;

  private Object fulfillInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fulfillInstanceAnalysisRecord
  **/

  public Object getFulfillInstanceAnalysisRecord() {
    return fulfillInstanceAnalysisRecord;
  }

  public void setFulfillInstanceAnalysisRecord(Object fulfillInstanceAnalysisRecord) {
    this.fulfillInstanceAnalysisRecord = fulfillInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fulfillInstanceAnalysisReportType
  **/

  public String getFulfillInstanceAnalysisReportType() {
    return fulfillInstanceAnalysisReportType;
  }

  public void setFulfillInstanceAnalysisReportType(String fulfillInstanceAnalysisReportType) {
    this.fulfillInstanceAnalysisReportType = fulfillInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fulfillInstanceAnalysisParameters
  **/

  public String getFulfillInstanceAnalysisParameters() {
    return fulfillInstanceAnalysisParameters;
  }

  public void setFulfillInstanceAnalysisParameters(String fulfillInstanceAnalysisParameters) {
    this.fulfillInstanceAnalysisParameters = fulfillInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fulfillInstanceAnalysisReport
  **/

  public Object getFulfillInstanceAnalysisReport() {
    return fulfillInstanceAnalysisReport;
  }

  public void setFulfillInstanceAnalysisReport(Object fulfillInstanceAnalysisReport) {
    this.fulfillInstanceAnalysisReport = fulfillInstanceAnalysisReport;
  }


}

