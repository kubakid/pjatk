package ppj8.tasks.task1;

public class Main {
    public static void main(String[] args) {

        int[] tab1 = new int[(int)(Math.random()* (20) + 1)];
        int[] tab2 = new int[(int)(Math.random()* (20) + 1)];
        int[] tab3 = new int[(int)(Math.random()* (20) + 1)];
        numberValuesinArr(tab1);
        numberValuesinArr(tab2);
        numberValuesinArr(tab3);
        int[][] tab123 = {tab1, tab2, tab3};

        for (int i = 0; i < tab123.length; i++){
            System.out.print("{ ");
            for (int j = 0; j < tab123[i].length; j++){
                System.out.print(tab123[i][j] + ", ");
            }
            System.out.print("}");
            System.out.println();
        }
        ;
    }
    public static void numberValuesinArr(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * (20) + 1);
        }
    }
}
