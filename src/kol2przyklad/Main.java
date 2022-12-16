package kol2przyklad;

public class Main {
    public static void main (String[] args){
        byte[] odp = uniqueDigits(12353789);
        for (int i = 0; i < odp.length; i++) {
            System.out.print(odp[i]);
        }
            // zad 3 programowanie

        byte[] test = uniqueDigits((int)(Math.random()  * Integer.MAX_VALUE));
        boolean isThereZero = false;
        for (byte i : test) {
            if (i == 0) {
                isThereZero = true;
                break;
            }
        }
        int counter = 0;
        for (int i = 0 ; i < test.length; i++){
            if (isExponent(test[i]))
                test[i] = 0;
            if (test[i] != 0)
                counter++;
        }
        byte[] answer = new byte[counter];
        int index = 0;
        for (int i = 0; i < test.length; i++){
            if (test[i] != 0){
                answer[index] = test[i];
                index++;
            }
        }
        byte[] pomocnicza = new byte[answer.length + 1];
        if (isThereZero){
            for (int i = 0; i < answer.length - 1; i++){
                pomocnicza[i] = answer[i];
            }
            pomocnicza[pomocnicza.length-1] = 0;
        }

        //zad 1
        // 1    0   4   3   8   7   6

        //zad 2
        //i i i i
        //in in

        //zad 3
        //There ishope

        //zad 4
        //0     1   2   3   4   5

        //zad 5
        // 9 2 3 -> 9 2 8 ->  7 2 8 -> 7 2 6 ->
        //tabY = {(7,2,6), (7,2,6)

        //output:
        //6 2 7
        //6 2 7

    }

    public static byte[] uniqueDigits(int value){
        int a = value;
        int counter = 0;
        while (a > 0){
            counter++;
            a /= 10;
        }
        a = value;
        byte[] result = {(byte)(a % 10)};
        byte[] pom;
        a /= 10;
        for (int i = 0; i < counter - 1; i++){
            int rest = a % 10;
            a /= 10;
            boolean isUni = true;
            for (int j = 0; j < result.length; j++){
                if (rest == result[j]){
                    isUni = false;
                    break;
                }
            }
            if (isUni){
                pom = new byte[result.length];
                for (int j = 0; j < pom.length; j++){
                    pom[j] = result[j];
                }
                result = new byte[pom.length + 1];
                for (int j = 0; j < pom.length; j++){
                    result[j] = pom[j];
                }
                result[result.length - 1] = (byte)(rest);
            }
        }
        byte[] odp = new byte[result.length];
        for (int i = 0; i < result.length; i++){
            odp[i] = result[result.length - 1 - i];
        }
        if (odp.length % 2 == 1){

        }
        return odp;
    }


    public static boolean isExponent(int value){
        boolean isExp = true;
        while (value != 0){
            if( value % 2 == 1){
                isExp = false;
                break;
            }
            value /= 2;
        }
        return isExp;
    }


}
