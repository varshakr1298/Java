import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("Server GUI");  
	    final TextField tf=new TextField();  
	    tf.setBounds(50,60, 250,20);  
	    Button b=new Button("Show Message");  
	    b.setBounds(50,90,250,30);
	    f.add(b);f.add(tf);  
	    f.setSize(350,200);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    f.setBackground(Color.blue);
		try{  
			ServerSocket socket=new ServerSocket(6666);  // Port number: 6666
		
			Socket s=socket.accept();//establishes connection   
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			int message=dis.read();  
			System.out.println(); 
			 b.addActionListener(new ActionListener(){  
				    public void actionPerformed(ActionEvent e){ 
				    		if(message != -1) {
				            tf.setText("Client's Message= "+message);
				            } else {
				            	tf.setText("Nothing recieved from client!");
				            }
				        }  
				    }); 
			socket.close();
		}catch(Exception e){
			System.out.println(e);
		}
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.out.println("Pressed window closing...");
				System.exit(0);
			}
		});	 
	}

}
