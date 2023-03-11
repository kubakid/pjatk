package ppj.ppj7.cwiczenia;

public class task4 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515,407,80};
        for (int i = 0; i< arr.length; i ++) {
            int liczba = arr[i];
            int sum = 0;
            int potega = 0;
            while (liczba != 0){
                potega++;
                liczba /= 10;
            }
            liczba = arr[i];
            while (liczba != 0) {
                int num = liczba % 10;
                liczba /= 10;
                sum += Math.pow(num, potega);
            }
            if ( arr[i] == sum){
                System.out.println(arr[i]);
            }
        }
    }
}
