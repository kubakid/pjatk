package ppj7.cwiczenia;

public class task2 {
    public static void main(String[] args) {
        char[] tab = new char[3];
        int minVal = 65535;
        int minInd = 4;
        for (int i = 0 ; i < tab.length; i ++){
            tab[i] = (char)(Math.random() * 65535);
            System.out.println(tab[i]);
            int a = (int)tab[i];
            if (a < minVal){
                minVal = a;
                minInd = i;
            }

        }
        System.out.println(minInd);
    }
}
