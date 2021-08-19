package networking;
import java.io.*;  
import java.net.*; 

//Networking - One Way Communication

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{   
			//Creating client using instance of Socket class
			//For a client in socket programming we need two information one is ip address of server and second is port number
			// We need to pass the IP address or hostname of the Server and a port number. 
			//Here, we are using "localhost" because our server is running on same system.
			Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
			byte buf[]=new byte[200];
			BufferedInputStream bis=new BufferedInputStream(new DataInputStream(System.in));
			System.out.print("Enter your message for the server: ");
			bis.read(buf);
			dout.writeUTF(new String(buf));  
			dout.flush();  
			dout.close();    
			}catch(Exception e){
				System.out.println(e);
			}  
		} 
	}
