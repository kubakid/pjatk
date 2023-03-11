package ppj.ppj10.tasks.task3;

public class Kwadrat {
    private int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }

    public void show(){
        System.out.println("Pole powierzchni: "+ Math.pow(bok,2)+ ", objętość: "+ Math.pow(bok,3));
    }

}
