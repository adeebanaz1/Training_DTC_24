package Lecture08;

public class LearnString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String();
        s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "Hello";
        String s5 = new String("Hello");
         System.out.println(s3==s5);
    }
    
}
