package Lecture03;

public class displayArray {
    //Function to display Array
    static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={2,4,3,9,5};
        display(arr);
    }    
}
