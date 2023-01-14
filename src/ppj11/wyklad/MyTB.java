package ppj11.wyklad;

public class MyTB {

    public static int[] appendIndex(int[] tab, int amount) {
        int[] tab1 = new int[tab.length + amount];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
        return tab1;
    }


    public static char[] appendIndex(char[] tab, int amount) {
        char[] tab1 = new char[tab.length + amount];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
        return tab1;
    }


    public static short[] appendIndex(short[] tab, int amount) {
        short[] tab1 = new short[tab.length + amount];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
        return tab1;
    }


    public static double[] appendIndex(double[] tab, int amount) {
        double[] tab1 = new double[tab.length + amount];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
        return tab1;
    }


    public static float[] appendIndex(float[] tab, int amount) {
        float[] tab1 = new float[tab.length + amount];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
        return tab1;
    }


    public static long[] appendIndex(long[] tab, int amount) {
        long[] tab1 = new long[tab.length + amount];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
        return tab1;
    }


    public static byte[] appendIndex(byte[] tab, int amount) {
        byte[] tab1 = new byte[tab.length + amount];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
        return tab1;
    }

    //===========================================================================


    public static byte[][] appendIndex2d(byte[][] tab, int amount, int amount2d) {
        byte[][] tab1 = new byte[tab.length + amount][0];
        for (int i = 0; i < tab1.length; i++) {
            if (i < tab.length) {
                tab1[i] = new byte[tab[i].length];
                for (int j = 0; j < tab[i].length; j++) {
                    tab1[i][j] = tab[i][j];
                }
            } else {
                tab1[i] = new byte[amount2d];
            }
        }
        return tab1;
    }


    public static int[][] appendIndex2d(int[][] tab, int amount, int amount2d) {
        int[][] tab1 = new int[tab.length + amount][0];
        for (int i = 0; i < tab1.length; i++) {
            if (i < tab.length) {
                tab1[i] = new int[tab[i].length];
                for (int j = 0; j < tab[i].length; j++) {
                    tab1[i][j] = tab[i][j];
                }
            } else {
                tab1[i] = new int[amount2d];
            }
        }
        return tab1;
    }


    public static char[][] appendIndex2d(char[][] tab, int amount, int amount2d) {
        char[][] tab1 = new char[tab.length + amount][0];
        for (int i = 0; i < tab1.length; i++) {
            if (i < tab.length) {
                tab1[i] = new char[tab[i].length];
                for (int j = 0; j < tab[i].length; j++) {
                    tab1[i][j] = tab[i][j];
                }
            } else {
                tab1[i] = new char[amount2d];
            }
        }
        return tab1;
    }


    public static short[][] appendIndex2d(short[][] tab, int amount, int amount2d) {
        short[][] tab1 = new short[tab.length + amount][0];
        for (int i = 0; i < tab1.length; i++) {
            if (i < tab.length) {
                tab1[i] = new short[tab[i].length];
                for (int j = 0; j < tab[i].length; j++) {
                    tab1[i][j] = tab[i][j];
                }
            } else {
                tab1[i] = new short[amount2d];
            }
        }
        return tab1;
    }


    public static float[][] appendIndex2d(float[][] tab, int amount, int amount2d) {
        float[][] tab1 = new float[tab.length + amount][0];
        for (int i = 0; i < tab1.length; i++) {
            if (i < tab.length) {
                tab1[i] = new float[tab[i].length];
                for (int j = 0; j < tab[i].length; j++) {
                    tab1[i][j] = tab[i][j];
                }
            } else {
                tab1[i] = new float[amount2d];
            }
        }
        return tab1;
    }

    public static double[][] appendIndex2d(double[][] tab, int amount, int amount2d) {
        double[][] tab1 = new double[tab.length + amount][0];
        for (int i = 0; i < tab1.length; i++) {
            if (i < tab.length) {
                tab1[i] = new double[tab[i].length];
                for (int j = 0; j < tab[i].length; j++) {
                    tab1[i][j] = tab[i][j];
                }
            } else {
                tab1[i] = new double[amount2d];
            }
        }
        return tab1;
    }


    public static long[][] appendIndex2d(long[][] tab, int amount, int amount2d) {
        long[][] tab1 = new long[tab.length + amount][0];
        for (int i = 0; i < tab1.length; i++) {
            if (i < tab.length) {
                tab1[i] = new long[tab[i].length];
                for (int j = 0; j < tab[i].length; j++) {
                    tab1[i][j] = tab[i][j];
                }
            } else {
                tab1[i] = new long[amount2d];
            }
        }
        return tab1;
    }


    //=============================================================


    public static int[] append(int[] tab, int value) {
        int[] arr = new int[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            arr[i] = tab[i];
        }
        arr[arr.length - 1] = value;
        return arr;
    }


    public static char[] append(char[] tab, char value) {
        char[] arr = new char[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            arr[i] = tab[i];
        }
        arr[arr.length - 1] = value;
        return arr;
    }

    public static short[] append(short[] tab, short value) {
        short[] arr = new short[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            arr[i] = tab[i];
        }
        arr[arr.length - 1] = value;
        return arr;
    }


    public static byte[] append(byte[] tab, byte value) {
        byte[] arr = new byte[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            arr[i] = tab[i];
        }
        arr[arr.length - 1] = value;
        return arr;
    }


    public static float[] append(float[] tab, float value) {
        float[] arr = new float[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            arr[i] = tab[i];
        }
        arr[arr.length - 1] = value;
        return arr;
    }


    public static long[] append(long[] tab, long value) {
        long[] arr = new long[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            arr[i] = tab[i];
        }
        arr[arr.length - 1] = value;
        return arr;
    }


    public static double[] append(double[] tab, double value) {
        double[] arr = new double[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            arr[i] = tab[i];
        }
        arr[arr.length - 1] = value;
        return arr;
    }


    //================================================================


    public static int[][] appendArr(int[][] tab, int[] arr) {
        int[][] tab1 = new int[tab.length + 1][0];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = new int[tab[i].length];
            for (int j = 0; j < tab[i].length; j++) {
                tab1[i][j] = tab[i][j];
            }
        }
        tab1[tab1.length - 1] = arr;
        return tab1;
    }


    public static byte[][] appendArr(byte[][] tab, byte[] arr) {
        byte[][] tab1 = new byte[tab.length + 1][0];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = new byte[tab[i].length];
            for (int j = 0; j < tab[i].length; j++) {
                tab1[i][j] = tab[i][j];
            }
        }
        tab1[tab1.length - 1] = arr;
        return tab1;
    }


    public static short[][] appendArr(short[][] tab, short[] arr) {
        short[][] tab1 = new short[tab.length + 1][0];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = new short[tab[i].length];
            for (int j = 0; j < tab[i].length; j++) {
                tab1[i][j] = tab[i][j];
            }
        }
        tab1[tab1.length - 1] = arr;
        return tab1;
    }


    public static char[][] appendArr(char[][] tab, char[] arr) {
        char[][] tab1 = new char[tab.length + 1][0];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = new char[tab[i].length];
            for (int j = 0; j < tab[i].length; j++) {
                tab1[i][j] = tab[i][j];
            }
        }
        tab1[tab1.length - 1] = arr;
        return tab1;
    }

    public static float[][] appendArr(float[][] tab, float[] arr) {
        float[][] tab1 = new float[tab.length + 1][0];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = new float[tab[i].length];
            for (int j = 0; j < tab[i].length; j++) {
                tab1[i][j] = tab[i][j];
            }
        }
        tab1[tab1.length - 1] = arr;
        return tab1;
    }

    public static double[][] appendArr(double[][] tab, double[] arr) {
        double[][] tab1 = new double[tab.length + 1][0];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = new double[tab[i].length];
            for (int j = 0; j < tab[i].length; j++) {
                tab1[i][j] = tab[i][j];
            }
        }
        tab1[tab1.length - 1] = arr;
        return tab1;
    }

    public static long[][] appendArr(long[][] tab, long[] arr) {
        long[][] tab1 = new long[tab.length + 1][0];
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = new long[tab[i].length];
            for (int j = 0; j < tab[i].length; j++) {
                tab1[i][j] = tab[i][j];
            }
        }
        tab1[tab1.length - 1] = arr;
        return tab1;
    }

    //==========================================================================


    public static String toCamelCase(String s){
        if (s.equals("")){
            return "";
        }
        boolean which = s.contains("-");
        String[] words;
        if (which)
            words = s.split("-");
        else
            words = s.split("_");
        String odp = "";
        for (String i : words){
            odp += i.substring(0,1).toUpperCase() + i.substring(1);
        }
        if (s.substring(0,1).equals(odp.substring(0,1)))
            return odp;
        else
            return odp.substring(0,1).toLowerCase() + odp.substring(1);
    }


    // ==========================================================================


    public static int nww (int a, int b){
        return a*b / nwd(a,b);
    }

    //============================================================================

    public static int nwd (int a, int b){
        if (b ==0)
            return a;
        return nwd(b, a %b);
    }

    //============================================================================

    public static int[] randomArr (int elements, int min, int max){
        int[] tab = new int[elements];
        for (int i = 0; i <  elements; i++){
            tab[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return tab;
    }


    public static int[][] randomArr2D (int rows,int columns, int min, int max){
        int[][] tab = new int[columns][rows];
        for (int i = 0; i <  rows; i++){
            for (int j = 0; j < columns; j++){
                tab[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return tab;
    }

    // pola statyczne są ładowane w momencie klasy, wspóldzieli wartość z klasą i obiektami

    // alt insert  to skrót klawiszowy do rozpoczecia tworzenia konstruktora itp




}
