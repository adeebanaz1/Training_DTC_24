package Lecture10;

public class Factorial {
    static int fact(int n){
        if (n==1) return 1;
        int temp = n*fact(n-1);
        return temp;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println();
    }
    
}
