package ppj10.tasks.task5;

import ppj10.tasks.task3.Kwadrat;
import ppj10.tasks.task4.Walec;

public class KulaW {

    private int bok;
    private int wysokosc;
    private int promien;

    private double promienK;

    public KulaW(int bok) {
        this.bok = bok;

        promienK = bok/2.0;
    }

    public KulaW(int wysokosc, int promien){
        this.wysokosc = wysokosc;
        this.promien = promien;

        if (promien < wysokosc){
            promienK = promien/2.0;
        } else{
            promienK = wysokosc / 2.0;
        }
    }

    public void show(){
        System.out.println("Promien kuli: "+promienK+", objetosc kuli: "+ Math.PI*4.0/3.0 * promienK);
    }






}
