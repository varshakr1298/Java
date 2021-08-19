package networking;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.*;
	
//Java DatagramSocket class represents a connection-less socket for sending and receiving datagram packets.

//DatagramSocket() throws SocketEeption: it creates a datagram socket and binds it with the available Port Number on the localhost machine.
//DatagramSocket(int port) throws SocketEeption: it creates a datagram socket and binds it with the given Port Number.
//DatagramSocket(int port, InetAddress address) throws SocketEeption: it creates a datagram socket and binds it with the specified port number and host address.

//Java DatagramPacket is a message that can be sent or received. 
//If you send multiple packet, it may arrive in any order. Additionally, packet delivery is not guaranteed.

public class DatagramPacketSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//This creates a datagram socket and binds it with the available Port Number on the localhost machine.
			DatagramSocket ds = new DatagramSocket(); 
			System.out.print("Enter the packet information you want to send: ");
			byte buf[]=new byte[1024];
			BufferedInputStream bis=new BufferedInputStream(new DataInputStream(System.in));
			bis.read(buf);
			String packetInfo=new String(buf);
		    InetAddress ip = InetAddress.getByName("127.0.0.1");  
		    //This creates a datagram packet. This constructor is used to send the packets.
		    //Parameter 1: byte information of packet
		    //Parameter 2: length of packet information
		    //Parameter 3: IP adrress
		    //Parameter 4: Port Number
		    DatagramPacket dp = new DatagramPacket(packetInfo.getBytes(), packetInfo.length(), ip, 3000);
		    //send() method of DataSocket class is used to send the packet over the connection less socket
		    ds.send(dp);  
		    ds.close(); 
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
