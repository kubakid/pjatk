package powtorka.w16.dataStruct;

import powtorka.w16.struct.Point;

public
    class Node {

    private Point data;
    private Node next;

    public Node(Point data) {
        this.data = data;
        this.next = null;
    }

    public Point getData() {
        return data;
    }

    public void setNext(Node tmp) {
        this.next = tmp;
    }

    public Node getNext() {
        return this.next;
    }
}
