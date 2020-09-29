/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorporateLeaseApiServiceImpl implements CorporateLeaseApiService {

	public SDCorporateLeaseActivateOutputModel activate(SDCorporateLeaseActivateInputModel request){
		return JsonReader.read("activate-SDCorporateLeaseActivateOutputModel.json",new TypeReference<SDCorporateLeaseActivateOutputModel>(){});
	}
	
	public SDCorporateLeaseConfigureOutputModel configure(String sdReferenceId, SDCorporateLeaseConfigureInputModel request){
		return JsonReader.read("configure-SDCorporateLeaseConfigureOutputModel.json",new TypeReference<SDCorporateLeaseConfigureOutputModel>(){});
	}
	
	public BQAdministerControlOutputModel controlAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerControlInputModel request){
		return JsonReader.read("control-BQAdministerControlOutputModel.json",new TypeReference<BQAdministerControlOutputModel>(){});
	}
	
	public CRCorporateLeaseArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementControlInputModel request){
		return JsonReader.read("control-CRCorporateLeaseArrangementControlOutputModel.json",new TypeReference<CRCorporateLeaseArrangementControlOutputModel>(){});
	}
	
	public BQAdministerExchangeOutputModel exchangeAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerExchangeInputModel request){
		return JsonReader.read("exchange-BQAdministerExchangeOutputModel.json",new TypeReference<BQAdministerExchangeOutputModel>(){});
	}
	
	public BQFulfillExchangeOutputModel exchangeFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillExchangeInputModel request){
		return JsonReader.read("exchange-BQFulfillExchangeOutputModel.json",new TypeReference<BQFulfillExchangeOutputModel>(){});
	}
	
	public CRCorporateLeaseArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRCorporateLeaseArrangementExchangeOutputModel.json",new TypeReference<CRCorporateLeaseArrangementExchangeOutputModel>(){});
	}
	
	public BQFulfillExecuteOutputModel executeFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillExecuteInputModel request){
		return JsonReader.read("execute-BQFulfillExecuteOutputModel.json",new TypeReference<BQFulfillExecuteOutputModel>(){});
	}
	
	public CRCorporateLeaseArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRCorporateLeaseArrangementExecuteOutputModel.json",new TypeReference<CRCorporateLeaseArrangementExecuteOutputModel>(){});
	}
	
	public SDCorporateLeaseFeedbackOutputModel feedback(String sdReferenceId, SDCorporateLeaseFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorporateLeaseFeedbackOutputModel.json",new TypeReference<SDCorporateLeaseFeedbackOutputModel>(){});
	}
	
	public CRCorporateLeaseArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateLeaseArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCorporateLeaseArrangementInitiateOutputModel.json",new TypeReference<CRCorporateLeaseArrangementInitiateOutputModel>(){});
	}
	
	public BQFulfillInitiateOutputModel initiateFulfill(String sdReferenceId, String crReferenceId, BQFulfillInitiateInputModel request){
		return JsonReader.read("initiate-BQFulfillInitiateOutputModel.json",new TypeReference<BQFulfillInitiateOutputModel>(){});
	}
	
	public BQAdministerRequestOutputModel requestAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerRequestInputModel request){
		return JsonReader.read("request-BQAdministerRequestOutputModel.json",new TypeReference<BQAdministerRequestOutputModel>(){});
	}
	
	public BQFulfillRequestOutputModel requestFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillRequestInputModel request){
		return JsonReader.read("request-BQFulfillRequestOutputModel.json",new TypeReference<BQFulfillRequestOutputModel>(){});
	}
	
	public CRCorporateLeaseArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementRequestInputModel request){
		return JsonReader.read("request-CRCorporateLeaseArrangementRequestOutputModel.json",new TypeReference<CRCorporateLeaseArrangementRequestOutputModel>(){});
	}
	
	public CRCorporateLeaseArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorporateLeaseArrangementRetrieveOutputModel.json",new TypeReference<CRCorporateLeaseArrangementRetrieveOutputModel>(){});
	}
	
	public BQAdministerRetrieveOutputModel retrieveAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAdministerRetrieveOutputModel.json",new TypeReference<BQAdministerRetrieveOutputModel>(){});
	}
	
	public BQFulfillRetrieveOutputModel retrieveFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFulfillRetrieveOutputModel.json",new TypeReference<BQFulfillRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorporateLeaseRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorporateLeaseRetrieveOutputModel.json",new TypeReference<SDCorporateLeaseRetrieveOutputModel>(){});
	}
	
	public CRCorporateLeaseArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateLeaseArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCorporateLeaseArrangementUpdateOutputModel.json",new TypeReference<CRCorporateLeaseArrangementUpdateOutputModel>(){});
	}
	
	public BQAdministerUpdateOutputModel updateAdminister(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAdministerUpdateInputModel request){
		return JsonReader.read("update-BQAdministerUpdateOutputModel.json",new TypeReference<BQAdministerUpdateOutputModel>(){});
	}
	
	public BQFulfillUpdateOutputModel updateFulfill(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillUpdateInputModel request){
		return JsonReader.read("update-BQFulfillUpdateOutputModel.json",new TypeReference<BQFulfillUpdateOutputModel>(){});
	}
	
}
