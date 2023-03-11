package ppj.ppj9.task2;

public class Main {
    public static void main(String[] args) {
        char[] tab = {'a', 'l', 'a', 'm','a', 'k','o','t','a'};
        countLetters(tab);
    }

    public static void countLetters (char[] arr){
        int diffLetters = 0;
        char[] unique = {arr[0]};

        for (char item : arr) {
            boolean isUni = true;
            for (char c : unique) {
                if (item == c) {
                    isUni = false;
                    break;
                }
            }
            if (isUni) {
                char[] helpUni = new char[unique.length + 1];
                for (int j = 0; j < unique.length; j++) {
                    helpUni[j] = unique[j];
                }
                helpUni[helpUni.length - 1] = item;
                unique = new char[helpUni.length];
                for (int j = 0; j < helpUni.length; j++) {
                    unique[j] = helpUni[j];
                }
            }

        }
        for (char c : unique) {
            int counter = 0;
            for (char value : arr) {
                if (c == value)
                    counter++;
            }
            System.out.println(c + ": " + counter);
        }
    }
}
