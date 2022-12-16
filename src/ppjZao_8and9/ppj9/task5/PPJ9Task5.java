package ppjZao_8and9.ppj9.task5;

import ppjZao_8and9.ppj9.task4.PPJ9Task4;
public class PPJ9Task5 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(154));
    }

    public static boolean isArmstrongNumber (int n){
        int[] digits = PPJ9Task4.splitToDigits(n);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += (int)Math.pow(digits[i], digits.length);
        }
        return sum == n;
    }
}
