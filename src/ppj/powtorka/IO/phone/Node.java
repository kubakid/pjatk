package ppj.powtorka.IO.phone;

public class Node {
    private String number;
    private Node next;
    private Node prev;

    public Node() {
    }

    public Node(String number) {
        this.number = number;
    }

    public Node(String number, Node next, Node prev) {
        this.number = number;
        this.next = next;
        this.prev = prev;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Node(Node prev) {
        this.next = next;
        this.prev = prev;
    }

    public Node(Node prev, Node next) {
        this.next = next;
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
