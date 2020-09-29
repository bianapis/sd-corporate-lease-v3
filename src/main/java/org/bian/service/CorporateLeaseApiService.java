/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorporateLeaseApiService {

	SDCorporateLeaseActivateOutputModel activate(SDCorporateLeaseActivateInputModel request);
	
	SDCorporateLeaseConfigureOutputModel configure(String sdReferenceId, SDCorporateLeaseConfigureInputModel request);
	
	BQAdministerControlOutputModel controlAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerControlInputModel request);
	
	CRCorporateLeaseArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementControlInputModel request);
	
	BQAdministerExchangeOutputModel exchangeAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerExchangeInputModel request);
	
	BQFulfillExchangeOutputModel exchangeFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillExchangeInputModel request);
	
	CRCorporateLeaseArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementExchangeInputModel request);
	
	BQFulfillExecuteOutputModel executeFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillExecuteInputModel request);
	
	CRCorporateLeaseArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementExecuteInputModel request);
	
	SDCorporateLeaseFeedbackOutputModel feedback(String sdReferenceId, SDCorporateLeaseFeedbackInputModel request);
	
	CRCorporateLeaseArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateLeaseArrangementInitiateInputModel request);
	
	BQFulfillInitiateOutputModel initiateFulfill(String sdReferenceId, String crReferenceId, BQFulfillInitiateInputModel request);
	
	BQAdministerRequestOutputModel requestAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerRequestInputModel request);
	
	BQFulfillRequestOutputModel requestFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillRequestInputModel request);
	
	CRCorporateLeaseArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementRequestInputModel request);
	
	CRCorporateLeaseArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQAdministerRetrieveOutputModel retrieveAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFulfillRetrieveOutputModel retrieveFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorporateLeaseRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorporateLeaseArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementUpdateInputModel request);
	
	BQAdministerUpdateOutputModel updateAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerUpdateInputModel request);
	
	BQFulfillUpdateOutputModel updateFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillUpdateInputModel request);
	
}
