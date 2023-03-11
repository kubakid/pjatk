package gui.gui1;

public class Hero {

    private String name;
    private int age;

    public Hero(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Hero hero){
        System.out.println("Hi " + hero.name+"!");
    }

}
