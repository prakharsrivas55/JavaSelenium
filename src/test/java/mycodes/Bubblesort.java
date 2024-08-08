package mycodes;

import java.util.Scanner;

public class Bubblesort {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many number you want in array");

        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the array number: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
    
}
