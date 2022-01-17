package Day_13_collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		ll.add(new Integer(10));
		ll.add("hi");
		ll.addFirst("hell0");
		ll.add(0,20);
		ll.add(2,30);
		//System.out.println(ll);
		Iterator i1=ll.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
		}
	}

}
