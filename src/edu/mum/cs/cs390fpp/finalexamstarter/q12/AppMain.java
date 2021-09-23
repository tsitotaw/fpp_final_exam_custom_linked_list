package edu.mum.cs.cs390fpp.finalexamstarter.q12;

public class AppMain {

	public static void main(String[] args) {
		IntegerSLList list = new IntegerSLList();
//		System.out.println("Removed from empty list: " + list.removeFirst()); // prints: "null"   
//		System.out.println("Max of empty list: " + list.findMax());
		
		list.addLast(1);
		System.out.println(list.removeFirst());
		list.addLast(2);	
		list.addLast(3);
		list.addLast(4);
		
		System.out.println("Max: " + list.findMax()); // prints: 4
		
		list.printAll(); //prints: [1=>2=>3=>4]
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		
		list.printAll(); //prints [3=>4]
		
		System.out.println(list.removeFirst());
		
		list.printAll(); //prints [4]
		System.out.println(list.removeFirst());
		list.printAll(); //prints []
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		list.printAll();
		list.addLast(-11);
		System.out.println("Max: " + list.findMax()); // prints: -11
		list.addLast(1999);
		list.addLast(18);
		System.out.println("Max: " + list.findMax()); // prints: 1999
		list.addLast(1798);
		list.printAll(); //prints [-11=>1999=>18=>1798]
		System.out.println("Max: " + list.findMax()); // prints: 1999
		
	}
}
