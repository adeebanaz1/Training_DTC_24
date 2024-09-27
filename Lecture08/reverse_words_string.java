package Lecture08;

public class reverse_words_string {
    static void reverseWords(String s){
        String[] arr= s.split("\\s");
        System.out.print("!");
        String temp="";
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i]+" ";
        }
        temp=temp.trim();
        System.out.print(temp);
        System.out.print("!");
    }
    public static void main(String[] args) {
        String original= "The bird is flying ";
        reverseWords(original);
    }
}
    
