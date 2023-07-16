
    interface Printable{  
        void print();  
        }  
    interface Showable{  
        void show();  
        }  
    public class _7multipleinheritence  implements Printable,Showable{  
        public void print(){System.out.println("Hello");}  
        public void show(){System.out.println("Welcome");}  
          
        public static void main(String args[]){  
        _7multipleinheritence obj = new _7multipleinheritence();  
        obj.print();  
        obj.show();  
         }  
        } 
        
 
