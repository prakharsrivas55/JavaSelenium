package mycodes;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int x= sc.nextInt();
        int arr[]= new int[5];
        int low=0;
        int high= arr.length-1;
        int result=-1;

        System.out.println("Enter " + arr.length + " numbers for the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

        while (low <= high) {
            
            int mid=(low+high)/2;

            if(arr[mid]==x){
                result=mid;
                break;                
            }
            if(x>arr[mid]){
                low=mid+1;
            }
            if(x<arr[mid]){
                high=mid-1;
            }
                
        }
        if(result==-1){
            System.out.print("Number is not present");
        }
        else{
            System.out.print(x+" Number is present");
            }
        }

    }
    

