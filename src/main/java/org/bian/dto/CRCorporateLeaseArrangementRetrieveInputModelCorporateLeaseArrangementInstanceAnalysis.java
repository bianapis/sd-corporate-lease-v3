package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceAnalysis
 */
public class CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceAnalysis   {
  private String corporateLeaseArrangementInstanceAnalysisReference = null;

  private String corporateLeaseArrangementInstanceAnalysisReportType = null;

  private String corporateLeaseArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateLeaseArrangementInstanceAnalysisReference
  **/

  public String getCorporateLeaseArrangementInstanceAnalysisReference() {
    return corporateLeaseArrangementInstanceAnalysisReference;
  }

  public void setCorporateLeaseArrangementInstanceAnalysisReference(String corporateLeaseArrangementInstanceAnalysisReference) {
    this.corporateLeaseArrangementInstanceAnalysisReference = corporateLeaseArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateLeaseArrangementInstanceAnalysisParameters
  **/

  public String getCorporateLeaseArrangementInstanceAnalysisParameters() {
    return corporateLeaseArrangementInstanceAnalysisParameters;
  }

  public void setCorporateLeaseArrangementInstanceAnalysisParameters(String corporateLeaseArrangementInstanceAnalysisParameters) {
    this.corporateLeaseArrangementInstanceAnalysisParameters = corporateLeaseArrangementInstanceAnalysisParameters;
  }


}

