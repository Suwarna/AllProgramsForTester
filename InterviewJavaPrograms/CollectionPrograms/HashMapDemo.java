package CollectionPrograms;
import java.util.*; 

public class HashMapDemo {
 
	 public static void main(String args[]){  
	   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Mango");  //Put elements in Map  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(4,"Grapes");   
	   map.put(5,"Grapes");  
	   
	  // map.put(null, null);
	   map.put(null, "Guvha");
	  //map.put(null, "Strawberry");
	       
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()) // entrySet(): is used to return a collection view of the mappings contained in this map.
	   {    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	}  
	} 
