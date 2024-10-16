package Lecture10;

import java.util.ArrayList;
import java.util.Collections;

public class DMA {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //System.out.println(arr.size());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        //arr.remove(2);
        arr.set(2,500);
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);


        
    }

    
}
