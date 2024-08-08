package mycodes;

import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number");
        int n= sc.nextInt();
        int num= n;
        int rev=0;

        while(n!=0){
            rev= rev*10+ n%10;
            n=n/10;
        }
        if(num==rev){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
