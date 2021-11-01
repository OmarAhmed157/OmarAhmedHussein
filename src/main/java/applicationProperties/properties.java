package applicationProperties;

public class properties {

	
	static public String dataSourceFilePath;
	static public String seleniumBaseURL;
	static public String apiBaseURL;
	static public String chromeInstance;
	static public String seleniumChromeSourceEXEPath;
	static public String dateTimeFormatValida;
//	static public String chromeUserData;

	public static void isProduction(boolean production) {
		chromeInstance = "";
		seleniumChromeSourceEXEPath = System.getProperty("user.dir") +"/src/main/resources/chromedriver";
		dateTimeFormatValida = "";
		
		//Replace "moham" with your username	
//		chromeUserData="C:\\Users\\moham\\AppData\\Local\\Google\\Chrome\\User Data";

		if(production) {
			dataSourceFilePath = "";
			seleniumBaseURL = "https://www.fb.com/";
			apiBaseURL = "";
		}
		else {		
			dataSourceFilePath = "";
			seleniumBaseURL = "";
			apiBaseURL = "";
		}


	}
}
