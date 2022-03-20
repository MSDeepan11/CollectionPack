package collectionPack;

import java.util.LinkedList;
import java.util.List;

public class LList {
	public static void main(String[] args) {
		
		List<Object> list1 = new LinkedList<Object>();
		
		list1.add(10);
		list1.add("hi");
		list1.add('v');
		list1.add(null);
		list1.add(10);
		list1.add(true);
		list1.add(50);
		
		System.out.println(list1);
		
		int size = list1.size();
		System.out.println(size);
		
		boolean contains = list1.contains(10);
		System.out.println(contains);
		
		int indexOf = list1.indexOf(true);
		System.out.println(indexOf);
		
		}

}
