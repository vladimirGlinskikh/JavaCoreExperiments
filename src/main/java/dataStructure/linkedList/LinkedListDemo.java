package dataStructure.linkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addLast("B");
        linkedList.addLast("C");
        linkedList.addLast("D");
        linkedList.addLast("E");
        System.out.println("LinkedList: " + linkedList);

        linkedList.addFirst("A");
        System.out.println("LinkedList: " + linkedList);

        System.out.println("Index of element with value E: " + linkedList.get("E"));
        System.out.println("Index of element with value F: " + linkedList.get("F"));

        linkedList.remove("C");
        System.out.println("LinkedList: " + linkedList);
    }
}
