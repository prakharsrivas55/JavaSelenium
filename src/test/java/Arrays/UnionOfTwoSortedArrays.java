import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        
        int a[]= {4,5,1,9,2,6,10};
        int b[]= {1,5,5,4,2,6,10,8};
        Set<Integer> set= new HashSet<Integer>();

        for(int i=0;i<a.length;i++){
            
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
         }    
         for(int i=0;i<b.length;i++){
            
            if(!set.contains(b[i])){
                set.add(b[i]);
            }
         }

        int[] result = set.stream().mapToInt(Integer::intValue).toArray();

         for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"  ");
         }

    }
    
}
