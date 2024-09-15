package Lecture05;

public class presum {
    static int Presum(int[] arr, int n){
        int[] Presum = new int[n+1];
        for(int i=1;i<n+1;i++){
            Presum[i] = arr[i-1] + Presum[i-1];
        }
        return Presum;
}
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(Presum(arr));
    }
}
