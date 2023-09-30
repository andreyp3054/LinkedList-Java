public class Node<T> {
    private Object element;
    private Node next;

    public Node(Object e) {
        this.element = e;
        next = null;
    }

    public Object getElement() {
        return this.element;
    }

    public void setElement(Object e) {
        this.element = e;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node e) {
        this.next = e;
    }

    public String toString() {
        return element + " ";
    }
}
