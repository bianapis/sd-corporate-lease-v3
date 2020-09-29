package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseFeedbackOutputModelCorporateLeaseFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseFeedbackOutputModel
 */
public class SDCorporateLeaseFeedbackOutputModel   {
  private String corporateLeaseFeedbackActionTaskReference = null;

  private Object corporateLeaseFeedbackActionTaskRecord = null;

  private SDCorporateLeaseFeedbackOutputModelCorporateLeaseFeedbackActionRecord corporateLeaseFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return corporateLeaseFeedbackActionTaskReference
  **/

  public String getCorporateLeaseFeedbackActionTaskReference() {
    return corporateLeaseFeedbackActionTaskReference;
  }

  public void setCorporateLeaseFeedbackActionTaskReference(String corporateLeaseFeedbackActionTaskReference) {
    this.corporateLeaseFeedbackActionTaskReference = corporateLeaseFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return corporateLeaseFeedbackActionTaskRecord
  **/

  public Object getCorporateLeaseFeedbackActionTaskRecord() {
    return corporateLeaseFeedbackActionTaskRecord;
  }

  public void setCorporateLeaseFeedbackActionTaskRecord(Object corporateLeaseFeedbackActionTaskRecord) {
    this.corporateLeaseFeedbackActionTaskRecord = corporateLeaseFeedbackActionTaskRecord;
  }


  /**
   * Get corporateLeaseFeedbackActionRecord
   * @return corporateLeaseFeedbackActionRecord
  **/

  public SDCorporateLeaseFeedbackOutputModelCorporateLeaseFeedbackActionRecord getCorporateLeaseFeedbackActionRecord() {
    return corporateLeaseFeedbackActionRecord;
  }

  public void setCorporateLeaseFeedbackActionRecord(SDCorporateLeaseFeedbackOutputModelCorporateLeaseFeedbackActionRecord corporateLeaseFeedbackActionRecord) {
    this.corporateLeaseFeedbackActionRecord = corporateLeaseFeedbackActionRecord;
  }


}

