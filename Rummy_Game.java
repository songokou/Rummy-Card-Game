/**
 * the actual game to run
 */

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Rummy_Game 
{
	private Server server;
	private Client client;
	
	public Rummy_Game(){
		server = new Server();
		client = new Client();
	}
	public static void main(String args[]){
		Object[] options ={ "Yes ", "No" };  
		int m = JOptionPane.showOptionDialog(null, "Have you created a server already?", "Server?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);	
		if(m == 0)
		{
			Object[] option ={ "Yes ", "No" };  
			int n = JOptionPane.showOptionDialog(null, "Do you want to create another server?", "Server?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);	
			if(n == 0)	
				openServer();
			else
				openClient();
		}		
		else{			
				openServer();				
		}
		
	}
	
	public static void openServer(){
		Server server = new Server();
        JPanel pop_message = new JPanel();
    	  JTextField port = new JTextField(6);
    	  JTextField username = new JTextField(10);
    	  
          pop_message.add(Box.createVerticalStrut(30)); 
    	  pop_message.add(new JLabel("Port:"));
    	  pop_message.add(port);
    	  pop_message.add(new JLabel("Username: "));
    	  pop_message.add(username);
    	  int result = JOptionPane.showConfirmDialog(null, pop_message, 
    	               "Please Enter: ", JOptionPane.OK_CANCEL_OPTION);
    	      if (result == JOptionPane.OK_OPTION) {
    		      int portN = Integer.parseInt(port.getText());
    		      String name = "Server Mode: "+username.getText();
    		      server.setUsername(name);
    		      server.listenSocket(portN);
    	      }
    	      else
    	    	  JOptionPane.showMessageDialog(null, "Input invalid!!");
	}
	
	public static void openClient(){
			Client client = new Client ();
		  JPanel pop_message = new JPanel();
		  JTextField ip = new JTextField("127.0.0.1");
		  JTextField port = new JTextField("2222");
		  JTextField username = new JTextField("d");
		  
		  pop_message.add(new JLabel("IP:"));
		  pop_message.add(ip);
         pop_message.add(Box.createVerticalStrut(30)); 
		  pop_message.add(new JLabel("Port:"));
		  pop_message.add(port);
		  pop_message.add(new JLabel("Username: "));
		  pop_message.add(username);
		  int result = JOptionPane.showConfirmDialog(null, pop_message, 
		               "Please Enter: ", JOptionPane.OK_CANCEL_OPTION);
		      if (result == JOptionPane.OK_OPTION) {
			      String address = ip.getText();
			      int portN = Integer.parseInt(port.getText());
			      String name = "Client Mode: "+username.getText();
			      client.listenSocket(address, portN, name);
		      }
		      else
		    	  JOptionPane.showMessageDialog(null, "Input invalid!!");
		
	}
}
