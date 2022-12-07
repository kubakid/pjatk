package ppj9.task4;

public class Main {
    public static void main(String[] args) {
        for (int j : splitToDigits(12345)){
            System.out.print(j + " ");
        }

    }

    public static int[] splitToDigits(int n){
        int a = 0;
        int helpN = n;
        while (helpN != 0){
            helpN /= 10;
            a++;
        }
        int[] splited = new int[a];

        for (int i = 0; i < splited.length; i++){
            splited[splited.length - 1 - i] = n % 10;
            n /= 10;
        }
        return splited;
    }

}
