public class Duplicateinarray {
    public static void main(String[] args) {
        int []arr={1,3,2,4,5,3};
        int i;
        int j;
        int count;

        for(i=0;i<6;i++){
            count=0;
            for(j=i+1;j<6;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=1){
                System.out.println("The Duplicate number is "+ arr[i]);
                break;
            }
        }
    }
}
