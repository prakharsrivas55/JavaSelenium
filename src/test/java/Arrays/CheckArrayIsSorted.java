public class CheckArrayIsSorted {
    public static void main(String[] args){
        int arr[]= {1,4,2,6,8,3};
        // int arr[]= {1,2,3,4,5,6};
        int n=arr.length;
        
        Boolean isSorted= true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted= false;
                break;
            }
        }
        if(isSorted==true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j]>arr[i]){
    //                 System.out.println("Array is sorted");
    //             }
    //         }
    //     }
    //     System.out.println("Array is not sorted");

    }
}
