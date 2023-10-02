public class LinkedList<T> {
    private Node head;
    private Node tail;


    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(T e) {
        Node newestFirstElement = new Node(e);
        if (isEmpty()) {
            tail = newestFirstElement;
        } else {
            newestFirstElement.setNext(head);
        }
        head = newestFirstElement;
    }

    public void addLast(T e) {
        Node newestLastElement = new Node(e);
        if (isEmpty()) {
            head = newestLastElement;
        } else {
            tail.setNext(newestLastElement);
        }
        tail = newestLastElement;

    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("LinkedList is EMPTY");
        }
        head = head.getNext();
    }

    public void removeLast() {
        Node secondToTheLast = head;

        while (secondToTheLast.getNext() != tail) {
            secondToTheLast = secondToTheLast.getNext();
        }
        secondToTheLast.setNext(null);
        tail = secondToTheLast;
    }

    public void addInBetween(T newElement, T left) {
        Node leftNodeAdd = head;
        if (isEmpty() || leftNodeAdd == null) {
            throw new IllegalStateException("LinkedList is EMPTY or the previous node DOES NOT EXIST");
        }
        while (!leftNodeAdd.getElement().equals(left)) {
            leftNodeAdd = leftNodeAdd.getNext();
        }
        Node newNode = new Node(newElement);
        if (leftNodeAdd == tail) {
            leftNodeAdd.setNext(newNode);
            tail = newNode;
        } else {
            newNode.setNext(leftNodeAdd.getNext());
            leftNodeAdd.setNext(newNode);
        }
    }

    public void removeInBetween(T left, T right) {
        Node leftNodeAdd = head;
        while (!(leftNodeAdd.getElement().equals(left))) {
            leftNodeAdd = leftNodeAdd.getNext();
        }
        Node rightNodeAdd = head;
        while (!(rightNodeAdd.getElement().equals(right))) {
            rightNodeAdd = rightNodeAdd.getNext();
        }
        leftNodeAdd.setNext(rightNodeAdd);
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public String toString() {
        StringBuilder buildString = new StringBuilder();
        if (!(isEmpty())) {
            Node currentPrinter = head;
            while (currentPrinter.getNext() != null) {
                buildString.append(currentPrinter).append(" -> ");
                currentPrinter = currentPrinter.getNext();
            }
            buildString.append(currentPrinter);
        } else buildString.append("EMPTY");
        return buildString.toString();
    }

    private class Node {
        private final T element;
        private Node next;

        private Node(T e) {
            this.element = e;
            next = null;
        }

        public T getElement() {
            return this.element;
        }


        public Node getNext() {
            return this.next;
        }

        public void setNext(Node e) {
            this.next = e;
        }

        public String toString() {
            return element.toString();
        }
    }
}