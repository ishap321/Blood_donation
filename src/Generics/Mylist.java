package Generics;

import java.util.ArrayList;

public class Mylist<T> {

	ArrayList<T> list = new ArrayList<>(); 
	
	public void addelement(T element) {
		list.add(element);	
	}
	public String toString() {
		return list.toString();
		
	}
	

}
