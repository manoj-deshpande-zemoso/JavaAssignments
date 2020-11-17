package assignment10.list;

public class SList<T> {

	private Node<T> head;
	private SListIterator<T> sListIterator;
	
	public SListIterator<T> iterator() {
		sListIterator = new SListIterator<T>(this);
		return sListIterator;
	}
	
	protected Node<T> getHead(){
		return this.head;
	}
	
	protected void setHead(Node<T> node) {
		this.head = node;
	}
	
	public String toString() {
		String returnString = sListIterator.traverse();
		return returnString;
	}
}

class Node<T> {
	private Node<T> nextNode;
	private T value;
	public Node(T value){
		this.value = value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return this.value;
	}
	public void setNextNode(Node<T> node) {
		this.nextNode = node;
	}
	public Node<T> getNextNode(){
		return this.nextNode;
	}
}
