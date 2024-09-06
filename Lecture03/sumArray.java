package Lecture03;

public class sumArray {
    static int arraySum(int[] arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={8,2,1,3,8,5};
        int sum=arraySum(arr);
        System.out.println("Sum of array is:"+sum);
    }    
}
