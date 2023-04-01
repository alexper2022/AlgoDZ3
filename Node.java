package dz3;

public class Node {

    private Node previouse;

    private Node next;

    private int item;

    public Node(int item) {
        this.item = item;
    }

    public void append(Node node) {
        if (this.next == null) {
            this.next = node;
            node.previouse = this;
        } else {
            this.next.append(node);
        }
    }

    public Node getPreviouse() {
        return previouse;
    }

    public void setPreviouse(Node previouse) {
        this.previouse = previouse;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getItem() {
        return item;
    }

}
