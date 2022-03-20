package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		List<Object> AList = new ArrayList<>();
		
		AList.add("Def");
		AList.add("Abc");
		AList.add("jkl");
		AList.add("Ghi");
		AList.add(123);
		AList.add(789);
		AList.add(456);
		
		System.out.println(AList);
		
		for (Object AList2 : AList) {
			System.out.println(AList2);
		}
		
		boolean contains = AList.contains("jkl");
		System.out.println(contains);
		
		int size = AList.size();
		System.out.println(size);
	}

}
