This Project is implemented by Omar Ahmed Hussein

Project Title: Terkwaz Business Solutions pre-interview Assessment.

Project description: 
	The project is consists of two packages; main package and test package.
	
	main package contains: 
	-resources package: that contains ChromeDriver used in Selenium which used in UITesting and any data needed in the main modules.
	-Java package: that contains the Helpers classes (empty) that covers the big modules and make more than one task between different modules.
				 : Modules classes (empty) that covers the main modules that do one job but long steps in same topic.
				 : Utils classes that covers the generic classes which used in many other classes, such as: RestAssured and Selenium bases (config files)
				 		Also contains the listeners to add the test results in the execution report.
				 		
	test package contains:
	-resources package: that contains the data sources needed in tests (such as the image uploaded in second task), 
							Also the screenshots resulted from the execution
	-Java package: that contains apiTestAutomation classes that covers the API tests implements by Restassured.
				 : webGUITestAutomation classes that covers UI tests needed in the first 3 tasks implemented by Selenium webdriver.
				 		 
	Notes:
	-Execution report is implemented by TestNG,it  appears in project/test-output/index.html that includes test results attached screenshots and API response.
	-Project/testng.xml is the file that runs all tests at once.
	
	
	Steps To run the project:
	-import the project (or clone it from the GIT Repo) then be sure that the dependencies from Project/pom.xml is installed, 
		else, right click on this file and choose maven--> update project. "for eclipse IDE"
	-you can run each test one by one from its individual class, or all at once by using testng.xml class
	