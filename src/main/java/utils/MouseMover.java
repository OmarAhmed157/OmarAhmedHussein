package utils;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.concurrent.TimeoutException;
import java.util.function.BooleanSupplier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseMover {

	//
	//	public static void moveMouse(int SECONDS, int iterations,final int MAX_X,final int MAX_Y) throws Exception {
	//		Robot robot = new Robot();
	////		Random random = new Random();
	//		
	////			robot.mouseMove(MAX_X, MAX_Y);
	//			MouseMover.moveMouse( iterations,MAX_X,MAX_Y, 1080);
	//			Thread.sleep(SECONDS);
	//		
	//	}
	static boolean Flag_out =false;
	static boolean FileAlreadyExists = false;
	static boolean done=false;
	//	static String label;
	public static void moveMouse(  int x, int y) throws AWTException, InterruptedException {
		Robot screenWin = new Robot(); 
		Thread.sleep(100);
		int maxTimes = 10;
		double Actual_X = MouseInfo.getPointerInfo().getLocation().getX();
		double Actual_Y = MouseInfo.getPointerInfo().getLocation().getY();
		for(int count = 0;(Actual_X != x || Actual_Y != y) && count < maxTimes; count++) {

			screenWin.mouseMove(x, y);
		}
		Thread.sleep(100);

	}

	public static void downloadReport () throws AWTException, InterruptedException, IOException, TimeoutException {
		String Site_Name [] = {"pass",
				"TROY","BAYEN","ISEHARA","CAMPINAS","GILCHING","TOGLIATTI","SAINT DENIS","CHENNAI-VECI","SHANGHAI XUHUI","BIETIGHEIM-BISSINGEN",
				"MAUA","PUNE","TUAM","WUXI","BURSA","CAIRO","DAEGU","EBERN","LAVAL","NILAI","NOIDA","SEOUL","TOKYO","WUHAN","AMIENS","ANYANG",
				"ATSUGI","BEKASI","FOSHAN","GETAFE","KOHNAN","MARTOS","MOSCOW","NAGOYA","PRAGUE","PRESOV","RAYONG","REILLY","SHASHI","SUZHOU","TOLUCA",
				"WARSAW","ZEBRAK","BOBIGNY","CHENNAI","ELKHART","HAMPTON","HELMOND","ITATIBA","MAZAMET","MONDOVI","NANJING","SANDTON","SANTENA","SKAWINA",
				"TAICANG","WENLING","ESENYURT","GIARMATA","ISTANBUL","KYONG JU","MUENCHEN","PIANEZZA","RAKOVNIK","RATINGEN","REDDITCH","SHANGHAI","SHENYANG",
				"SHENZHEN","Tanger 2","VESZPREM","ZARAGOZA","BEN AROUS","CHANGCHUN","CHON BURI","FUJIOKA 1","GUANGZHOU","QUERETARO","RIO BRAVO","SAN MATEO",
				"WOLFSBURG","BAD RODACH","BREUILPONT","CZECHOWICE","LE HAINAUT","MONDEVILLE","Rakovnik 2","FUENLABRADA","LA VERRIERE","AUBURN HILLS",
				"Caxias Do Sul","JUAREZ CIUDAD","CERGY PONTOISE","CRETEIL BOULLE","FRIEDRICHSDORF","NEUBRANDENBURG","SAINTE-FLORINE","ETAPLES-SUR-MER",
				"ITAKO - IBARAKI","SAN LUIS POTOSI","CRETEIL EUROPARC","TSUKUBA - IBARAKI","ANGERS - ECOUFLANT","SAN LUIS POTOSI PTR","SAO PAULO - INTERLAGOS",
				"Valeo East Liberty TFE","SAO PAULO - SAO BERNARDO","CHON BURI AMPHUR PANTHONG","RENO","SENS","WUHU","BATAM","BLOIS","REIMS","JUAREZ","PENANG",
				"PUEBLA","SMYRNA","ENFIDHA","ISSOIRE","JEDEIDA","LA SUZE","LIMOGES","LUEBECK","MIOVENI","NAKATSU","SEYMOUR","TIANJIN","WEMDING","ALLISTON",
				"CHANGSHU","CHRZANOW","HAMILTON","HUMPOLEC","ABBEVILLE","AHMEDABAD","ANNEMASSE","FROSINONE","FUJIOKA 2","PODBORANY","UITENHAGE","GREENSBURG",
				"WINCHESTER","MUEHLHAUSEN","QUERETARO 4","Misato-machi","CHATELLERAULT","East London 1","HIGHLAND PARK","KRONACH NEUSES","L'ISLE D'ABEAU",
				"ATHIS DE L ORNE","NOGENT LE ROTROU","SHANGHAI JIADING","SABLĂ-SUR-SARTHE","Atsugi-Shi Kanagawa-Ken 2","OURA","Chennai 9","YOKOTE - AKITA",
				"EBERN FISCHBACH"
		};

		for (int i=1; i<5 ; i++) {
			Robot screenWin = new Robot();

			Thread.sleep(2000);

			//Alt+Tab
			screenWin.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(100);
			screenWin.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			screenWin.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(100);
			screenWin.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(100);

			//search bar
			MouseMover.moveMouse( 1100, 480);
			//Left Click
			screenWin.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);
			screenWin.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);
			screenWin.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);
			screenWin.mouseRelease(InputEvent.BUTTON1_MASK);

			MouseMover.typeString(Site_Name[i]);

			//Choose the needed parameter
			MouseMover.moveMouse( 920, 520);

			//Left Click
			screenWin.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(500);
			screenWin.mouseRelease(InputEvent.BUTTON1_MASK);
			//			Thread.sleep(100);
			//			screenWin.mousePress(InputEvent.BUTTON1_MASK);
			//			Thread.sleep(100);
			//			screenWin.mouseRelease(InputEvent.BUTTON1_MASK);

			//wait for processing 
			Thread.sleep(5000);

			//1650, 150 arrow next to share
			MouseMover.moveMouse( 1790, 160);

			//Left Click
			screenWin.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);
			screenWin.mouseRelease(InputEvent.BUTTON1_MASK);

			//1650, 320 download report
			MouseMover.moveMouse( 1700, 290);

			//Left Click
			screenWin.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);
			screenWin.mouseRelease(InputEvent.BUTTON1_MASK);


			//1100, 450 confirm Download
			MouseMover.moveMouse( 1100, 450);

			//Left Click
			screenWin.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);
			screenWin.mouseRelease(InputEvent.BUTTON1_MASK);

			//wait for download
			//			Thread.sleep(20000);
//			MouseMover.waitUntil(null,null);

			Thread.sleep(500);

		//	MouseMover.renameFile(Site_Name[i], null, null);


			//Alt+Tab
			screenWin.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(100);
			screenWin.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(100);
			screenWin.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(100);
			screenWin.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(100);


		}
	}
/*
	public static void renameFile(String destination, String Filename, String template_name) throws IOException, InterruptedException, AWTException {
		if(!done) {
			try {
				Path source = Paths.get(destination);
				System.out.println(source);
				Files.move(source, source.resolveSibling("GCP_"+template_name+"_2021_-"+Filename+".pdf"));

			}catch(FileAlreadyExistsException e) {
				System.out.println("File Already Exists");
				FileAlreadyExists = true;
			}catch (NoSuchFileException e) {
				System.out.println("File not found");
			}
		}
		if(done) {
			if(selenium_App_Country.Country_Download) {
				selenium_App_Country.Country_Download= false;
				selenium_App_Country.driver_Country.navigate().refresh();
				Thread.sleep(10000);
			}
			else if(selenium_App_Site.Site_Download) {
				selenium_App_Site.Site_Download= false;
				selenium_App_Site.driver_Site.navigate().refresh();
				Thread.sleep(10000);
			}
		}
	}
*/

	static void typeString(String string) throws InterruptedException, AWTException
	{
		//Instantiating robot
		Robot robot = new Robot();

		//Looping through every char
		for (int i = 0; i < string.length(); i++)
		{
			//Getting current char
			char c = string.charAt(i);

			//Pressing shift if it's uppercase
			if (Character.isUpperCase(c))
			{
				robot.keyPress(KeyEvent.VK_SHIFT);
			}

			//Actually pressing the key
			robot.keyPress(Character.toUpperCase(c));
			robot.keyRelease(Character.toUpperCase(c));

			//Releasing shift if it's uppercase
			if (Character.isUpperCase(c))
			{
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}

			//Optional delay to make it look like it's a human typing
			Thread.sleep(20 + new Random().nextInt(150));
		}
	}


/*
	static void waitUntil(String Filename,String Template) throws TimeoutException, InterruptedException{

		File file = new File("C:\\Downloader\\Reports_Downloader\\Downloaded_Reports\\"+Filename);
		long start = System.currentTimeMillis();
		long timeoutms = 200000;

		while (!file.exists() && !done){
			if (System.currentTimeMillis() - start > timeoutms ){
				AutoCompleteComboBox_edited.frame.dispose();
				throw new TimeoutException(String.format("Condition not meet within %s ms",timeoutms)); 
			}
			else {
				System.out.println("not yet");
				if (System.currentTimeMillis() - start > (timeoutms-10000) ) {

					timeoutms = 960000;
					System.out.println("GOT ERROR MESSAGE");
					Thread.sleep(120000); 
					done = true;
					
					if(Template.equals("Country")) {
						selenium_App_Country.Country_Download= true;
						selenium_App_Country.j = selenium_App_Country.j-1;
					}
					else if (Template.equals("Site")) {
						selenium_App_Site.Site_Download= true;
						selenium_App_Site.i = selenium_App_Site.i-1;
					}
				}
			}
		}
		System.out.println("done");

	}
*/
}