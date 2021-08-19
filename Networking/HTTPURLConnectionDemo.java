package networking;

import java.net.*;

public class HTTPURLConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
			URL url=new URL("https://www.sastra.edu/");    
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			for(int i=1;i<=9;i++){  
				System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
			}  
			System.out.println("Response Code: "+huc.getResponseCode());
			System.out.println("Response Message: "+huc.getResponseMessage());
			//A proxy server is any machine that translates traffic between networks or protocols.
			//It's an intermediary server separating end-user clients from the destinations that they browse. Proxy servers provide varying levels of functionality, security, and privacy depending on your use case, needs, or company policy.
			System.out.println("Is the given URL using proxy?: "+huc.usingProxy());
			//Tells whether the website is using get or post method
			System.out.println("Request Method: "+huc.getRequestMethod());
			System.out.println("Socket Permission(Necessary to connect to the destination host and port): "+huc.getPermission());
			//Disconnecting the connection made with the http url mentioned
			huc.disconnect();   
			}catch(Exception e){
				System.out.println(e);
			}    
	}

}
