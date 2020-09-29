package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceReportRecord
 */
public class CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceReportRecord   {
  private String corporateLeaseArrangementInstanceReportReference = null;

  private String corporateLeaseArrangementInstanceReportType = null;

  private String corporateLeaseArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return corporateLeaseArrangementInstanceReportReference
  **/

  public String getCorporateLeaseArrangementInstanceReportReference() {
    return corporateLeaseArrangementInstanceReportReference;
  }

  public void setCorporateLeaseArrangementInstanceReportReference(String corporateLeaseArrangementInstanceReportReference) {
    this.corporateLeaseArrangementInstanceReportReference = corporateLeaseArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateLeaseArrangementInstanceReportParameters
  **/

  public String getCorporateLeaseArrangementInstanceReportParameters() {
    return corporateLeaseArrangementInstanceReportParameters;
  }

  public void setCorporateLeaseArrangementInstanceReportParameters(String corporateLeaseArrangementInstanceReportParameters) {
    this.corporateLeaseArrangementInstanceReportParameters = corporateLeaseArrangementInstanceReportParameters;
  }


}

