package mycodes;

import java.util.Scanner;

public class ReverseStringCheck {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String na= sc.nextLine();
        String str=na;
        String rev="";

        for(int i=na.length()-1;i>=0;i--){
            rev= rev+ na.charAt(i);
        }

        if(rev.equals(str)){
            System.out.println(rev+" is Palandrome String");
        }
        else{
            System.out.println(rev+" is not a Palindrome String");
        }

    }
    
}
