package mycodes;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int sum=0;

        while(n>0){
            sum= sum + n%10; 
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
