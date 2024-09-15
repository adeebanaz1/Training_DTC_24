package Lecture05;

public class nser {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }

    static int[] createNSER(int[] arr){
        int[] NSER = new int[arr.length];
        int minElement= Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            NSER[i] = minElement;
            if(arr[i]<minElement){
                minElement = arr[i];
            }
        }
        return NSER;
    }
    public static void main(String[] args) {
        int[] arr = {6,1,3,9,1,4,9,2,7,8,5};
        int[] NSER = createNSER(arr);
        display(NSER);
    }
}
