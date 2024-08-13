package mycodes;

import java.util.HashSet;
// import java.util.Scanner;
import java.util.Set;

// Given a string S, find the length of the longest substring without repeating characters.
// Input: S = "geeksforgeeks"
// Output: 7
// Explanation: Longest substring is "eksforg".

public class LargestSubstringWithoutRepeating {

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter the String: ");
        // String str= sc.nextLine();
        String str= "geeksforgeeks";
        // int c=0;
        Set<Character> set= new HashSet<>();
        int i=0;
        int max_length=0;

        for(i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(set.contains(str.charAt(j))){
                    set.remove(str.charAt(i));
                    break;
                }
                set.add(str.charAt(j))  ;
                System.out.print(set);

                max_length=Math.max(max_length, j-i+1);

            }

        }
        System.out.print("Max length: "+max_length);
}
    
}
