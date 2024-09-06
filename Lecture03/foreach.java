package Lecture03;

public class foreach {
    static void display(int[] arr){
        for(int i: arr)
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int[]arr={2,4,3,9,5};
        display(arr);
    }
}
