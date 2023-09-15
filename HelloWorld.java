


import java.util.*;


public class HelloWorld{

     public static void main(String []args){
        ArrayList<String> al=new ArrayList<String>();  
        
        al.add("Viru");          al.add("Saurav");  
        al.add("Mukesh");    al.add("Tahir");  
  
	  System.out.println(al);
	
	Collections.sort(al);  System.out.println(al);
	Collections.sort(al,Collections.reverseOrder()); 
    // Collections.reverseOrder(); 
	System.out.println(al);
     }
}




