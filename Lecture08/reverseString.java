package Lecture08;

public class reverseString {
    static String reverse(String s1){
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        return s2;
    }
    public static void main(String[] args){
        String original = "potato";
        String rev = reverse(original);
        System.out.println(rev);
    }
    
}