package powtorka.codereadL;

public class Main {


    public static void main(String[] args) {

        Machine m = new Car(4);
        Car c = new Car("Seicento",100,6);
        System.out.println(c);
        System.out.println(m);
        ExperimentalDevice ex = new ExperimentalDevice(7);
        System.out.println(ex.getName());
        Car sc = new RaceCar(4);
        sc.setNumberOfTires(4);
        System.out.println(sc);
        RaceCar rc = new RaceCar("McQueen",260,6);
        rc.toString();
        System.out.println(rc.toString());
        c.setPower(5);
        rc.setPower(260);


        /*
        m = Unknow machine , power 10, tires 3
        c = Seicento , 100, tires 3
        ex = levelOfSecert 7 , reszta brak
        sc = number of tires 4


         */

    }
        /*
        I am the Machine: Seicento with 100 power!
        I am the Machine: Unknown Machine with 10 power!
        ?
        I am the Machine: Unknown Machine with 10 power! zle
        I am the Machine: McQueen Machine with 260 power! zle
        You can't set less power than before!
        260

         */
}
