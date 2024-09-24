package Lecture08;

public class longestgoodstring {
    static int maxlenLongestGoodString(String s1){
        int count=0, ans=0;
        for(int i =0;i<s1.length()-1;i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' || s1.charAt(i) == 'A'
            || s1.charAt(i) == 'E'|| s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U'){
                count +=1;
            }else{
                if(count>ans){
                    ans = count;
                }
                count = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aabbbcccdeeEVeeeff";
        int answer = maxlenLongestGoodString(s);
        System.out.println(answer);
    }
    
}
