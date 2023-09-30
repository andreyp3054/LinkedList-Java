public class Main {
    public static void main(String[] args) {
        LinkedList LinkedListSample = new LinkedList();
        LinkedListSample.addFirst(1);
        LinkedListSample.addLast(2);
        LinkedListSample.addFirst(3);
        LinkedListSample.addLast(4);

        LinkedListSample.addInBetween(5, 2, 4);
        LinkedListSample.removeInBetween(2, 4);
        LinkedListSample.addInBetween(5, 3, 1);

        LinkedListSample.removeLast();
        LinkedListSample.removeLast();
        LinkedListSample.removeFirst();
        LinkedListSample.removeFirst();
        LinkedListSample.removeLast();

        System.out.println(LinkedListSample);
    }
}
