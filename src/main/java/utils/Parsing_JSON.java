package utils;

import java.awt.List;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject; 

public class Parsing_JSON {

	public static JSONObject Parse_JSON_0(String json) {
		JSONObject obj = null ;
		try {
			obj = new JSONObject (json);
		} catch (JSONException e) {
			System.out.println("failed to find " + json);e.printStackTrace();
		}
		return obj;
	}
	public static String Parse_JSON_1(String json,String Auto_in_obj) {
		String Auto1 = null;
		try {
			JSONObject obj = new JSONObject (json);
			Auto1 = obj.getString(Auto_in_obj);
		} catch (JSONException e1) {
			System.out.println("failed to find " + Auto_in_obj);e1.printStackTrace();
		}
		return Auto1;
	}

	public static JSONArray Parse_JSON_2(String json, String Arr_in_obj) {
		JSONArray arr = null;
		try {
			JSONObject obj = new JSONObject (json);
			arr = obj.getJSONArray(Arr_in_obj);	
		} catch (JSONException e1) {
			System.out.println("failed to find " + Arr_in_obj);e1.printStackTrace();
		}	
		return arr;
	}

	public static String Parse_JSON_3(String json, String Arr_in_obj,int int_obj_in_arr) {
		String obj1=null;
		try {
			JSONObject obj = new JSONObject (json);
			JSONArray arr = obj.getJSONArray(Arr_in_obj);
			obj1 = arr.getString(int_obj_in_arr);
		} catch (JSONException e1) {
			System.out.println("failed to find " + Arr_in_obj);e1.printStackTrace();
		}
		return obj1;	
	}

	public static String Parse_JSON_4(String json, String Arr_in_obj,int int_obj_in_arr,String Auto_obj_in_arr) {
		String obj1=null;
		try {
			JSONObject obj = new JSONObject (json);
			JSONArray arr = obj.getJSONArray(Arr_in_obj);
			JSONObject obj_in_arr1 = arr.getJSONObject(int_obj_in_arr);
			obj1 = obj_in_arr1.getString(Auto_obj_in_arr);
		} catch (JSONException e1) {
			System.out.println("failed to find " + Auto_obj_in_arr);
			e1.printStackTrace();
		} catch (NullPointerException e1) {
			System.out.println("Failed to find an element");
		}
		return obj1;
	}

	public static JSONArray Parse_JSON_5(String json, String Arr_in_obj,int int_obj_in_arr,String arr_in_obj_in_arr) {
		JSONArray obj1=null;
		try {
			JSONObject obj = new JSONObject (json);
			JSONArray arr = obj.getJSONArray(Arr_in_obj);
			JSONObject obj_in_arr1 = arr.getJSONObject(int_obj_in_arr);
			JSONArray arr_in_obj_in_arr1 = obj_in_arr1.getJSONArray(arr_in_obj_in_arr);
			obj1 = arr_in_obj_in_arr1;

		} catch (JSONException e1) {
			System.out.println("failed to find " + arr_in_obj_in_arr);e1.printStackTrace();
		}	
		return obj1;
	}
	public static String Parse_JSON_6(String json , String Arr_in_obj,int int_obj_in_arr ,String arr_in_obj_in_arr,int int_obj_in_arr2) {
		String obj1 = null;
		try {
			JSONObject obj = new JSONObject (json);
			JSONArray arr = obj.getJSONArray(Arr_in_obj);
			JSONObject obj_in_arr1 = arr.getJSONObject(int_obj_in_arr);
			JSONArray arr_in_obj_in_arr1 = obj_in_arr1.getJSONArray(arr_in_obj_in_arr);
			obj1 = arr_in_obj_in_arr1.getString(int_obj_in_arr2);

		} catch (JSONException e1) {
			System.out.println("failed to find " + arr_in_obj_in_arr);e1.printStackTrace();
		}	
		return obj1;
	}
	public static String Parse_JSON_7(String json , String Arr_in_obj,int int_obj_in_arr,String arr_in_obj_in_arr,int int_obj_in_arr2,String Auto_obj_in_arr2) {
		String obj1 = null;
		try {
			JSONObject obj = new JSONObject (json);
			JSONArray arr = obj.getJSONArray(Arr_in_obj);
			JSONObject obj_in_arr1 = arr.getJSONObject(int_obj_in_arr);
			JSONArray arr_in_obj_in_arr1 = obj_in_arr1.getJSONArray(arr_in_obj_in_arr);
			JSONObject obj_in_arr2 = arr_in_obj_in_arr1.getJSONObject(int_obj_in_arr2);
			obj1 = obj_in_arr2.getString(Auto_obj_in_arr2);

		} catch (JSONException e1) {
			System.out.println("failed to find " + Auto_obj_in_arr2);
			//			e1.printStackTrace();
		}
		return obj1;
	}




}