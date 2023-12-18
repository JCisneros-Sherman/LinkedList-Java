//Interface for the linked list
public interface BareBonesLinkedList <E> {
	//Add element to the LL at specific index
	public void add(int index, E item);
	//Remove an element from the LL at specific index
	public E remove (int index);
	public E get (int index);
	public E set (int index, E newValue);
	//Get the current size o the LL
	public  int size();
}
	
