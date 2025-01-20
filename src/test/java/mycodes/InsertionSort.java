package mycodes;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter any number");
        // int arr[]= new int[5];
        int arr[]= {4,1,6,2,7,8};

        for(int i=0;i<arr.length;i++){
            // arr[i]= sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        
        for(int i=1;i<arr.length;i++){
            int key= arr[i];
            int j=i-1;

            while(j>=0 && arr[j]> key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]= key;
        }

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
