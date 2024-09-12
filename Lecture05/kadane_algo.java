package Lecture05;

public class kadane_algo {
    static int kadane(int[] arr){
    int maxSum=0;
    int sum=0;

    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum>maxSum){
            maxSum=sum;
        }
        if(sum<0){
            sum=0;
        }

    }
    return maxSum;
    }
    public static void main(String[]args){
        int[] arr={1,2,-2,-2,4};
        System.out.println(kadane(arr));
    }
}
