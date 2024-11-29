package Lecture14;

public class nth_Fibonacci {

    public static int fibo(int n){

        if(n==0 || n==1){
            return n;
        }

        int chhotaAns1 = (n-1);
        int chhotaAns2 = (n-2);

        int meraAns = chhotaAns1 + chhotaAns2;
        return meraAns;
    }
        public static void main(String[] args) {
            System.out.println(fibo(5));
            
        }
}
    
    

