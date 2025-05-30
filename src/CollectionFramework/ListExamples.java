package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List <String> lists = new ArrayList<String>();
		
		//add
		lists.add("Apple");
		lists.add("Banana");
		lists.add("Mango");
		lists.add("Orange");
		
		System.out.println("Adding Elements:"+lists);
		
		//get
		System.out.println("Element at index 2:"+lists.get(2));
		
		//remove
		lists.remove("Mango");
		System.out.println("After Removing Mango: "+lists);
		
		//set
		lists.set(1, "Grapes");
		System.out.println("After updating at index 1 : "+lists);
		
		//contains
		System.out.println("Conatins:"+lists.contains("Apple"));
		
		System.out.println("Contain:"+lists.contains("Mango"));
		
		//size
		System.out.println("Size of List: "+lists.size());
		
		//isEmpty
		System.out.println("Is the kist is Empty: "+lists.isEmpty());
		
		
		//indexof
		System.out.println("Index of Orange:"+lists.indexOf("Orange"));
		
		//sort
		Collections.sort(lists);
		System.out.println("After Sorting: "+lists);
		
		//clear
		lists.clear();
		System.out.println("Yes!! List is Empty!!"+lists);

	}

}
