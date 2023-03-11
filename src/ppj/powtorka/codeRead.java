package ppj.powtorka;

import java.util.Arrays;

public class codeRead {
    public static int[] tab (){
        int [] tab = new int [15];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        int [] finalTab = new int [tab[10]/10];

        for (int i = 0; i < finalTab.length; i++) {
            finalTab[i] = tab[tab.length-1-i];
        }

        return finalTab;
    }

    public static void swicher (String sight){
        switch (sight){
            case "AA":
                System.out.println(sight += "B");

            case "A" :
                System.out.println(sight += "A");
                break;

            case "B":
                System.out.println(sight += "A");

            default: swicher(sight);
        }
    }

    public static int bittersweet () {

        int a = 011;
        return a>>(3&1)<<2;


    }

    public static class A{
        int wrt;
        public A(){
            System.out.println("KA");
        }

        public void show(){
            System.out.println("I'm A");
        }
    }

    public static class B extends A{
        public B(){
            System.out.println("KB");
        }

        public void show(){
            System.out.println("I'm B");
        }
    }

    public static class C extends B{
        public C(){
            super();
            System.out.println("KC");
        }

        public void show(){
            System.out.println("I'm C");
        }

        public void sShow(){
            super.show();
        }
    }

    public static class Node {
        private int value;
        private Node next;
        private int idNumber;
        private static int NUMBER = 0;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
            this.idNumber = NUMBER++;
        }

        public Node(int value) {
            this(value,null);
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static class List {
        private Node head;

        public void addSorted(int value){
            if(head == null){
                head = new Node(value);
                return;
            }else if(head.getValue() > value){
                head = new Node(value, head);
                return;
            }
            Node prev = head;
            Node current = head.getNext();
            while (current != null){
                if(current.getValue() > value){
                    prev.setNext(new Node(value, current));
                    return;
                }
                prev = current;
                current = current.getNext();
            }

            prev.setNext(new Node(value));
        }

        public void show(){
            Node current = head;
            System.out.print("[ ");
            while (current != null){
                System.out.print(current.getValue() + " ");
                current = current.getNext();
            }
            System.out.println("]");
        }

        public void showID(){
            Node current = head;
            System.out.print("[ ");
            while (current != null){
                System.out.print(current.getIdNumber() + " ");
                current = current.getNext();
            }
            System.out.println("]");
        }

        public void showNUMBER(){
            Node current = head;
            System.out.print("[ ");
            while (current != null){
                System.out.print(current.NUMBER + " ");
                current = current.getNext();
            }
            System.out.println("]");
        }
    }



    public static void main(String[] args) {
        System.out.println("\tA");
        System.out.println(Arrays.toString(tab()));

        System.out.println("\tB");

        int matrix[][] = {
                {1,2,3,1,2,3},
                {4,5,6,0},
                {7,8,9}
        };

        for (int i = 0; i < matrix[2].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\tC");
        swicher("A");

        System.out.println("\tD");
        System.out.println(bittersweet());

        System.out.println("\tE");
        System.out.println(bittersweet());

        System.out.println("\tF");
        //A[] objTab = {new A(), new B(), new C()};
        A[] objTab = new A[4];
        System.out.println("////");
        objTab[0] = new A();
        System.out.println("////");
        objTab[1] = new B();
        System.out.println("////");
        objTab[2] = new C();

        System.out.println("\tG");
        for (int i = 0; i < objTab.length-1; i++) {
            objTab[i].show();
        }

        System.out.println("\tH");
        ((C)objTab[2]).sShow();

//        System.out.println("\tI");
//        try{
//            objTab[10].show();
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("IBE");
//        }catch (NullPointerException e){
//            System.out.println("NPE");
//        }catch (Exception e){
//            System.out.println("EER");
//        }
//
//
//        try{
//            objTab[3].show();
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("IBE");
//        }catch (NullPointerException e){
//            System.out.println("NPE");
//        }catch (Exception e){
//            System.out.println("EER");
//        }
//
//        try{
//            objTab[1].show();
//        }catch (Exception e){
//            System.out.println("EER");
//        }
//
//        System.out.println("\tJ");
//        List list = new List();
//        list.addSorted(4);
//        list.addSorted(1);
//        list.addSorted(6);
//        list.addSorted(3);
//        list.show();
//        list.showID();
//        list.showNUMBER();

    }
}
