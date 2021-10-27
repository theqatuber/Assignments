package business;

import io.restassured.response;

public class Logs {

	public static int uploadFile(String fileName) {
		Response responseObj=LogUploadService.uploadFile(fileName);
		return responseObj.getStatuscode();
	}

}
