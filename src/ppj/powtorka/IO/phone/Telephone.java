package ppj.powtorka.IO.phone;

public class Telephone {
    private String color;

    public Telephone(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void call(String number){
        System.out.println(number);
    }

    public void displayConnectionHistory(){
        System.out.println("no history");
    }
}
