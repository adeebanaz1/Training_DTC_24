package Lecture10;

public class implentation {
    public static void main(String[] args) {
        // wrapperclass obj = new wrapperclass();
        // System.out.println(obj.arr.length);
        
        // int n = Integer.MAX_VALUE;
        // Integer m = 10;
        // System.out.println(n+" "+m);

        //String Interning
        // String s1 = "Laptop";
        // String s2 = "Laptop";
        // s2 = "pen";

        //Autoboxing and Unboxing

        // int n = 10;
        // Integer m = n; //Autoboxing
        // int o = m; // Unboxing
        // System.out.println(m);

        Integer a1 = 83;
        Integer a2 = 66;
        Integer a3 = 66;
        Integer a4 = 258;
        Integer a5 = 258;
        Integer a6 = -128;
        Integer a7 = -128;
        System.out.println(a4.equals(a5));
    }
    
}
