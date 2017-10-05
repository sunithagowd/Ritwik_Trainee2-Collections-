package package2;
import java.util.*;
import java.util.ArrayList;
public class ArrayListCol {
	ArrayListCol(){
		System.out.println("cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayListCol obj1 = new ArrayListCol();
		 ArrayList<String> list=new ArrayList<String>(); //Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
	      list.add("Ravi");  
		  list.add("Ajay");  
		  list.add("Sun");
		// lastIndexOf(list);
//	    System.out.println(list.add("nitha")); 		  	
		  ArrayList<String> list1=new ArrayList<String>(); //Creating arraylist1  
		  list1.add("Sun");
		  list1.add("Sun");
		  list1.add("Sun");
		  
		  list.addAll(list1); //
		  Iterator<String> itr1= list.iterator();   //Traversing list through Iterator
		  System.out.println("1st print");  
		  while((itr1).hasNext()){ 
			
		   System.out.println(itr1.next());  
		  } 
		  list.add(5, "MOM");
		  list.add("un");
		  list.add("n");
		  list.removeAll(list1); //
		  Iterator<String> itr2= list.iterator();   //Traversing list through Iterator 
		  System.out.println("2nd print");
		  while((itr2).hasNext()){ 			 
		   System.out.println(itr2.next());  
		  }
		  list1.add("Ajay");
		  
		  list.retainAll(list1);   //Traversing list through for loop
		  System.out.println("Retain all print");
		  for(String obj:list){         
			  System.out.println(obj);
		  }
		  list.clear();
		  System.out.println("Clear");
		  for(String obj:list){         
			  System.out.println(obj);
		  }
	}



	

	}


