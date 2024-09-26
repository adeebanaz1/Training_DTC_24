package Lecture08;

public class max_occ_elem_sorted {
    static char findMaxOcc1(String s){
        int countMaxElement=0;
        char maxElement= '*';
        int countCurrElement=0;
        char currElement= '*';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currElement){
                if(countCurrElement>countMaxElement){
                    countMaxElement= countCurrElement;
                    maxElement= currElement;
                }
                currElement= s.charAt(i);
                countCurrElement=1;
            }else{
                countCurrElement++;
            }
        }
        if(countCurrElement>countMaxElement){
            countMaxElement= countCurrElement;
            maxElement= currElement;
        }
        return maxElement;
    }
    public static void main(String[] args){
        
    }
    
}
