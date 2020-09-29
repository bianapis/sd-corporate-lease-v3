package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAdministerRetrieveOutputModelAdministerInstanceAnalysis
 */
public class BQAdministerRetrieveOutputModelAdministerInstanceAnalysis   {
  private Object administerInstanceAnalysisRecord = null;

  private String administerInstanceAnalysisReportType = null;

  private String administerInstanceAnalysisParameters = null;

  private Object administerInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return administerInstanceAnalysisRecord
  **/

  public Object getAdministerInstanceAnalysisRecord() {
    return administerInstanceAnalysisRecord;
  }

  public void setAdministerInstanceAnalysisRecord(Object administerInstanceAnalysisRecord) {
    this.administerInstanceAnalysisRecord = administerInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return administerInstanceAnalysisReportType
  **/

  public String getAdministerInstanceAnalysisReportType() {
    return administerInstanceAnalysisReportType;
  }

  public void setAdministerInstanceAnalysisReportType(String administerInstanceAnalysisReportType) {
    this.administerInstanceAnalysisReportType = administerInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return administerInstanceAnalysisParameters
  **/

  public String getAdministerInstanceAnalysisParameters() {
    return administerInstanceAnalysisParameters;
  }

  public void setAdministerInstanceAnalysisParameters(String administerInstanceAnalysisParameters) {
    this.administerInstanceAnalysisParameters = administerInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return administerInstanceAnalysisReport
  **/

  public Object getAdministerInstanceAnalysisReport() {
    return administerInstanceAnalysisReport;
  }

  public void setAdministerInstanceAnalysisReport(Object administerInstanceAnalysisReport) {
    this.administerInstanceAnalysisReport = administerInstanceAnalysisReport;
  }


}

