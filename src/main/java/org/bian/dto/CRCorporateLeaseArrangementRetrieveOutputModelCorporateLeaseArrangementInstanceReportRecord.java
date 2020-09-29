package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementRetrieveOutputModelCorporateLeaseArrangementInstanceReportRecord
 */
public class CRCorporateLeaseArrangementRetrieveOutputModelCorporateLeaseArrangementInstanceReportRecord   {
  private String corporateLeaseArrangementInstanceReportData = null;

  private String corporateLeaseArrangementInstanceReportType = null;

  private Object corporateLeaseArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateLeaseArrangementInstanceReportData
  **/

  public String getCorporateLeaseArrangementInstanceReportData() {
    return corporateLeaseArrangementInstanceReportData;
  }

  public void setCorporateLeaseArrangementInstanceReportData(String corporateLeaseArrangementInstanceReportData) {
    this.corporateLeaseArrangementInstanceReportData = corporateLeaseArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateLeaseArrangementInstanceReportType
  **/

  public String getCorporateLeaseArrangementInstanceReportType() {
    return corporateLeaseArrangementInstanceReportType;
  }

  public void setCorporateLeaseArrangementInstanceReportType(String corporateLeaseArrangementInstanceReportType) {
    this.corporateLeaseArrangementInstanceReportType = corporateLeaseArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateLeaseArrangementInstanceReport
  **/

  public Object getCorporateLeaseArrangementInstanceReport() {
    return corporateLeaseArrangementInstanceReport;
  }

  public void setCorporateLeaseArrangementInstanceReport(Object corporateLeaseArrangementInstanceReport) {
    this.corporateLeaseArrangementInstanceReport = corporateLeaseArrangementInstanceReport;
  }


}

