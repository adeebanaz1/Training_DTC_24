package Lecture05;

public class nsel {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }

    static int[] createNSEL(int[] arr){
        int[] NSEL = new int[arr.length];
        int minElement= Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            NSEL[i] = minElement;
            if(arr[i]<minElement){
                minElement = arr[i];
            }
        }
        return NSEL;
    }
    public static void main(String[] args) {
        int[] arr = {6,1,3,9,1,4,9,2,7,8,5};
        int[] NSEL = createNSEL(arr);
        display(NSEL);
    }
}
