package Lecture08;

public class palindrome {
    
    static boolean checkPal(String s){
        String s1 = "pop";
        int i=0, j= s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }  
    public static void main(String[] args) {
        Sy
    }
    
}  

