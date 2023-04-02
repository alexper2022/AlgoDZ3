package dz3;

public class LinkedList {

    Node head;
    Node tail;

    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.getItem()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }

    public String reverseList() {
        Node current = head;
        Node head = null;
        Node last = null;
        while (current != null) {
            Node previouse = current.getPreviouse();
            Node next = current.getNext();
            if (previouse == null)
                last = current;
            if (next == null)
                head = current;
            current.setNext(previouse);
            current.setPreviouse(next);
            current = current.getPreviouse();
        }
        this.head = head;
        tail = last;
        return this.toString();
    }
}
