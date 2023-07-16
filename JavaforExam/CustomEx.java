package JavaforExam;

class Exp extends Exception{

String message;
Exp(String name){
  this.message = name;
}

    public String toString(){
        return "you are wrong"+message;
    }
}
public class CustomEx {
    public static void main(String[] args) {
        try{
            if(14<18){
                throw new Exp("sachin");
            }
        }catch(Exp e){
            System.out.println(e);
        }
    }
}
