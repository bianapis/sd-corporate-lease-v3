package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis;
import org.bian.dto.SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecord
 */
public class SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecord   {
  private SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis corporateLeaseActivityAnalysis = null;

  private SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis corporateLeasePerformanceAnalysis = null;

  private SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get corporateLeaseActivityAnalysis
   * @return corporateLeaseActivityAnalysis
  **/

  public SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis getCorporateLeaseActivityAnalysis() {
    return corporateLeaseActivityAnalysis;
  }

  public void setCorporateLeaseActivityAnalysis(SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis corporateLeaseActivityAnalysis) {
    this.corporateLeaseActivityAnalysis = corporateLeaseActivityAnalysis;
  }


  /**
   * Get corporateLeasePerformanceAnalysis
   * @return corporateLeasePerformanceAnalysis
  **/

  public SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis getCorporateLeasePerformanceAnalysis() {
    return corporateLeasePerformanceAnalysis;
  }

  public void setCorporateLeasePerformanceAnalysis(SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis corporateLeasePerformanceAnalysis) {
    this.corporateLeasePerformanceAnalysis = corporateLeasePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCorporateLeaseRetrieveInputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

