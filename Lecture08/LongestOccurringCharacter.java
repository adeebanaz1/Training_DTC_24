package Lecture08;

import java.util.Scanner;

public class LongestOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        findLongestOccurringCharacter(inputString);

        scanner.close();
    }

    public static void findLongestOccurringCharacter(String str) {
        
        if (str.isEmpty()) {
            System.out.println("The input string is empty.");
            return;
        }

        char longestChar = str.charAt(0); 
        int longestCount = 1;            
        int currentCount = 1;             

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
               
                currentCount++;
            } else {
                
                if (currentCount > longestCount) {
                    longestCount = currentCount;
                    longestChar = str.charAt(i - 1);
                }
                
                currentCount = 1;
            }
        }
       
        if (currentCount > longestCount) {
            longestCount = currentCount;
            longestChar = str.charAt(str.length() - 1);
        }       
        System.out.println("The longest occurring character is '" + longestChar + "' with a count of " + longestCount + ".");
    }
}

    

