package Lecture05;

public class ngel {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }

    static int[] createNGEL(int[] arr){
        int[] NGEL=new int[arr.length];
        int maxElement = -1;
        for(int i=0;i<=arr.length-1;i++){
            NGEL[i]=maxElement;
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        return NGEL;
    }
    public static void main(String[] args) {
        int[] arr={6,2,4,8,7,9,1,4,5,3};
        int[] NGEL= createNGEL(arr);
        display(NGEL);
    }
    
}


    

