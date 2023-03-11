package ppj.ppj9.task7;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        swap(arr, 0,2);
        for (int i : arr){
            System.out.println(i);
        }
    }


    public static void swap ( int [ ] tab , int source , int destination ){
        if (source < 0 || source > tab.length || destination < 0 || destination >= tab.length){
            System.out.println("Sugerowana zamiana wyszłaby poza indeks tablicy");
        } else{
            int pom = tab[source];
            tab[source] = tab[destination];
            tab[destination] = pom;
        }
    }
}


