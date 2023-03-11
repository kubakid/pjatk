package ppj.ppj12.tasks;

import ppj.ppj11.tasks.FruitTree;
import ppj.ppj11.tasks.Tree;

public class Main {

    public static void main(String[] args) {

//        try {
//            SmokeDetector.check(false);
//            SmokeDetector.checkC(true);
//            SmokeDetector.check(true);
//            try {
//                SmokeDetector.checkB(false);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            SmokeDetector.checkC(false);
//        } catch (Alarm e) {
//            System.out.println(e.getMessage());
//        } catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }
//

        Rocket rocket = new Rocket();
        rocket.refuel();
//        rocket.refuel();
//        rocket.refuel();
        try {
            rocket.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Tree[] forest = new Tree[6];
        forest[0] = new Tree(false,5, "Sosna");
        forest[1] = new Tree(true, 10, "Modrzew");
        forest[2] = new Tree(true, 15, "Dąb");
        forest[3] = new Tree(true, 120, "Osik");
        forest[4] = new FruitTree(true, 100, "Morelowiec", 5, "Morela");
        forest[5] = new FruitTree(true, 150, "Śliwa", 5,"Sliwka");

        for (Tree i : forest){
            System.out.println(i.toString());
        }

        try {
            forest[5].zerwijOwoc();
        } catch (DrzewoBezOwocoweException e) {
            System.out.println(e.getMessage());
        }

    }
}
