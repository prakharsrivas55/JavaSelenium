public class SecondLargestElementInArray {
    public static void main(String[] args){
        int arr[]= {2,8,9,2,10,4,10};
        int min=arr[0];
        int n=arr.length;
        int max= arr[n-1];
        int smin= arr[1];
        int smax= arr[n-2];


        for(int i=1;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!= max){
                smax=arr[i];
            }
            if(arr[i]<smin && arr[i]!= min){
                smin=arr[i];
            }
        }

        System.out.println("Second Smallest Element in array: "+ smin);
        System.out.println("Second Largest Element in array: "+ smax);
        

        
    }
}
