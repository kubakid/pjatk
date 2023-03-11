package ppj.ppjZao_8and9.ppj9.task4;

import java.util.Arrays;

public class PPJ9Task4 {
    public static void main(String[] args) {
        int[] tab = splitToDigits(51015);
        System.out.println(Arrays.toString(tab));
    }

    public static int[] splitToDigits(int number) {
        int digitCounter = number == 0 ? 1 : 0;
        for (int i = number; i > 0; i /= 10) {
            digitCounter++;
        }

        int[] result = new int[digitCounter];

        for (int i = 0, temp = number; i < result.length; i++) {
            result[i] = temp % 10;
            temp /= 10;
        }
        return result;
    }
}
