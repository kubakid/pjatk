package ppjZao_8and9.ppj9.task8;

public class PPJ9Task8 {
    public static void main(String[] args) {
        char[] word = {'a','l','a'};
        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(char[] arr) {
        if (arr.length <= 1)
            return true;
        else {
            char[] temp = new char[arr.length - 2];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[i + 1];
            }
            return arr[0] == arr[arr.length-1] && isPalindrome(temp);
        }
    }
}
