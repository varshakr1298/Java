package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the URL whose details you want to fetch: ");
			URL url=new URL(br.readLine());     
			System.out.println("Protocol: "+url.getProtocol());    
			System.out.println("Host Name: "+url.getHost());    
			System.out.println("Port Number: "+url.getPort());    
			System.out.println("Default Port Number: "+url.getDefaultPort());    
			System.out.println("Query String: "+url.getQuery());    
			System.out.println("Path: "+url.getPath());    
			System.out.println("File: "+url.getFile()); 
			System.out.println("Reference or anchor of the URL: "+url.getRef());
			System.out.println("Uniform Resource Identifier: "+url.toURI());
			System.out.println("Authority of URL: "+url.getAuthority());
			  
			}catch(Exception e){
				System.out.println(e);
			}
	}

}
