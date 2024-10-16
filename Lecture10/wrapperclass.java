package Lecture10;

import java.sql.Wrapper;

public class wrapperclass {
    int[] arr;
    int object;

    wrapperclass(){
        arr=new int[4];
        object = 0;
    }

    public void addElement(int element,int index){
        this.arr[index] = element;
        //if(object)
        object++;
    }
    
}
