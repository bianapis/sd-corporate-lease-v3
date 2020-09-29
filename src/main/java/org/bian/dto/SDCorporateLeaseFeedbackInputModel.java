package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCorporateLeaseFeedbackInputModelCorporateLeaseFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCorporateLeaseFeedbackInputModel
 */
public class SDCorporateLeaseFeedbackInputModel   {
  private Object corporateLeaseFeedbackActionTaskRecord = null;

  private SDCorporateLeaseFeedbackInputModelCorporateLeaseFeedbackActionRecord corporateLeaseFeedbackActionRecord = null;


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

  public SDCorporateLeaseFeedbackInputModelCorporateLeaseFeedbackActionRecord getCorporateLeaseFeedbackActionRecord() {
    return corporateLeaseFeedbackActionRecord;
  }

  public void setCorporateLeaseFeedbackActionRecord(SDCorporateLeaseFeedbackInputModelCorporateLeaseFeedbackActionRecord corporateLeaseFeedbackActionRecord) {
    this.corporateLeaseFeedbackActionRecord = corporateLeaseFeedbackActionRecord;
  }


}

