package Lecture08;

public class longestgoodstring {
    //public static void main(String[] args) {
        String s = "aannbhdvtfeeeeeee";
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

    static char findMaxOcc2(String s){
        int[] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index=i;
            }
        }
        return (char)('a'+index);
    }
     public static void main(String[] args) {
         String original = "aabbcccccddeeeeeeef";
         System.out.println();
    }
   
    
}
