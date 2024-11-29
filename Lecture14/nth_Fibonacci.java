package Lecture14;

import java.util.HashMap;

public class nth_Fibonacci {

    public static int fibo(int n, HashMap<Integer,Integer> brain){

        if(n==0 || n==1){
            return n;
        }

        if(brain.containsKey(n)){
            return brain.get(n);
        }
        System.out.println("N is" + n);
        int chhotaAns1 = fibo(n -1, brain);
        int chhotaAns2 = fibo(n-2, brain);

        int meraAns = chhotaAns1 + chhotaAns2;
        brain.put(n , meraAns);
        return meraAns;
    }

        public static void main(String[] args) {
            HashMap<Integer , Integer> brain = new HashMap<>();
            System.out.println(fibo(10,brain));
            
        }
}
    
    

