package ppj.powtorka.IO.phone;

public class Mobile extends Telephone{
    private Node current;
    private static final int maxMemory = 3;

    private static int getMaxMemory(){
        return maxMemory-1;
    }

    public Mobile(String color) {
        super(color);
        current = new Node();
        Node temp = current;
        for (int i = 0; i < getMaxMemory(); i++) {
            Node neoNode = new Node(temp);
            temp.setNext(neoNode);
            temp = neoNode;
        }
        current.setPrev(temp);
        temp.setNext(current);
    }

    @Override
    public void call(String number) {
        super.call(number);
        current.setNumber(number);
        current = current.getNext();
    }

    @Override
    public void displayConnectionHistory() {
        Node temp = current.getPrev();
       while (temp.getNumber() != null && temp!=current){
           System.out.println(temp.getNumber());
           temp = temp.getPrev();
       }
       if(temp.getNumber() != null)
           System.out.println(temp.getNumber());
    }
}
