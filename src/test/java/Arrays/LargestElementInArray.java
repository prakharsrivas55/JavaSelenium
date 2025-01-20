public class LargestElementInArray {
    public static void main(String[] args){
        int arr[]= {1,4,2,6,8,3};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        
        }
        System.out.println("Largest Element in array: "+ max);
        
    }
}
