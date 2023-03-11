package ppj.ppj9.task5;

public class Main {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }

    public static boolean isArmstrongNumber(int n){
        int length = 0;
        int helpN = n;
        while (helpN != 0){
            length++;
            helpN /= 10;
        }
        helpN = n;
        int sum = 0;
        while (helpN != 0){
            sum += (int)(Math.pow(helpN %10, length));
            helpN /= 10;
        }
        return sum == n;
    }
}

