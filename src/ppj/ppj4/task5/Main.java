package ppj.ppj4.task5;

public class Main {
    public static void main(String[] args) {
        boolean czyPada = false;
        boolean czySwieciSlonce = false;
        if (czyPada && !czySwieciSlonce){
            System.out.println("Plucha");
        } else if (czyPada && czySwieciSlonce) {
            System.out.println("tęcza");
        } else if (!czyPada && czySwieciSlonce) {
            System.out.println("Słonecznie");
        } else {
            System.out.println("Pochmurno");
        }
    }
}
