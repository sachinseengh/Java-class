package testdb;
import java.sql.*;


public class insertinto {
	static final String DB_URL = "jdbc:mysql://localhost/college_bern";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "select *from java";
    

    public static void Insert(Statement stmt) {
    	String s= "Ashish2";
    	String sql = "Insert into java (first_name,last_name,User_name,password) values ('"+s+"','singh','sac','ing')";
    	try {
//    		stmt.executeUpdate(sql);
    		if(stmt.executeUpdate(sql)== 1) {
    			System.out.println("Data inserted successfully");
    		}
    		
    		
    	}catch(SQLException e) {
    		System.out.println(e);
    	}
    }
   	public static void Read(Statement stmt) {
   		try {
   			ResultSet rs= stmt.executeQuery(QUERY);
 			rs.absolute(2);
   		
   			
   		
   			
   			
   			
   			
 			System.out.println("Firstname :"+rs.getString("first_name"));
   			
   			while(rs.next()){
   				
   				
   				
   				System.out.println("Firstname :"+rs.getString("first_name"));
   				System.out.println("Lastname : "+rs.getString("last_name"));
   				System.out.println("username : "+rs.getString("User_name"));
   				System.out.println("password : "+rs.getString("password"));
 
   			}
   			rs.close();
   			
   		}catch(SQLException e) {
   			System.out.println(e);
   		}
   	}
        public static void main(String[] args)throws SQLException {
        	try {
        		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);

        		Statement stmt = conn.createStatement(0,0,0);
        		
        		
        		Insert(stmt);
       		Read(stmt);
       		stmt.close();
        		stmt.close();
        	}catch(SQLException e) {
        		System.out.println(e);
        	}
        }
    
    
	
}

