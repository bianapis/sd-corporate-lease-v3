package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAdministerRetrieveInputModelAdministerInstanceAnalysis;
import org.bian.dto.BQAdministerRetrieveInputModelAdministerInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAdministerRetrieveInputModel
 */
public class BQAdministerRetrieveInputModel   {
  private Object administerRetrieveActionTaskRecord = null;

  private String administerRetrieveActionRequest = null;

  private BQAdministerRetrieveInputModelAdministerInstanceReport administerInstanceReport = null;

  private BQAdministerRetrieveInputModelAdministerInstanceAnalysis administerInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return administerRetrieveActionTaskRecord
  **/

  public Object getAdministerRetrieveActionTaskRecord() {
    return administerRetrieveActionTaskRecord;
  }

  public void setAdministerRetrieveActionTaskRecord(Object administerRetrieveActionTaskRecord) {
    this.administerRetrieveActionTaskRecord = administerRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return administerRetrieveActionRequest
  **/

  public String getAdministerRetrieveActionRequest() {
    return administerRetrieveActionRequest;
  }

  public void setAdministerRetrieveActionRequest(String administerRetrieveActionRequest) {
    this.administerRetrieveActionRequest = administerRetrieveActionRequest;
  }


  /**
   * Get administerInstanceReport
   * @return administerInstanceReport
  **/

  public BQAdministerRetrieveInputModelAdministerInstanceReport getAdministerInstanceReport() {
    return administerInstanceReport;
  }

  public void setAdministerInstanceReport(BQAdministerRetrieveInputModelAdministerInstanceReport administerInstanceReport) {
    this.administerInstanceReport = administerInstanceReport;
  }


  /**
   * Get administerInstanceAnalysis
   * @return administerInstanceAnalysis
  **/

  public BQAdministerRetrieveInputModelAdministerInstanceAnalysis getAdministerInstanceAnalysis() {
    return administerInstanceAnalysis;
  }

  public void setAdministerInstanceAnalysis(BQAdministerRetrieveInputModelAdministerInstanceAnalysis administerInstanceAnalysis) {
    this.administerInstanceAnalysis = administerInstanceAnalysis;
  }


}

