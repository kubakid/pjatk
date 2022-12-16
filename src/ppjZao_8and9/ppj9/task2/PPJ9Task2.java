package ppjZao_8and9.ppj9.task2;

public class PPJ9Task2 {
    public static void main(String[] args) {
        char[] input = {'A','l','a',' ','m','a',' ','k','o','t','a'};
        System.out.println("countDigits");
        countDigits(input);
        System.out.println("\ncountDigitsReturnArr");
        int tab[] = countDigitsReturnArr(input);
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0)
                System.out.println((char)i + " = " + tab[i]);
        }
    }
    public static void countDigits(char[] input){
        for (char i = 0; i < Character.MAX_VALUE; i++) {
            int counter = 0;
            for (int j = 0; j < input.length; j++) {
                if(i == input[j])
                    counter++;
            }
            if(counter != 0)
                System.out.println( i + " = " + counter);
        }
    }
    public static int[] countDigitsReturnArr(char[] input){
        int [] tab = new int[Character.MAX_VALUE];
        for (int i = 0; i < input.length; i++) {
            tab[input[i]]++;
        }
        return tab;
    }
}
