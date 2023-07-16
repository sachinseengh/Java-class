package JavaforExam;

import java.util.Scanner;

public class Nameprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your percentage");
        Float percent = sc.nextFloat();
    System.out.println("Name is  "+ name +" and percent is " + percent);

    }
}
