package practice;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.sql.*;
	import java.awt.Color;
	import javax.swing.*;

	public class Form implements ActionListener{

	    static JFrame frame   =   new JFrame("Login Form");
	    static JLabel Fname   =   new JLabel("First  Name:");
	    static JLabel Sname   =   new JLabel(" Second Name");
	    static JLabel Res     =   new JLabel(" Address");
	    static JLabel No  	  =   new JLabel(" phone number");
	    static JLabel Email	  =	  new JLabel("Email");
	    static JLabel job	  =	  new JLabel("Occupation");
	    static JButton b      =   new JButton("Submit");
	    JTextField textField,Secname,res,no,mail,jobt;
//	    JLabel result;
	    private static final String DB_URL = "jdbc:mysql://localhost/java";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD ="";
	     Form() {
	    	// F Name start
	        Fname.setBounds(50, 30, 1000, 1000);
	        textField = new JTextField();
	        textField.setBounds(200, 27, 200, 30);
	        frame.add(Fname);
	        frame.add(textField);
	        //user end
	        // pass start
	        Sname.setBounds(450,30,150,30);
	         Secname = new JTextField();
	        Secname.setBounds(650,30,200,30);
	        frame.add(Sname);
	        frame.add(Secname);	
	        //pass end
	        
	        //res start
	        Res.setBounds(50,100,150,30);
	         res=new JTextField();
	        res.setBounds(200,100,200,30);
	        frame.add(Res);
	        frame.add(res);
	        //res End
	        //no start
	        No.setBounds(50,160,150,30);
	         no=new JTextField();
	        no.setBounds(200,160,200,30);
	        frame.add(No);
	        frame.add(no);
	        //no ends
	        
	        //Email starts
	        Email.setBounds(50,220,150,30);
	        mail=new JTextField();
	        mail.setBounds(200,220,200,30);
	        frame.add(Email);
	        frame.add(mail);
	        //Mail end
	        
	        //Job Start
	        job.setBounds(50,300,150,30);
	        jobt= new JTextField();
	        jobt.setBounds(200,300,200,30);
	        frame.add(job);
	        frame.add(jobt);
	        // Job ends
	        
	        // Submit Start
	        b.setBounds(450,450,95,30);
	        b.addActionListener(this);
	        frame.add(b);
	        
//	        colors
	        frame.getContentPane().setBackground(Color.BLACK);
	        Fname.setForeground(Color.white);
	        Sname.setForeground(Color.blue);
	        Res.setForeground(Color.YELLOW);
	        no.setForeground(Color.orange);
	        Email.setForeground(Color.MAGENTA);
	        job.setForeground(Color.green);
	        // color end

	        frame.setSize(400, 150);
	        frame.setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	     public void actionPerformed(ActionEvent e) {
	    	 if(e.getSource()==b) {
	    			try {
	            		Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
	            		Statement stmt= conn.createStatement();
	            		
	            		
	            		Insert(stmt);
	            		
	            		stmt.close();
	            		
	            	}catch(SQLException a) {
	            		System.out.println(a);
	            	}
	    	 }
	     }
	     public void Insert(Statement stmt) {
	     	
	    	    
	     	String sql = "Insert into info (Fname,Sname,Res,No,Email,job) values ('"+textField.getText()+"','"+Secname.getText()+"','"+res.getText()+"','"+no.getText()+"','"+mail.getText()+"','"+jobt.getText()+"')";
	     	try {
	     		stmt.executeUpdate(sql);
	     		
	     
//	     		if (stmt.executeUpdate(sql) == 1) {
//	     			
//	     			result.setText("Employee Added  successfully");
//	     			
////	     			
//	     			
//	     			
//	     		}
	     	
	     		
	     		
	     	}catch(SQLException e) {
	     		System.out.println(e);
	     	}
	     }
	    public static void main(String[]args) {
	    new Form();
	    }

	    	
	    }

