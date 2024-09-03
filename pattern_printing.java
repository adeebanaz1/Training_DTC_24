public class pattern_printing{
    public static void main(String[] args) {
        int n = 5;
        // for (int i=0;i<n;i++)
        // System.out.println("*");
        // System.out.print("*");
        //for (int i=0;i<=n;i++){
        //     for (int j=0;j<n;j++)
        //     System.out.print("*");
        // System.out.println();
        // for (int j=0;j<=i;j++)
        //     System.out.print("*");
        // System.out.println();
        //
        //for(int i=1;i<=n;i++)
        //    for (int k=1;k<=n-i;k++){
        //    System.out.print(" ");
        //    }
        //    for (int j=1;j<=i;j++){
        //    System.out.print("*");
        //    }
        //    System.out.println();
        // Inverted Right Facing
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Inverted left facing triangle
        // for(int i=n;i>=1;i--){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--){
        //     for(int k=n;k>=n-i;k--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
        // question 6
        // for(int i=n;i>=1;i--){
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // question 7
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==n || j==1 || j==n)
        //         System.out.print("*");
            
        //        else {
        //         System.out.print(" ");
        //     }
        // }
        // System.out.println();

        // }
        
        // Question 8
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                if(i==j || i+j==n+1)
                System.out.print("*");

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }

