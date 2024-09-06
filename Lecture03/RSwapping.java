package Lecture03;

public class RSwapping {
    static void swapElements(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }

        static void reverseusingSwap(int[] arr){
            int i=0, j=arr.length-1;
            while(i<j)
               swapElements(arr,i++,j--);
               for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
        }
        public static void main(String[] args){
            int[] nums={8,2,1,3,4,5};
            reverseusingSwap(nums);
    
}
}
