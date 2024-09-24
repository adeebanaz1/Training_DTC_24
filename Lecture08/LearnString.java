package Lecture08;

public class LearnString {
    public static void main(String[] args) {
    //     Part 1
    //     String s1 = "Hello";
    //     String s2 = new String();
    //     s2 = "Hello";
    //     String s3 = new String("Hello");
    //     String s4 = "Hello";
    //     String s5 = new String("Hello");
    //      System.out.println(s3==s5);

    // Part 2
    // String s1 = "Hello";
    // String s2 = "Hello";
    // s2+="2";
    // System.out.println(s1+" "+s2);

    // Part 3
    String s1 = new String("He");
    String s2 = new String ("hello");
    for(int i=0;i<s2.length();i++)
        //System.out.println(s1.compareTo(s2));
    System.out.println(s1.substring(i));
    
    }
}    
