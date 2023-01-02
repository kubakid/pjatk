package ppj10.tasks;

import ppj10.tasks.task1.Person;
import ppj10.tasks.task2.Fruit;
import ppj10.tasks.task3.Kwadrat;
import ppj10.tasks.task4.Walec;
import ppj10.tasks.task5.KulaW;
import ppj10.tasks.task6.KulaNa;
import ppj10.tasks.task7.Balloon;
import ppj10.tasks.task7.Donkey;

public class Main {
    public static void main(String[] args) {
        //zad 1
        Person person = new Person();
        person.birthyear = 2003;
        person.name = "Jakub";
        person.surname = "Kidoń";
        System.out.println(person.name + " " + person.surname + " "+ person.birthyear);


        //zad 2
        Fruit apple = new Fruit("Apple", 0.25);
        apple.show();

        // https://www.typingclub.com/sportal/program-98/22184.play


        //zad 3
        Kwadrat kwadrat = new Kwadrat(2);
        kwadrat.show();


        //zad 4
        Walec walec = new Walec(5,10);
        walec.show();

        //zad 5

        KulaW kulaW = new KulaW(5, 10);
        kulaW.show();


        //zad 6

        KulaNa kulaNa = new KulaNa(10);
        kulaNa.show();

        //zad 7

        Balloon balloon = new Balloon();
        //System.out.println(balloon.getLoad());
        int counter = 0;
        Donkey donkey = new Donkey(4);
        while (!donkey.isFlying()){
            counter++;
            donkey.addBallon();
        }
        if (donkey.isFlying())
            System.out.println("Ja latam!!!!!");

        System.out.println(counter);






    }
}
