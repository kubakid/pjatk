package ppj9.task8;

public class Main {
    public static void main(String[] args) {
        char [] ala = {'a', 'l', 'a'};
        System.out.println(isPalindrom(ala));
    }

    public static boolean isPalindrom (char[] arr){
        for (int i = 0; i < arr.length/2; i++){
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        }
        return true;
    }
}
