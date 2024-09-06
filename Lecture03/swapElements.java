package Lecture03;

public class swapElements {
    static void elementswap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        }

        static void reverseusingSwap(int[] arr){
            int i=0, j=arr.length-1;
            while(i<j)
               elementswap(arr,i++,j--);
               
        }
        
    
        public static void main(String[] args){
            int[] nums={8,2,1,3,4,5};
            int i=1, j=4;
            elementswap(nums,i,j);
        }
    }
    

