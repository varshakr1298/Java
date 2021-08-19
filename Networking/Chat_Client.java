package networking;

import java.net.*;  
import java.io.*;

//Networking - Two way communication
//Client will first initiate chat then server and so on until either of them writes stop

public class Chat_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Socket s=new Socket("localhost",3333);  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String messageOfClient="",messageFromServer="";  
		while(!messageOfClient.equals("stop")){ 
			System.out.print("\nClient Message: ");
			messageOfClient=br.readLine();  
			dout.writeUTF(messageOfClient);  
			dout.flush();  
			messageFromServer=din.readUTF();  
			System.out.println("Server says: "+messageFromServer);  
		}  
		  
		dout.close();  
		s.close(); 
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
