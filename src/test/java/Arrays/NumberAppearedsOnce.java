public class NumberAppearedsOnce {
    public static void main(String[] args) {
        int arr[]= {2,1,2,3,3,4};
        int c;  
        Boolean foundUnique= false;
        for(int i=0;i<arr.length;i++){
           int num= arr[i];
           c=0;   

        for(int j=0;j<arr.length;j++){
            if(arr[j]==num){
                c++;
            }
         }

         if(c==1){
            System.out.print("Number that appeareds Once is: "+num);
            foundUnique = true;
         } 
    }
    if (!foundUnique) {
        System.out.println("No number appears exactly once.");
    }
}
}
