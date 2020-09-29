package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementRetrieveOutputModelCorporateLeaseArrangementInstanceAnalysis
 */
public class CRCorporateLeaseArrangementRetrieveOutputModelCorporateLeaseArrangementInstanceAnalysis   {
  private String corporateLeaseArrangementInstanceAnalysisData = null;

  private String corporateLeaseArrangementInstanceAnalysisReportType = null;

  private Object corporateLeaseArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateLeaseArrangementInstanceAnalysisData
  **/

  public String getCorporateLeaseArrangementInstanceAnalysisData() {
    return corporateLeaseArrangementInstanceAnalysisData;
  }

  public void setCorporateLeaseArrangementInstanceAnalysisData(String corporateLeaseArrangementInstanceAnalysisData) {
    this.corporateLeaseArrangementInstanceAnalysisData = corporateLeaseArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateLeaseArrangementInstanceAnalysisReportType
  **/

  public String getCorporateLeaseArrangementInstanceAnalysisReportType() {
    return corporateLeaseArrangementInstanceAnalysisReportType;
  }

  public void setCorporateLeaseArrangementInstanceAnalysisReportType(String corporateLeaseArrangementInstanceAnalysisReportType) {
    this.corporateLeaseArrangementInstanceAnalysisReportType = corporateLeaseArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateLeaseArrangementInstanceAnalysisReport
  **/

  public Object getCorporateLeaseArrangementInstanceAnalysisReport() {
    return corporateLeaseArrangementInstanceAnalysisReport;
  }

  public void setCorporateLeaseArrangementInstanceAnalysisReport(Object corporateLeaseArrangementInstanceAnalysisReport) {
    this.corporateLeaseArrangementInstanceAnalysisReport = corporateLeaseArrangementInstanceAnalysisReport;
  }


}

