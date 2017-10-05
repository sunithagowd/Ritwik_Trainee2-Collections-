package package2;
import java.util.*;  

public class TreeSetCollection {
	
	
	
	public static void main(String args[]){  
		  //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>(); 
		  al.add("10");
		  al.add("-10");
		//  al.add(null);
		  al.add("1000055");
		// al.add(null);
		  for(String obj:al){
			  System.out.println(obj);
		  }
		  ListIterator<String> itr=(ListIterator<String>) al.iterator();  
		  while(itr.hasPrevious()){  
			  System.out.println(itr.previous());  
			  }  
		/*  TreeSet<String> set = al;
		Iterator<String> itr=set.iterator();  
		  while(((set) itr).hasPrevious()){  
		   System.out.println(((set) itr).previous());  
		  }  */
}

	
}
