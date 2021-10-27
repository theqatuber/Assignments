package common;

public class FileUtil {
	private static final String FILE_NAME_INITIAL = "jfrog_log_";
	
	public static String generateFileName() {
		String timeStamp=DateUtil.getCurrentTimeStamp();
		String fileName=FILE_NAME_INITIAL+timeStamp;
		return fileName;
	}

	public static void createFile(String fileName, String fileContent) {
		// TODO Auto-generated method stub
		
	}

	public static String readTemplateStringFromFile(String templateFile) {
		// TODO Auto-generated method stub
		return null;
	}

}
