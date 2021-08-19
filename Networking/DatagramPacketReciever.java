package networking;

import java.net.*;  

public class DatagramPacketReciever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			//This creates a datagram socket and binds it with the given Port Number.
			DatagramSocket ds = new DatagramSocket(3000);  
			//Byte buffer to recieve the packet
		    byte[] buf = new byte[1024];  
		    //This creates a datagram packet. This constructor is used to receive the packets.
		    DatagramPacket dp = new DatagramPacket(buf, 1024); 
		    //receive() method of DataSocket is used to receive the packet sent over connectionless socket channel
		    ds.receive(dp);  
		    String receivedPacket = new String(dp.getData(), 0, dp.getLength());  
		    System.out.println(receivedPacket);  
		    ds.close(); 
		  }catch(Exception e) {
			  System.out.print(e);
		  }
	}

}
