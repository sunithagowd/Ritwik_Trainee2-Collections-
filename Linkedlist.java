package package2;
import java.util.*;

public class Linkedlist {
	public static void main(String args[]){  
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  System.out.println("Adding");
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }
	  
	  al.addFirst("Sunitha");
	  al.addLast("Hi");
	 System.out.println( "I am last"+" "+al.getLast());
	 System.out.println( "I am first"+" "+al.getFirst());
	 System.out.println("first and last method calling");
	 Iterator<String> itr1=al.iterator();  
	  while(itr1.hasNext()){  
	   System.out.println(itr1.next());  
	  }
	  System.out.println(al.size());
	}
}
