package mycodes;

import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= sc.nextInt();
        int arr[]= new int[5];
        int count=0;

        System.out.println("Enter " + arr.length + " numbers for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found= false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                found=true;
                count++;               
            }
        }
        if(found){
            System.out.print(n+ " is present "+count+ " times");
        }
            else{
                System.out.print("Number is not present");
            }
        }
        
    }
