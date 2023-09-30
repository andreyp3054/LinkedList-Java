public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(Object e) {
        Node<Object> newestFirstElement = new Node<>(e);
        if (isEmpty()) {
            tail = newestFirstElement;
            head = newestFirstElement;
            tail.setNext(null);
        } else {
            newestFirstElement.setNext(head);
            head = newestFirstElement;
        }
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addLast(Object e) {
        Node<Object> newestLastElement = new Node<>(e);
        tail.setNext(newestLastElement);
        tail = newestLastElement;
        tail.setNext(null);
    }

    public void removeFirst() {
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
    }

    public void removeLast() {
        if (!isEmpty() && size() > 1) {
            Node SecondToTheLastNode = head;
            while (SecondToTheLastNode != null && SecondToTheLastNode.getNext() != tail) {
                SecondToTheLastNode = SecondToTheLastNode.getNext();
            }
            tail = SecondToTheLastNode;
            SecondToTheLastNode.setNext(null);
        } else if (head == tail) {
            head = null;
            tail = null;
        }
    }

    public void addInBetween(Object newElement, Object left, Object right) {
        Node LeftNodeAdd = nodeFinder(left);
        Node RightNodeAdd = nodeFinder(right);
        Node newNode = new Node(newElement);

        LeftNodeAdd.setNext(newNode);
        newNode.setNext(RightNodeAdd);
    }

    public void removeInBetween(Object leftNode, Object rightNode) {
        Node LeftNodeRemove = nodeFinder(leftNode);
        Node RightNodeRemove = nodeFinder(rightNode);

        LeftNodeRemove.setNext(RightNodeRemove);
    }

    private Node nodeFinder(Object e) {
        Node currentNode = head;
        while (!(currentNode.getElement().equals(e))) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public int size() {
        int counter = 0;
        Node nodeIterator = head;
        while (nodeIterator != null) {
            counter++;
            nodeIterator = nodeIterator.getNext();
        }
        return counter;
    }

    public String toString() {
        StringBuilder buildString = new StringBuilder();
        if (!(isEmpty())) {
            Node currentPrinter = head;
            while (currentPrinter.getNext() != null) {
                buildString.append(currentPrinter).append("-> ");
                currentPrinter = currentPrinter.getNext();
            }
            buildString.append(currentPrinter);
        } else buildString.append("EMPTY");
        return buildString.toString();
    }
}
