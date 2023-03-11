package ppj.ppj4.task2;

public class Main {
    public static void main(String[] args) {
        double liczba = 15;
        boolean isPrime = true;
        for(int i = 2; Math.sqrt(liczba) >= i ; i++){
            if (liczba % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Jest pierwsza");
        } else{
            System.out.println("nie jest pierwsza");
        }
    }
}
