package JavaforExam;

interface Sachin{
    public void name(String name);
}

class Singh implements Sachin{
    public void name(String name){
        System.out.println(name);
    }

}


public class Interfaces {
    public static void main(String[] args) {
        Singh ss = new Singh();
        ss.name("sachin");
    }
}
