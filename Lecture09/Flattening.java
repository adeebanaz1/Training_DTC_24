package Lecture09;
import java.util.*;

public class Flattening {
    static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void flaten(int[][] arr){
        int rows= arr.length;
        int cols= arr[0].length;
        int[] nums= new int[rows * cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                nums[cols*i + j]= arr[i][j];
        }
        Arrays.sort(nums);

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                arr[i][j]=nums[cols*i+j];
        }        
    }
    public static void main(String[] args) {
        int[][] arr = {
            {8,12,2},
            {3,6,4},
            {11,1,9},
            {10,7,5}
        };
        flaten(arr);
        display(arr);     
    }  
}

