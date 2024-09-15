package Lecture05;

public class nger {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }

    static int[] createNGER(int[] arr){
        int[] NGER=new int[arr.length];
        int maxElement = -1;
        for(int i=arr.length-1;i>=0;i--){
            NGER[i]=maxElement;
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        return NGER;
    }
    public static void main(String[] args) {
        int[] arr={6,2,4,8,7,9,1,4,5,3};
        int[] NGER= createNGER(arr);
        display(NGER);
    }
    
}
