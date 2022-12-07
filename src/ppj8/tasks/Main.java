package ppj8.tasks;

public class Main {
    public static void main(String[] args) {

        // TASK 1

        int[] tab1 = new int[(int)(Math.random()* (20) + 1)];
        int[] tab2 = new int[(int)(Math.random()* (20) + 1)];
        int[] tab3 = new int[(int)(Math.random()* (20) + 1)];
        numberValuesinArr(tab1);
        numberValuesinArr(tab2);
        numberValuesinArr(tab3);
        int[][] tab123 = {tab1, tab2, tab3};

        for (int[] ints : tab123) {
            System.out.print("{ ");
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.print("}");
            System.out.println();
        }






        // TASK 2
        float [][] arr = new float[8][8];
        float leftSum = 0;
        float rightSum = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (float)(Math.random());
                if (arr[i].length - i - 1 == j){
                    rightSum += arr[i][j];
                }
                if (i == j){
                    leftSum += arr[i][j];
                }
            }
        }

        System.out.println(leftSum);
        System.out.println(rightSum);







        //TASK 3

        int [][] tab =  {
                {1,0,0,0,0},
                {0,1,0,0},
                {0,0,1}
        };

        int length = 0;

        for (int[] value : tab) {
            length += value.length;
        }
        int[] arr1 = new int[length];
        int index = 0;

        for (int[] ints : tab) {
            for (int j = 0; j < ints.length; j++, index++) {
                arr1[index] = ints[j];
            }
        }

        for (int j : arr1) {
            System.out.print(j + "  ");
        }






        // TASK 4

        int[][] tab5 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] vectors = {
                {1, 0},
                {0, 1},
                {-1, 0},
                {0, -1}
        };
        int x = 0;
        int y = 0;
        int vec = 0;

        int[] arr5 = new int[tab5.length * tab5[0].length];

        for (int i = 0; i < arr5.length-1; i++) {
            boolean duplicated = false;
            boolean isOutOfRange =false;
            arr5[i] = tab5[y][x];

            if(x + vectors[vec][0] > tab5.length - 1 || y + vectors[vec][1] > tab5.length - 1 || x + vectors[vec][0] < 0 || y + vectors[vec][1] < 0){
                isOutOfRange = true;
            }
            for (int j = 0; j <= i; j++) {
                if(isOutOfRange){
                    break;
                }else {
                    if (tab5[y + vectors[vec][1]][x + vectors[vec][0]] == arr5[j]) {
                        duplicated = true;
                        break;
                    }
                }
            }
            if (isOutOfRange || duplicated) {
                if (vec == 3)
                    vec = 0;
                else
                    vec+=1;
            }

            x += vectors[vec][0];
            y += vectors[vec][1];
        }

        arr5[tab5.length * tab5[0].length - 1] = tab5[y][x];

        for (int j : arr5) {
            System.out.print(j + "\t");
        }



        //TASK 5

        int b = 1000;
        show(b);


        //TASK 6

        int wrt = 5;
        System.out.println(wrt);

        System.out.println();
        System.out.println();

        modifyValue(wrt);

        System.out.println();
        System.out.println();

        System.out.println(wrt);

        //dzieje sie tak dlatego, że metoda zwiększa 5ciokrotnie wartość zmiennej wewnątrz wyłącznie niej i potem nie
        // przypisuje do wartosci zmiennej globalnej


        //TASK 7

        int [] arr7 = {1,2,3};
        System.out.println(maxOfThree(arr7[0], arr7[1], arr7[2]));




    }

    public static void numberValuesinArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (20) + 1);
        }
    }

    public static void show(int a) {
        System.out.println(a);
    }

    public static void modifyValue(int a){
        System.out.println(a);
        a *= 5;
        System.out.println(a);
    }

    public static int maxOfThree (int a, int b, int c){
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        return c;

    }


}
