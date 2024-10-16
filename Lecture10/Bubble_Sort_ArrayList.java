package Lecture10;

import java.util.ArrayList;
import java.util.Collections;

public class Bubble_Sort_ArrayList {
    public static void bubblesort(ArrayList<Integer> arrList){
        for(int turn = 1; turn < arrList.size(); turn++){
            for(int i = 0; i < arrList.size() - turn; i++){
                if(arrList.get(i) > arrList.get(i + 1)){
                    Collections.swap(arrList, i, i + 1);
                }
            }
        }
    }

    static void display(ArrayList<Integer> arrList){
        for(int num : arrList) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(4);
        arrList.add(5);
        arrList.add(7);
        arrList.add(3);
        arrList.add(1);
        arrList.add(9);
        arrList.add(6);

        bubblesort(arrList);
        display(arrList);
        
    }
}
    

