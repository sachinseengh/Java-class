

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registration{
//	static final String DB_URL="jdbc:mysqli://localhost/Employee";
//	static final String USER="root";
//	static final String PASS="";
	
	JFrame jf;
	JButton submit;
	JTextField user;
	JTextField pass;
	JLabel ul,up,info;
	
	Registration(){
		jf= new JFrame("User Registration");
		
		
		info= new JLabel("User Registration");
		info.setBounds(100,5,100,50);
		jf.add(info);
		
		ul = new JLabel("Enter Username");
		ul.setBounds(100,55,100,50);
		jf.add(ul);
					
		user= new JTextField();
		user.setBounds(100,105,100,30);
		jf.add(user);
		
		

		up = new JLabel("Enter Password");
		up.setBounds(100,135,100,50);
		jf.add(up);
		
		pass = new JTextField();
		pass.setBounds(100,185,100,30);
		jf.add(pass);
		
		
		
		
		submit= new JButton("Submit");
		submit.setBounds(100,215,100,40);
		jf.add(submit);
		
	
		
		
		
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setLayout(null);
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new Registration();
		
	}
}