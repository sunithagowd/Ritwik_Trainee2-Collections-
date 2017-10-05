package package2;
import java.util.*;  

public class HashSetColl {
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add(null);
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add(null); 
		 
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  	System.out.println(set.isEmpty());

}
}
