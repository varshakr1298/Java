package Networking;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
	static boolean isArmstrong(int number) {
		int temp=number,temp1=number;
		int digits=0,sum=0;
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
		while(temp1!=0) {
			int r=temp1%10;
			sum +=  (Math.pow(r, digits));  
			temp1 = temp1/10;   
		}
		if(number==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("UDP Sender GUI");  
	    final TextField tf=new TextField();  
	    tf.setBounds(50,60, 250,20);  
	    Button b=new Button("Send Packet");  
	    b.setBounds(50,90,250,30);
	    f.add(b);f.add(tf);  
	    f.setSize(350,200);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    f.setBackground(Color.yellow); 
			 b.addActionListener(new ActionListener(){  
				    public void actionPerformed(ActionEvent ae){ 
				    	try {
				    	//This creates a datagram socket and binds it with the available Port Number on the localhost machine.
						DatagramSocket ds = new DatagramSocket(); 
						String packetInfo=tf.getText();
					    InetAddress ip = InetAddress.getByName("127.0.0.1");  
					    int number = Integer.parseInt(packetInfo);
					    DatagramPacket dp = new DatagramPacket(packetInfo.getBytes(), packetInfo.length(), ip, 3000);
					    if(isArmstrong(number)) {
						    ds.send(dp); 
					    } else {
					    	tf.setText("Cannot send Packet!");
					    }
					    ds.close(); 
				    		
				        } 
				    catch(Exception e) {
				    	System.out.print(e);
				    }
				    }
				    }); 
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.out.println("Pressed window closing...");
				System.exit(0);
			}
		});	 
	}

}
