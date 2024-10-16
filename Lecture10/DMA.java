package Lecture10;

import java.util.ArrayList;
//import java.util.Collections;

public class DMA {
    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>();
        //System.out.println(arr.size());
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // arr.add(40);
        //arr.remove(2);
        // arr.set(2,500);
        // System.out.println(arr);

        // Collections.sort(arr);
        // System.out.println(arr);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(3);

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(1);
        a1.add(1);

        arr.add(a1);
        ArrayList<Integer> a2= new ArrayList<>();
        a2.add(2);
        a2.add(2);
        a2.add(2);
        arr.add(a2);

        System.out.println(arr);
    }
}
