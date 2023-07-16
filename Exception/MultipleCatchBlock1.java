public class MultipleCatchBlock1{
    public static void main(String[] args) {
        

        try{
            // int a[] = new int[5];
            // a[5] = 30/0;
            int a = 5/0;
            System.out.println(a);

        }
        catch(ArithmeticException e){
            System.out.println("Arithemetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exceiption occcurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception occurs" );
    }
    System.out.println("Rest of the code");
    }
}