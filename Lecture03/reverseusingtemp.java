package Lecture03;

public class reverseusingtemp {
    static void reverseArray(int[] arr){
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[arr.length-1-i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        System.out.println("Reversed array...");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
        public static void main(String[] args) {
            int[] arr = {8,2,1,3,8,5};
            reverseArray(arr);
            System.out.println();
        }

    }
    

