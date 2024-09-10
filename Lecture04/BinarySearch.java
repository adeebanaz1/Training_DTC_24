package Lecture04;
import java.util.Arrays;

public class BinarySearch {
    static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
    static boolean bSearch(int[] arr, int n){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==n) return true;
            else if(arr[mid]<n){
            low=mid+1;
        }else
        high=mid-1;
    }
    return false;
}
    public static void main(String[] args){
        int[] arr={2,3,1,6,7,9,8,5,4};
        Arrays.sort(arr);
        display(arr);
        System.out.println(bSearch(arr, 3));
    }
    
}
