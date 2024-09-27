package Lecture09;

import java.util.*;

public class Col_wise_sort {
    
        static void display(int[][] arr){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        static void col_sort(int[][] arr){
            for(int i=0;i<arr.length;i++)
        Arrays.sort(arr,(a,b)->Integer.compare(a[3],b[3]));
    }
     public static void main(String[] args){
        int[][] arr = {
            {1,4,7,2},
            {5,9,4,6},
            {9,15,63,0}
        };
        col_sort(arr);
        display(arr);    
    }
}

