package testSuites;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import business.HistoryChart;
import business.Logs;
import common.FileUtil;

public class ChartTest {

	@Test
	public void verifyChart() {
		String fileName = FileUtil.generateFileName();
		ArrayList<Integer> inputNumberList = HistoryChart.generateLogFile(fileName);
		int statusCode=Logs.uploadFile(fileName);
		/*currently we are verifying only status code 
		 * but if needed we can also verify the API response body
		 * using json or xml parser*/
		assertEquals(statusCode, 202,"Upload log API failed");
		HistoryChart.verifyChartUsingAPI(inputNumberList);
	}
}
