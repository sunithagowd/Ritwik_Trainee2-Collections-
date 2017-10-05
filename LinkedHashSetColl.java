package package2;
import java.util.*; 
public class LinkedHashSetColl {
	public static void main(String[] args) {  
	    LinkedHashSet<LinkedHashSetBook> hs=new LinkedHashSet<LinkedHashSetBook>();  
	    //Creating Books  
	    LinkedHashSetBook b1=new LinkedHashSetBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    LinkedHashSetBook b2=new LinkedHashSetBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    LinkedHashSetBook b3=new LinkedHashSetBook(103,"Operating System","Galvin","Wiley",6); 
	    LinkedHashSetBook b4=new LinkedHashSetBook(0,null,"alv","il",2);
	    //Adding Books to hash table  
	    hs.add(b1);  
	    hs.add(b2);  
	    hs.add(b3);
	    hs.add(b4);
	    //Traversing hash table  
	    for(LinkedHashSetBook b:hs){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
}
	
	 
	 
