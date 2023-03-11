package ppj.ppj7.cwiczenia;

public class task6 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i ++){
            arr1[i] = (int)(Math.random() * (100 - 1) + 1);
            arr2[i] = (int)(Math.random() * (100 - 1) + 1);
        }
        int[] arr12 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i ++){
            arr12[i] = arr1[i];
            arr12[i+5] = arr2[i];
        }


        int val = 1;
        int[] unique = {arr1[0]};
        int[] helpUni = {arr1[0]};
        for (int i = 0; i < arr1.length; i++){
            boolean isUni = true;
            for(int j = 0; j < unique.length; j++){
                if (arr1[i] == unique[j]){
                    isUni = false;
                    break;
                }
            }
            if (isUni){
                val += 1;
                helpUni = new int[val];
                for (int j = 0; j < unique.length; j++){
                    helpUni[j] = unique[j];
                }
                helpUni[val-1] = arr1[i];
                unique = new int[val];
                for (int j = 0; j < helpUni.length; j++){
                    unique[j] = helpUni[j];
                }
            }
        }

        for (int i = 0; i < arr2.length; i++){
            boolean isUni = true;
            for(int j = 0; j < unique.length; j++){
                if (arr2[i] == unique[j]){
                    isUni = false;
                    break;
                }
            }
            if (isUni){
                val += 1;
                helpUni = new int[val];
                for (int j = 0; j < unique.length; j++){
                    helpUni[j] = unique[j];
                }
                helpUni[val -1 ] = arr2[i];
                unique = new int[val];
                for (int j = 0; j < helpUni.length; j++){
                    unique[j] = helpUni[j];
                }
            }
        }
        for (int i = 0; i < unique.length; i ++){
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        int min = unique[0];
        int max = unique[0];

        for (int i = 1; i < unique.length; i++){
            if (min > unique[i]){
                min = unique[i];
            }
            if (max < unique[i]){
                max = unique[i];
            }
        }

        for (int i = min + 1; i < max; i++){
            System.out.print(i + " ");
        }

    }
}
