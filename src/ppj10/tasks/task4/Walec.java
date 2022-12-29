package ppj10.tasks.task4;

public class Walec {
    private int promien;
    private int wysokosc;

    public Walec(int promien, int wysokosc){
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show(){
        System.out.println("pole powierzchni podstawy: "+ Math.pow(promien, 2) +", objetosc: "+ Math.pow(promien,2)*wysokosc);
    }
}
