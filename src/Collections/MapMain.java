package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map= new TreeMap<Integer,String>();
        map.put(101, "Shiva");
        map.put(102,"dharmula");
        map.put(103," Ashok");
        map.put(104, "sharath");
        map.put(105, "venky");
        
        Set<Integer> Keys=map.keySet();
        for(Integer key:Keys) {
      //  System.out.println(Keys);
        }
        Collection<String> Values=map.values();
        for(String value:Values);
     //   System.out.println(Values);
        
     //   System.out.println(map.get(101));
     //   System.out.println(map.get("Shiva"));
     //   System.out.println(map.containsValue("Shiva"));
     //   System.out.println(map.containsValue("shiva"));
        
        map.replace(102, "SS");
        System.out.println(map);
        
        for(Integer key:Keys) {
      //  System.out.println(key +" ==== "+map.get(key));
        
        }
        map.putIfAbsent(106, "AA");
        System.out.println(map);
        
        for(Map.Entry<Integer,String> entry:map.entrySet()) {
        System.out.print(entry.getKey());
        System.out.println(entry.getValue());
        }
        
        
        
	}

}
