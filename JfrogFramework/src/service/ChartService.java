package service;

import java.util.HashMap;
import java.util.Map;

import business.Response;
import common.RestUtil;

public class ChartService extends BaseService{

	
	private static final String CHART_SERVICE_GET_URL = null;

	public static Response getHistoryChartData() {
		Map<String,String> headers=getHeadersWithDefaultParams();		
		Response resp=RestUtil.callHttpGet(CHART_SERVICE_GET_URL,headers);
		return resp;
	}

	

}
