package Lecture04;

public class lower_bound {
    static int lowerbound(int[] arr,int num){
        int low=0,high = arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
        if(arr[mid]==num){
            ans=mid;
            high=mid-1;
        }else if(arr[mid]>num){
            high = mid-1;
        }else{
            low=mid+1;
        }     
    }
    return ans;
}
public static void main(String[] args){
    int[] arr={1,1,1,3,3,3,4,4};
    System.out.println(lowerbound(arr, 3));
}
}