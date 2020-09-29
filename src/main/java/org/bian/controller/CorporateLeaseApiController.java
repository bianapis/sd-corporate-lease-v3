/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CorporateLeaseApiController {

	@Autowired
	CorporateLeaseApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDCorporateLeaseActivateOutputModel> activate(@RequestBody BianRequest<SDCorporateLeaseActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDCorporateLeaseConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorporateLeaseConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("administer")
	@Fulfill.Control
	public BianResponse<BQAdministerControlOutputModel> controlAdminister(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAdministerControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlAdminister(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRCorporateLeaseArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorporateLeaseArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("administer")
	@Fulfill.Exchange
	public BianResponse<BQAdministerExchangeOutputModel> exchangeAdminister(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAdministerExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAdminister(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfill")
	@Fulfill.Exchange
	public BianResponse<BQFulfillExchangeOutputModel> exchangeFulfill(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFulfill(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Exchange
	public BianResponse<CRCorporateLeaseArrangementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorporateLeaseArrangementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfill")
	@Fulfill.Execute
	public BianResponse<BQFulfillExecuteOutputModel> executeFulfill(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeFulfill(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Execute
	public BianResponse<CRCorporateLeaseArrangementExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorporateLeaseArrangementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDCorporateLeaseFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorporateLeaseFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRCorporateLeaseArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCorporateLeaseArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfill")
	@Fulfill.Initiate
	public BianResponse<BQFulfillInitiateOutputModel> initiateFulfill(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFulfillInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFulfill(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("administer")
	@Fulfill.Request
	public BianResponse<BQAdministerRequestOutputModel> requestAdminister(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAdministerRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAdminister(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfill")
	@Fulfill.Request
	public BianResponse<BQFulfillRequestOutputModel> requestFulfill(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFulfill(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRCorporateLeaseArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorporateLeaseArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRCorporateLeaseArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("administer")
	@Fulfill.Retrieve
	public BianResponse<BQAdministerRetrieveOutputModel> retrieveAdminister(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAdminister(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fulfill")
	@Fulfill.Retrieve
	public BianResponse<BQFulfillRetrieveOutputModel> retrieveFulfill(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFulfill(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDCorporateLeaseRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRCorporateLeaseArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorporateLeaseArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("administer")
	@Fulfill.Update
	public BianResponse<BQAdministerUpdateOutputModel> updateAdminister(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAdministerUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAdminister(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfill")
	@Fulfill.Update
	public BianResponse<BQFulfillUpdateOutputModel> updateFulfill(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFulfill(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
