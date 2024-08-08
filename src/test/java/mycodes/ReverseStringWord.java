package mycodes;

import java.util.Scanner;

public class ReverseStringWord {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String na= sc.nextLine();
        String str="";
        String a[]= na.split(" ");

        for(int i=a.length-1;i>=0;i--){

            str= str+ a[i]+ " ";
        }
        System.out.println(str);


    }
    
}
