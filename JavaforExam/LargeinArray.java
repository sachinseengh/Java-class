package JavaforExam;

public class LargeinArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int large=arr[0];
for(int i=1;i<arr.length;i++){
    if(large>arr[i]){
        large= large;
    }else{
        large=arr[i];
    }
}
System.out.println("large is "+large);
    }
}
