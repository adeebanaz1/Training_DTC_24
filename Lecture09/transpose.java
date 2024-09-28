package Lecture09;

public class transpose {
    static void Transpose(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums[0].length;j++){
                int temp= nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]= temp;
            }
        }
        
    }
}

//

   