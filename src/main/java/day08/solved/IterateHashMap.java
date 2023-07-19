/**
 * 
 */
package day08.solved;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Vinit Gore
 *
 **/
public class IterateHashMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Chennai", 2);
        map.put("Bangalore", 1);
        map.put("Mumbai", 2);
        map.put("Hyderabad", 1);
        
        // Method 1: Foreach
        Set<String> keySet = map.keySet();
        for (String key: keySet) {
            System.out.println(key + " = " + map.get(key));
        }
        
        // Method 2: Iterator
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " = " + map.get(key));
        }
        
        // Method 3: Lambda expression
        map.forEach((key,value) -> System.out.println(key + " = " + value));
    }
}