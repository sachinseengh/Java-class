package JavaforExam;
class CustomExps extends Exception{
    String message;
    CustomExps(String name){
        this.message=name;
    }
    public String toString(){
        return "Error is "+message;
    }
}

public class Customexp {
    public static void main(String[] args) {
        try{
            if(5>1){
                throw new CustomExps("5 is greater");
            }
        }catch(CustomExps e){
            System.out.println(e);
        }
    }
}
