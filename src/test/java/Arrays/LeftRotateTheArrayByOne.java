public class LeftRotateTheArrayByOne {
    public static void main(String[] args){
        int arr[]= {1,4,2,6,8,3};
        int n=6;
        int b[]= new int[n];

        for(int i=1;i<arr.length;i++){
           b[i-1]=arr[i];   
        }
        b[n-1]=arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
          }
        
    }
}
