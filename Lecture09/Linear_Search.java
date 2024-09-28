package Lecture09;

public class Linear_Search {
    public static int[] linearSearch(int[][] arr,int element){
        int[] ans = new int[2];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==element){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;

         }
    }
}
return ans;
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,4,7,2},
            {5,9,4,6},
            {9,15,63,0}

        };
    }
    int nums[] = linearSearch(arr,15);
    System.out.println(nums[1]);
}

