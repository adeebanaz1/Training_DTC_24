package Lecture09;

public class input {
    public static void main(String[] args){
        //int n =1;
        int[][] arr = new int[3][4];
        for(int i = 0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]= 4*i+(j+1); or // arr[i][j] = n;
            //n++;
        }
    }
        for(int i = 0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }
}
