package ppj.ppj10.tasks.task6;

public class KulaNa {

    private double promienK;

    public KulaNa(int bok){
        promienK = bok / 2.0;
    }

    public KulaNa(int wysokosc, int promien){
        promienK = promien;
    }

    public void show(){
        System.out.println("Promien kuli: "+ promienK +", objetosc kuli: "+ Math.PI*4.0/3.0 * promienK);
    }
}
