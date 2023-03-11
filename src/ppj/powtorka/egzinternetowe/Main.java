package ppj.powtorka.egzinternetowe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Egzamin 2023");

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            int wrt = 0b111001;
            int[][] wynik = zmienne(wrt);
            System.out.println("X\tY");
            System.out.println(wynik[0][0] + "\t" + wynik[0][1]);
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            Zespolone z1 = new Zespolone(1.43, 6.23);
            Zespolone z2 = new Zespolone(3.14, 5.47);
            System.out.println(z1.add(z2));
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            char[][] arr = {
                    {'A', 'l', 'a'},
                    {'m', 'a'},
                    {'K', 'a', 'J', 'a', 'K'}
            };
            powtorzenia(arr);
        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            Orc o1 = new Orc("Dis Stream", 10, "topor");
            Orc o2 = new Orc("Mam00n", 6);
            System.out.println(o1.getName() + " ma " + o1.getDamage() + " sily ataku");
            System.out.println(o2.getName() + " ma " + o2.getDamage() + " sily ataku");
        }
    }
    public static int[][] zmienne(int wrt){
        int x = wrt & 0b111;
        int y = wrt >> 3 & 0b111;
        return new int[][] {{x, y}};
    }
    public static void powtorzenia(char[][] data){
        System.out.println("wiersz\tlitera");
        int[] znaki = new int['z' - 'a'];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 'a'; k <= 'z'; k++) {
                    if(Character.toLowerCase(data[i][j]) == (char)k){
                        znaki[k - 'a'] += 1;
                    }
                }
            }
            for (int j = 0; j < znaki.length; j++) {
                if(znaki[j] >= 2){
                    System.out.println((i + 1) + "\t\t" + (char)('a' + j));
                }
            }
            znaki = new int['z' - 'a'];
        }
    }
}