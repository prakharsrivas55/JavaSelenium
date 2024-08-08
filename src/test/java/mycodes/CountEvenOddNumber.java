package mycodes;

import java.util.Scanner;

public class CountEvenOddNumber {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int odd=0;
        int even=0;

        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                even++;
            }
            else{
                odd++;
            }
            n=n/10;
        }
        System.out.println("Total odd number are: "+ odd);
        System.out.println("Total even number are: "+ even);
       


    }
}
