package gui.gui2;



import java.util.*;

public class Main {

    public static void main(String[] args) {

        List <Square> squareList = new ArrayList<>();
        squareList.add(new Square(5));
        squareList.add(new Square(10));
        squareList.add(new Square(2));
        squareList.add(new Square(4));
        squareList.add(new Square(200));

        System.out.println(squareList);

        Collections.sort(squareList);

        System.out.println(squareList);
    }
}
