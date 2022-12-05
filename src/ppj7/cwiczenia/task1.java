package ppj7.cwiczenia;

public class task1 {
    public static void main(String[] args) {
        //1
        double[] tab = new double[10];
        System.out.println("zawartosc tablicy:");
        System.out.print("[");
        for (int i = 0; i < tab.length;i++){
            tab[i] = Math.random() * 10;
            //2
            if (i < tab.length - 1)
                System.out.print(tab[i]+", ");
            else
                System.out.print(tab[i]);
        }
        System.out.print("]");
        System.out.println();

        //3
        System.out.println("liczby o parzystych indeksach:");
        for (int i = 0; i< tab.length; i++){
            if (i % 2 == 0){
                System.out.println(tab[i]);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Nieparzyste wartości po konwersji na inta");
        for (int i = 0; i <  tab.length; i ++){
            int a = (int) tab[i];
            if (a % 2 == 1){
                System.out.println(tab[i]);
            }
        }
    }
}
