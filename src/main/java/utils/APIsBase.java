package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class APIsBase {

	public static void Call(String API_Request, String API_URL,boolean isThereABody, String jsonInputString) {
		int ConnectTimeout= 20000;
		int ReadTimeout = 20000;
		HttpURLConnection connection = null;
		URL url;
		BufferedReader reader = null;
		String line;
		StringBuffer responseContent = new StringBuffer();
		try {
			Certificate_Disable.Disable_Certificate();

			url = new URL(API_URL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(API_Request);
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setRequestProperty("Accept", "application/json");
			connection.setDoOutput(true);
			if(isThereABody) {
				try(java.io.OutputStream os = connection.getOutputStream()) {
					byte[] input = jsonInputString.getBytes("utf-8");
					os.write(input, 0, input.length);			
				}
			}
			
			connection.setConnectTimeout(ConnectTimeout);
			connection.setReadTimeout(ReadTimeout);

			int status = connection.getResponseCode();
			if ( status > 299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}

			String Response_Content = responseContent.toString();
			System.out.print(status);
			System.out.print(" ");
			System.out.println(Response_Content);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			connection.disconnect();
		}

	}


}
