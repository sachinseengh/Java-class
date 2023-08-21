//5.	Write a program to demonstrate compareTo() method.

public class Q5_CompareTo {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Singh";
        
        int Result = s1.compareTo(s2);

        if(Result == 0){
            System.out.println("Both String are equal");
        }else if(Result <0){
            System.out.println("First String is lesser than Second");
        }else{
            System.out.println("First string is greater");
        }

    }
}
