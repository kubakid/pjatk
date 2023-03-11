package ppj.kol2przyklad;

public class Main {
    public static void main (String[] args){
//        byte[] odp = uniqueDigits(12353789);
//        for (int i = 0; i < odp.length; i++) {
//            System.out.print(odp[i]);
//        }
            // zad 3 programowanie

        int random = (int)(Math.random() * (Integer.MAX_VALUE));
        System.out.println(random);
        System.out.println();
        byte [] task = uniqueDigits(random);

        byte [] answer = {};
        for (int i = 0; i < task.length; i ++){
            if (!isExponent(task[i])){
                byte[] pom = new byte[answer.length+1];
                for (int j = 0; j < answer.length; j++)
                    pom[j] = answer[j];
                pom[pom.length-1] = task[i];
                answer = new byte[pom.length];
                for (int j = 0; j < answer.length; j++)
                    answer[j] = pom[j];
            }
        }
        for (int i = 0; answer.length > i; i++){
            System.out.print(answer[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < answer.length; i++){
            for (int j = 0; j < answer.length; j++){
               if (answer[i] > answer[j]){
                   byte pom = answer[j];
                   answer[j] = answer[i];
                   answer[i] = pom;

               }
            }
        }
        for (int i = 0; answer.length > i; i++){
            System.out.print(answer[i] + " ");
        }
        System.out.println(isExponent(0));


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
        byte[] result = new byte[0];
        byte[] pom;
        for (int i = 0; i < counter; i++){
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
        return result;
    }


    public static boolean isExponent(int value){
        if (value <= 0)
            return false;
        boolean isExp = true;
        while (value != 0){
            if (value == 2)
                return true;
            if( value % 2 == 1){
                isExp = false;
                break;
            }
            value /= 2;

        }
        return isExp;
    }


    public static int pow(int a , int b){
        if (b == 0)
            return 1;
        else
            return a * pow(a, b-1);
    }


}
