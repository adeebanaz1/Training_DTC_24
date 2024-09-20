package Lecture06;

public class Reversearray {
    // static void printRev(int[] arr){
    //         for(int i=arr.length-1;i>=0;i--){
    //             System.out.print(arr[i]+" ");
    //         }
    //         System.out.println();
    //     }
    //     public static void main(String[] args) {
    //         int[]arr={2,4,3,8,5};
    //         printRev(arr);
    //     }
    

    public void reverse(int[] arr, int i , int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public void rotate(int[] nums, int k){
        reverse(nums,2,4);
        for(int i:nums)
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int[]arr={2,4,3,8,5};
       
                 
}
}

    

