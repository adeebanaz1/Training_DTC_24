package Lecture05;

public class maxSum2loops {
    public static int maxSumArray(int[] arr,int n){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];

                max = Math.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,5,8};
        int n = arr.length;
        System.out.println(maxSumArray(arr,n));
    }    
}
