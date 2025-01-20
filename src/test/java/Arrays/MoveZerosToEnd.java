public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]= {1,2,3,0,0,0,1,2,3,1,2};
        int temp;
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp; 
            i++;
            }
            }
            for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
            }
        }
    }
    
