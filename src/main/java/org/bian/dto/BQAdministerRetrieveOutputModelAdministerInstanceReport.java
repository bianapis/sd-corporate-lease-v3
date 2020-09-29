package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAdministerRetrieveOutputModelAdministerInstanceReport
 */
public class BQAdministerRetrieveOutputModelAdministerInstanceReport   {
  private Object administerInstanceReportRecord = null;

  private String administerInstanceReportType = null;

  private String administerInstanceReportParameters = null;

  private Object administerInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return administerInstanceReportRecord
  **/

  public Object getAdministerInstanceReportRecord() {
    return administerInstanceReportRecord;
  }

  public void setAdministerInstanceReportRecord(Object administerInstanceReportRecord) {
    this.administerInstanceReportRecord = administerInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return administerInstanceReportType
  **/

  public String getAdministerInstanceReportType() {
    return administerInstanceReportType;
  }

  public void setAdministerInstanceReportType(String administerInstanceReportType) {
    this.administerInstanceReportType = administerInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return administerInstanceReportParameters
  **/

  public String getAdministerInstanceReportParameters() {
    return administerInstanceReportParameters;
  }

  public void setAdministerInstanceReportParameters(String administerInstanceReportParameters) {
    this.administerInstanceReportParameters = administerInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return administerInstanceReport
  **/

  public Object getAdministerInstanceReport() {
    return administerInstanceReport;
  }

  public void setAdministerInstanceReport(Object administerInstanceReport) {
    this.administerInstanceReport = administerInstanceReport;
  }


}

