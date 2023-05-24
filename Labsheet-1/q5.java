

public class q5{
    public static void main(String[] args) {
        int [ ]arr={4,5,6,7,8};

    
        int great=arr[0];
        // System.out.println(great);

        for(int i=1;i<arr.length;i++){
           
            if(great>arr[i]){
               
            }else{
             great=arr[i];
            }
        }
        
    // System.out.println(arr.length);
    System.out.println(great);
    

    }
}
