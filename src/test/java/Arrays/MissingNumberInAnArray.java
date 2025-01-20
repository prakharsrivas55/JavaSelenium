import java.util.Scanner;

public class MissingNumberInAnArray {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int sum= 0;
        
        int n=5;
        int arr[]= new int[n-1];
        int result;

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int totalsum= n * (n + 1) / 2;
        for(int m=0;m<arr.length;m++){
            sum=sum+arr[m];
        }

        result= totalsum-sum;
        System.out.print("Missing number is: "+ result);

        }
    }
    

