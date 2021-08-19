package networking;

import java.io.*;  
import java.net.*;  

//Networking - One Way Communication

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//Creating a server using the instance of ServerSocket class 
			ServerSocket socket=new ServerSocket(6666);  // Port number: 6666
			//The accept() method waits for the client. If clients connects with the given port number, it returns an instance of Socket.
			Socket s=socket.accept();//establishes connection  
			//getInputStream() function of Socket class returns the input stream attached to this socket
			//DataInputStream dis instance stores the input stream 
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			//readUTF() method of DataInputStream is used to read the data in Input stream as bytes then we convert it to string using explicit casting
			String  message=(String)dis.readUTF();  
			System.out.println("Message recieved from the client is = "+message);    
			socket.close();
		}catch(Exception e){
			System.out.println(e);
		}  
	}

}
