package api;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import applicationProperties.properties;
import utils.*; 



public class TestAPI {
	
	public static void main(String[] args) {
		
		properties.isProduction(true);
//		APIsBase.Call("GET","https://reqres.in/api/users?page=2",false,"");
		Selenium_Base.Selenium_config("mohamed25193");
		
		
	}

}
