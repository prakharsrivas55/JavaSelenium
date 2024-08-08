package mycodes;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){
        Scanner  sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        char[] ch= sc.nextLine().toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }

        System.out.println("Enter a string:");
        String c= sc.nextLine();
        // String reverse;
        StringBuffer sb= new StringBuffer(c);
        System.out.println(sb.reverse()); 

    }
    
}
