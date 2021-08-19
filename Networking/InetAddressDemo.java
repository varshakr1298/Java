package networking;

import java.net.InetAddress;

//Java InetAddress class represents an IP address. 
//The java.net.InetAddress class provides methods to get the IP of any host name for example www.javatpoint.com, www.google.com, www.facebook.com, etc.

//An IP address is represented by 32-bit or 128-bit unsigned number. 
//An instance of InetAddress represents the IP address with its corresponding host name.
//There are two types of address types: Unicast and Multicast. 
//The Unicast is an identifier for a single interface whereas Multicast is an identifier for a set of interfaces.

public class InetAddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//ip instance contains Local host ip and name
			InetAddress ip=InetAddress.getByName("www.sastra.edu"); 
			//getHostName() returns host name of ip address
			System.out.println("Host Name: "+ip.getHostName());  
			//getHostAddress() Returns ip address in string format 
			System.out.println("IP Address: "+ip.getHostAddress());  
			System.out.println("Local Host: "+ip.getLocalHost());
		}catch(Exception e){
			System.out.println(e);
		}  
	}

}
