package assignment18;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String []args){
		
		ArrayList<String>acadgildBatch=new ArrayList();
		acadgildBatch.add("Uma");
		acadgildBatch.add("Bhavani");
		acadgildBatch.add("vishwas");
		acadgildBatch.add("Nitish");
		acadgildBatch.add("Vamshi");
		
		     System.out.println( acadgildBatch);
		
		String[] acadgildBatch1=acadgildBatch.toArray(new  String [acadgildBatch.size ()]);
		System.out.println("after converting the Array list to array");
		
		for (String names : acadgildBatch1){
			System.out.println( names);
			
		}
		
		int size =acadgildBatch.size();
		System.out.println("size of the ArrayList="+size);
	
	

	if ( acadgildBatch.contains("Uma")){
		
		System.out.println("the element is found");
	}
	else{
		
		System.out.println("the element is not found");		
		
	}
	System.out.println("the element before replacing  a value "+acadgildBatch);
	
	acadgildBatch.set(2, "Shanti");
	System.out.println("the element after replacing  a value "+acadgildBatch);	
	
	
	
	}
}