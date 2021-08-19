package networking;

import java.net.*;  
import java.io.*; 

//Networking - Two way communication
//Client will first initiate chat then server and so on until either of them writes stop

public class Chat_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(3333);  
			Socket s=ss.accept();  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			  
			String messageFromClient="",messageOfServer="";  
			while(!messageFromClient.equals("stop")){  
				messageFromClient=din.readUTF();  
				System.out.println("Client says: "+messageFromClient); 
				System.out.print("\nServer Message: ");
				messageOfServer=br.readLine();  
				dout.writeUTF(messageOfServer);  
				dout.flush();  
			}  
			din.close();  
			s.close();  
			ss.close(); 
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
