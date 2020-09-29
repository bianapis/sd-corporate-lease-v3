package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis;
import org.bian.dto.SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecord
 */
public class SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecord   {
  private SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis corporateLeaseActivityAnalysis = null;

  private SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis corporateLeasePerformanceAnalysis = null;

  private SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get corporateLeaseActivityAnalysis
   * @return corporateLeaseActivityAnalysis
  **/

  public SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis getCorporateLeaseActivityAnalysis() {
    return corporateLeaseActivityAnalysis;
  }

  public void setCorporateLeaseActivityAnalysis(SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeaseActivityAnalysis corporateLeaseActivityAnalysis) {
    this.corporateLeaseActivityAnalysis = corporateLeaseActivityAnalysis;
  }


  /**
   * Get corporateLeasePerformanceAnalysis
   * @return corporateLeasePerformanceAnalysis
  **/

  public SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis getCorporateLeasePerformanceAnalysis() {
    return corporateLeasePerformanceAnalysis;
  }

  public void setCorporateLeasePerformanceAnalysis(SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordCorporateLeasePerformanceAnalysis corporateLeasePerformanceAnalysis) {
    this.corporateLeasePerformanceAnalysis = corporateLeasePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCorporateLeaseRetrieveOutputModelCorporateLeaseRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

