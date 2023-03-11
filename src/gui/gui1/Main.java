package gui.gui1;

public class Main {
    public static void main (String args[]){
        Hero h1 = new Hero ("Jan", 50);
        Leader l1 = new Leader("Eagle", 20);
        Hero h3 =(Hero)l1;

        h1.sayHelloTo(h3);
        h3.sayHelloTo(h1);


        Squad s = new Squad("DELTA");


        s.setLeader(l1);

        try {
            s.addHero(h1);
            s.addHero(h3);}

        catch (TooManyHeroesExceptio e) {
            e.printStackTrace();
        }

        System.out.println(s);

    }
}


//        Hi Eagle!
//        Hi Jan!
//        DELTA, leader: Eagle, heroes: Jan
//        GUI_1.TooManyHeroesExceptio: Too many heroes!!!
//        at GUI_1.Squad.addHero(Squad.java:21)
//        at GUI_1.Main.main(Main.java:18)
//
//        MS MB