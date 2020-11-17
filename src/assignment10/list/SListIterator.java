package assignment10.list;

public class SListIterator<T> {
	
	private Node<T> head;
	private SList<T> list;
	
	protected SListIterator(SList<T> list) {
		this.list = list;
		head = list.getHead();
		list.setHead(head);
	}
	
	public void add(T value) {
		if(head == null) {
			head = new Node<T>(value);
			
		} else {
			Node<T> node = head;
			while(node.getNextNode() != null) {
				node = node.getNextNode();
			}
			node.setNextNode(new Node<T>(value));
		}
	}
	
	public boolean remove(T value) {
		// if head is null
		if (head == null) return false;
		
		// if head is to be removed
		if(head.getValue().equals(value)) {
			head.setNextNode(head.getNextNode());
			return true;
		}
		
		// looping to remove value
		Node<T> node = head.getNextNode();
		Node<T> previousNode = head;
		while(node != null) {
			if(node.getValue().equals(value)) {
				previousNode.setNextNode(node.getNextNode());
				return true;
			}
			previousNode = node;
			node = node.getNextNode();
		}
		
		// if value is not found return false
		return false;
	}
	
	protected String traverse() {
		StringBuffer sb = new StringBuffer();
		if(head == null) return "";
		if(head != null) sb.append(head.getValue());
		Node<T> node = head.getNextNode();
		while(node != null) {
			sb.append(" -> ");
			sb.append(node.getValue());
			node = node.getNextNode();
		}
		return sb.toString();
	}

}
