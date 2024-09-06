package Lecture03;

public class reverseArray {
    static void printRev(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={2,4,3,9,5};
        printRev(arr);
    
}
}
