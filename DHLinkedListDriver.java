//Josahandi Cisneros
//CSC 311
//Lecture Assignment 
public class DHLinkedListDriver {

	public static void main(String[] args) {
		// Create a LL object;
	
		DHSingleLinkedList<Integer> list = new DHSingleLinkedList<>();
		System.out.println(list);
		list.add(0, 10); System.out.println(list);
		list.add(0, 20); System.out.println(list);
		list.add(0, 30); System.out.println(list);
		list.add(1, 99); System.out.println(list);
		list.add(2, 55); System.out.println(list);
		list.remove(0);	 System.out.println(list);
		list.remove(1);	 System.out.println(list);
		list.get(2);	
		list.set(1, 66); System.out.println(list);
	}

}
