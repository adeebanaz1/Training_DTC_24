package Lecture13;
import java.util.HashMap;
import java.util.Map;


public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,String> hp = new HashMap<Integer,String>();
        hp.put(1,"abc");
        hp.put(2,"def");
        hp.put(3,"ghi");
        hp.put(4,"jkl");
        hp.put(5,"mno");
        hp.put(6,"pqr");
        hp.put(7,"stu");
        hp.put(8,"vwx");
        hp.put(9,"yz");

        //Access a value
        System.out.println(hp.get(7));

        //Remove
        System.out.println(hp.remove(8));

        //View the hashmap
        System.out.println(hp);

        //Iterating over a hashmap
        for(Map.Entry m:hp.entrySet()){
            System.out.println(m.getKey() +" " +m.getValue());
        }

        
    }
    
}
