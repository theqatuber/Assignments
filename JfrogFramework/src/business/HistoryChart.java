package business;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import common.CommonUtil;
import common.DateUtil;
import common.FileUtil;
import service.ChartService;

public class HistoryChart {

	private static final String PLACE_HOLDER_STRING = "<number>";
	private static final String TEMPLATE_FILE = "./templates/char_log_template.txt";

	public static ArrayList<Integer> generateLogFile(String fileName) {
		ArrayList<Integer> randomList=CommonUtil.getRandomNumberList();
		String templateString=FileUtil.readTemplateStringFromFile(TEMPLATE_FILE);
		String fileContent="";
		for(Integer randomNo:randomList) {
			templateString.replace(PLACE_HOLDER_STRING, randomNo+"");
			fileContent=fileContent+templateString;
		}
		FileUtil.createFile(fileName,fileContent);
		return randomList;
	}

	public static void verifyChartUsingAPI(ArrayList<Integer> expectedNumberList) {
		ArrayList<Integer> actualNumbers= getNumberListFromChart();
		
		//Compare actual and expected arraylist of chart values
		assert.assertEquals(actualNumbers.size(),expectedNumberList.size());
		for(int i=0;i<expectedNumberList.size();i++) {
			assert.assertEquals(actualNumbers.get(i), expectedNumberList.get(i));
		}
	}

	private static ArrayList<Integer> getNumberListFromChart() {
		Response response=ChartService.getHistoryChartData();
		ArrayList<Integer> actualChartValues=new ArrayList<Integer>();
		//Parse json response to create an arraylist and return the list from this method
		return actualChartValues;
	}

	

	

}
