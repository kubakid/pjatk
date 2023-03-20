package gui.gui2;



import java.util.*;

public class Main {

    public static void main(String[] args) {

//        List <Square> squareList = new ArrayList<>();
//        squareList.add(new Square(5));
//        squareList.add(new Square(10));
//        squareList.add(new Square(2));
//        squareList.add(new Square(4));
//        squareList.add(new Square(200));
//
//        System.out.println(squareList);
//
//        Collections.sort(squareList);
//
//        System.out.println(squareList);

        Spiewak s1 = new Spiewak ( "Eminem" ) {
            @Override
            public String spiewaj() {
                return "kakakakakLALALALALAeaogeg";
            }
        } ;
        Spiewak s2 = new Spiewak ( "Eagles" ) {
            @Override
            public String spiewaj() {
                return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            }
        } ;
        Spiewak s3 = new Spiewak ( "Dzem" ) {
            @Override
            public String spiewaj() {
                return "lalalala";
            }
        } ;
        Spiewak[] sp = {s1 , s2 , s3 } ;
        for ( Spiewak s : sp ) System . out . println ( s ) ;
        System . out . println ( "\n" + Spiewak . najglosniej ( sp ) ) ;
    }
}
