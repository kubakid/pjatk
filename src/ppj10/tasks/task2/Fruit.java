package ppj10.tasks.task2;

public class Fruit {
    String name;
    double weight;

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void show(){
        System.out.println("name: " + name + " weight: " + weight);
    }
}
