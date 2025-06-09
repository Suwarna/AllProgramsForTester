package CollectionPrograms;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
	public static void main(String args[])
	{
		Hashtable<Integer,String> ht=new  Hashtable<Integer,String>();
		
		ht.put(1, "Vishv");
		ht.put(2, "Arth");
		ht.put(3, "Mahi");
		ht.put(4, "Udyan");
		//ht.put(null, "Suraj"); // Thorw exception : Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
		//ht.put(null, "null"); // Throw exception : Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
		
		for(Map.Entry h:ht.entrySet())
		{
			System.out.println(h.getKey()+"......"+h.getValue());
		}
			
		
	}

}
