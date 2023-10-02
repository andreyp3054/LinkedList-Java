public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedListSample = new LinkedList<>();

        linkedListSample.addFirst("TIGER");
        linkedListSample.addFirst("LION");

        linkedListSample.addLast("ZEBRA");

        linkedListSample.addInBetween("BOBCAT", "LION");
        linkedListSample.removeInBetween("LION", "ZEBRA");

        linkedListSample.addLast("WOLF");
        linkedListSample.removeLast();
//        linkedListSample.addFirst(3);
        linkedListSample.removeFirst();

        System.out.println(linkedListSample);

    }
}
