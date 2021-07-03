package Networking;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("UDP Receiver GUI");  
	    final TextField tf=new TextField();  
	    tf.setBounds(50,60, 250,20);  
	    Button b=new Button("Show Packet");  
	    b.setBounds(50,90,250,30);
	    f.add(b);f.add(tf);  
	    f.setSize(350,200);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    f.setBackground(Color.green);
	    f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.out.println("Pressed window closing...");
				System.exit(0);
			}
		});
		try{  
			DatagramSocket ds = new DatagramSocket(3000);  
			//Byte buffer to recieve the packet
		    byte[] buf = new byte[1024];  
		    //This creates a datagram packet. This constructor is used to receive the packets.
		    DatagramPacket dp = new DatagramPacket(buf, 1024); 
		    //receive() method of DataSocket is used to receive the packet sent over connectionless socket channel
		    ds.receive(dp);  
		    String receivedPacket = new String(dp.getData(), 0, dp.getLength());
		    int received_Packet=Integer.parseInt(receivedPacket);
		    System.out.print("Received Packet: "+receivedPacket);
			 b.addActionListener(new ActionListener(){  
				    public void actionPerformed(ActionEvent e){ 
				            tf.setText("Packet Received= "+received_Packet);     
				        }  
				    }); 
			ds.close();
		}catch(Exception e){
			System.out.println(e);
		}
			 
	}

}
