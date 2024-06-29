package mycodes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapCode {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        // HashMap m= new HashMap();

        HashMap <Integer,String> m= new HashMap<Integer,String>();

        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "Prakhar");
        m.put(104, "Scott");
        m.put(105, "Raj");
        m.put(102, "Charles"); // Will replace David with Charles
        

        System.out.println(m); //{101=John, 102=Charles, 103=Prakhar, 104=Scott, 105=Raj}

        System.out.println(m.get(103)); // Prakhar

        m.remove(105); // remove pair from hashmap
        System.out.println(m);

        System.out.println(m.containsKey(101)); // true
        System.out.println(m.containsKey(105)); // false

        System.out.println(m.containsValue("John")); // true
        System.out.println(m.containsValue("Abhinav")); // false

        System.out.println(m.isEmpty()); //false

        System.out.println(m.keySet()); // returns only keys as Set

        System.out.println(m.values()); // returns only values as Collections

        System.out.println(m.entrySet()); // returns all entries as Set [101=John, 102=Charles, 103=Prakhar, 104=Scott]

        for(Object i:m.keySet()){
            System.out.println(i); //returns keys one after another
        }

        for(Object i:m.values()){
            System.out.println(i); //returns values one after another
        }
        
        for(Object i:m.keySet()){
            System.out.println(i+"     "+ m.get(i)); //Will recieve all the key and value pair one after another
        }

        // Entry Methods
        //****************
        for(Map.Entry entry:m.entrySet()){
            System.out.println(entry.getKey()+"     "+ entry.getValue());
        }

        // Iterator Methods
        //****************
        Set s=m.entrySet();
        Iterator itr= s.iterator();

        while(itr.hasNext()){
            Map.Entry entry=(Entry) itr.next(); // 101 X entry
            System.out.println(entry.getKey()+"     "+ entry.getValue());
        }
        
    }
    
}
