package ppj10.tasks;

import ppj10.tasks.task1.Person;
import ppj10.tasks.task2.Fruit;
import ppj10.tasks.task3.Kwadrat;

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

    }
}
