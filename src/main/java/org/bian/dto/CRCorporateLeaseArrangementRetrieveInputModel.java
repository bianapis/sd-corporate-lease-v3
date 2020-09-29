package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateLeaseArrangementRetrieveInputModel
 */
public class CRCorporateLeaseArrangementRetrieveInputModel   {
  private Object corporateLeaseArrangementRetrieveActionTaskRecord = null;

  private String corporateLeaseArrangementRetrieveActionRequest = null;

  private CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceReportRecord corporateLeaseArrangementInstanceReportRecord = null;

  private CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceAnalysis corporateLeaseArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateLeaseArrangementRetrieveActionTaskRecord
  **/

  public Object getCorporateLeaseArrangementRetrieveActionTaskRecord() {
    return corporateLeaseArrangementRetrieveActionTaskRecord;
  }

  public void setCorporateLeaseArrangementRetrieveActionTaskRecord(Object corporateLeaseArrangementRetrieveActionTaskRecord) {
    this.corporateLeaseArrangementRetrieveActionTaskRecord = corporateLeaseArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateLeaseArrangementRetrieveActionRequest
  **/

  public String getCorporateLeaseArrangementRetrieveActionRequest() {
    return corporateLeaseArrangementRetrieveActionRequest;
  }

  public void setCorporateLeaseArrangementRetrieveActionRequest(String corporateLeaseArrangementRetrieveActionRequest) {
    this.corporateLeaseArrangementRetrieveActionRequest = corporateLeaseArrangementRetrieveActionRequest;
  }


  /**
   * Get corporateLeaseArrangementInstanceReportRecord
   * @return corporateLeaseArrangementInstanceReportRecord
  **/

  public CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceReportRecord getCorporateLeaseArrangementInstanceReportRecord() {
    return corporateLeaseArrangementInstanceReportRecord;
  }

  public void setCorporateLeaseArrangementInstanceReportRecord(CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceReportRecord corporateLeaseArrangementInstanceReportRecord) {
    this.corporateLeaseArrangementInstanceReportRecord = corporateLeaseArrangementInstanceReportRecord;
  }


  /**
   * Get corporateLeaseArrangementInstanceAnalysis
   * @return corporateLeaseArrangementInstanceAnalysis
  **/

  public CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceAnalysis getCorporateLeaseArrangementInstanceAnalysis() {
    return corporateLeaseArrangementInstanceAnalysis;
  }

  public void setCorporateLeaseArrangementInstanceAnalysis(CRCorporateLeaseArrangementRetrieveInputModelCorporateLeaseArrangementInstanceAnalysis corporateLeaseArrangementInstanceAnalysis) {
    this.corporateLeaseArrangementInstanceAnalysis = corporateLeaseArrangementInstanceAnalysis;
  }


}

