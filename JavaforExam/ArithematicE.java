package JavaforExam;

public class ArithematicE {
    public static void main(String[] args) {
        // try{
        //     int n =100/0;
        // }catch(ArithmeticException e){
        //     System.out.println(e);
        // }finally{
        //     System.out.println("i am hero");
        // }
        try{
            if(5<55){
                throw new ArithmeticException("no way");
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        }}
