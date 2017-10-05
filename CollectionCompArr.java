package package2;
import java.util.*;  

public class CollectionCompArr {
	
	 public static void main(String args[]){  
		// CollectionCompArr c1 = new CollectionCompArr(); 
		 Company c1 = new Company(1,"Sujatha",25); //Duplicate elements
		 Company c2 = new Company(2,"Sss",21);
		 Company c3 = new Company(3,"Sujatha",2);
		 Company c4 = new Company(3,"Sujatha",2);
		 ArrayList<Company> al = new ArrayList<Company>();
		 al.add(c1);
		 al.add(c2);
		 al.add(c3);
		 System.out.println (al.size());
		 al.add(c4);
		 Iterator<Company> itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
			  Company cp =(Company)itr.next();
			  System.out.println(cp.rollno+" "+cp.name+" "+cp.age);
		  }
		    
	 }

}
