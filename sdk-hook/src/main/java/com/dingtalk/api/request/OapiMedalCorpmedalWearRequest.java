package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMedalCorpmedalWearResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.medal.corpmedal.wear request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.31
 */
public class OapiMedalCorpmedalWearRequest extends BaseTaobaoRequest<OapiMedalCorpmedalWearResponse> {
	
	

	/** 
	* 1 佩戴，2 摘除
	 */
	private Long operation;

	/** 
	* 勋章模板ID
	 */
	private Long templateId;

	/** 
	* 员工ID
	 */
	private String userid;

	public void setOperation(Long operation) {
		this.operation = operation;
	}

	public Long getOperation() {
		return this.operation;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.medal.corpmedal.wear";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("operation", this.operation);
		txtParams.put("template_id", this.templateId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMedalCorpmedalWearResponse> getResponseClass() {
		return OapiMedalCorpmedalWearResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operation, "operation");
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}