import java.util.Scanner;

public class arrycopyinreverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int arr[]= new int[10];

        System.out.println("Enter your elements of your array");
        for(int i=0;i<10;i++ ){
            arr[i]=sc.nextInt();
        }

        int arr2[]=new int[10];


        for(int j=9;j>=0;j--){
            arr2[9-j]=arr[j];
        }

        
        System.out.println("Elements of new array are:");
        for(int k=0;k<10;k++){
            System.out.println(arr2[k]);
        }

    }
}
