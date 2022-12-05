package ppj7.cwiczenia;

public class task5 {
    public static void main(String[] args) {
        int size = (int)(Math.random() * (15-10) + 10);
        int[] tabc = new int[size];
        //1
        for ( int i = 0 ; i< tabc.length; i ++){
            tabc[i] = i;
        }
        int[] mixedTab = new int[size];
        for (int i = 0; i < size; i++){
            int random = (int)(Math.random() * (size-1));
            int a = tabc[i];
            tabc[i] = tabc[random];
            tabc[random] = a;
        }

        for(int i = 0; i< tabc.length; i++){
            System.out.print(tabc[i] + " ");
        }
        System.out.println( );

        for(int i = 0; i< tabc.length; i++){
            for (int j = 0; j < tabc.length; j++){
                if (tabc[j] == i){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
