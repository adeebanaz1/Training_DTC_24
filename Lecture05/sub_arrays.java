package Lecture05;

public class sub_arrays {
    static void generateSubArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++)
                System.out.print(arr[k]+" ");    
            }
            System.out.println();
        }
    }

    static int findMaxSum(int[] arr) {
        int maxSum = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int tempSum = 0;
                for(int k=i;k<=j;k++){
                    tempSum+= arr[k];
                }
                maxSum = Math.max(maxSum, tempSum);
                System.out.println();  
            }
           
        }
        return maxSum;
    }
        public static void main(String[] args){
            int[] arr = {1,2,-2,4};
            System.out.println(findMaxSum(arr));
        
    }
}
    

