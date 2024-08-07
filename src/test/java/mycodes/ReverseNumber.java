package mycodes;

import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();

        int rev=0;
        while(n!=0){
            rev=rev*10+ n%10; //0*10+ 1234%10= 4      4*10+123%10= 43
            n=n/10;
        }

        System.out.println("Reverse number is: "+ rev);

        System.out.print("Enter a number:");
        int num= sc.nextInt();
        // *** StringBuffer class ***//
        StringBuffer reverse;
        StringBuffer sb= new StringBuffer(String.valueOf(num));
        reverse= sb.reverse();

        System.out.println("Reverse number using StringBuffer is: "+ reverse);

        // *** StringBuilder class ***//
    
        System.out.print("Enter a number:");
        int number= sc.nextInt();
        StringBuilder r= new StringBuilder();
        r.append(number);
        r.reverse();

        System.out.println("Reverse number using StringBuilder is: "+ r);

        
    }
    
}
