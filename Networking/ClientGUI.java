
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientGUI extends Frame implements ActionListener{
	TextField txtnumber;
	Button btnsend;
	public ClientGUI() throws Exception{
		setLayout(null);
		txtnumber=new TextField(20);
		txtnumber.setBounds(50,60,250,20);
		btnsend=new Button("Send");
		btnsend.setBounds(50,90,250,20);
		add(txtnumber);
		add(btnsend);
		btnsend.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.out.println("Pressed window closing...");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClientGUI appWindow=new ClientGUI();
		appWindow.setSize(350,200);
		appWindow.setTitle("Client GUI");
		appWindow.setVisible(true);
		appWindow.setBackground(Color.pink);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btnsend) {
			try{   
				//Creating the client
				Socket s=new Socket("localhost",6666);  
				DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
				int number=Integer.parseInt(txtnumber.getText());
				boolean flag = false;
				if(number==1) {
					flag=true;
				}
			    for (int i = 2; i <= number / 2; ++i) {
			      // condition for nonprime number
			      if (number % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			    	dout.write(number);
			    else
			    	txtnumber.setText("Cannot Send data!");
				dout.flush();  
				dout.close();    
				}catch(Exception e){
					System.out.println(e);
				} 
		}
	}

}
