package networking;

import java.net.*;
import java.io.*;

//The Java URLConnection class represents a communication link between the URL and the application. 
//This class can be used to read and write data to the specified resource referred by the URL.

//The URLConnection class provides many methods, we can display all the data of a webpage by using the getInputStream() method.
//The getInputStream() method returns all the data of the specified URL in the stream that can be read and displayed. 

public class URLConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			URL url=new URL("https://www.sastra.edu/");  
			URLConnection urlconnection=url.openConnection();  
			InputStream stream=urlconnection.getInputStream();  
			byte buf[]=new byte[stream.available()];
			stream.read(buf);
			System.out.print(new String(buf)); 
			}catch(Exception e){System.out.println(e);}  
	}

}
