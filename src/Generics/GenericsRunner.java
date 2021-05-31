package Generics;

public class GenericsRunner {

	public static void main(String[] args) {
		Mylist<String> list = new Mylist();
		
		list.addelement("Element 1");
		list.addelement("Element 2");
		System.out.println(list);
		Mylist<Integer> list2 = new Mylist();
		
		list2.addelement(Integer.valueOf(7));
		list2.addelement(Integer.valueOf(3));
		System.out.println(list2);
		

	}

}
