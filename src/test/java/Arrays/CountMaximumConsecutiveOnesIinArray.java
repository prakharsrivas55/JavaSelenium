
public class CountMaximumConsecutiveOnesIinArray {
    
    public static void main(String[] args) {
        int arr[]= {1,1,1,2,2,3,1,1,1,1};
        int c=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c++;
            }
            else{
                c=0;
            }
        max = Math.max(max, c);
        }
        
        System.out.print("Max Count is: "+max);
    }
    
}