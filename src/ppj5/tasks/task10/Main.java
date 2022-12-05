package ppj5.tasks.task10;

public class Main {
    public static void main(String[] args) {
        int k = 1;
        for (int y = 1; y < 7; y++){
            for (int x = 1 ; x < 10 ; x ++){
                if (k == 1){
                    System.out.print("*");
                    k = 0;
                } else {
                    System.out.print(" ");
                    k = 1;
                }
            }
            System.out.println("");
        }
    }
}
