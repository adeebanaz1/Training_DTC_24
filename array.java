public class array {
    public static void main(String[] args) {
        // int a=10;
        // int[] arr = new int[5];
        // arr[0]=5;
        // arr[1]=10;
        // arr[2]=15;
        
        // boolean[] nums= new boolean[10];
        // char[] s = new char[3];
        // s[0] = 'a';
        // s[1] = 'b';
        // //System.out.println(arr);
        // //dispaly
        // for (int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }

        // int n=10;
        // int[] arr = new int[10];
        // for (int i=0;i<10;i++){
        //     arr[i]=(i+1)*5;
        // }

        // int m=50;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] == m)
        //     System.out.println(i);
        // }

        //OR

        int n=5;
        int[] table = new int[10];
        for(int i=0;i<table.length;i++){
            table[i] = n*(i+1);
        }

        int m=25;
        for(int i=0;i<table.length;i++){
            if(table[i] == m)
            System.out.println(i);
        }
    }    
}
