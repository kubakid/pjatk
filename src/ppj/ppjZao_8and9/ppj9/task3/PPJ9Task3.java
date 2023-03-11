package ppj.ppjZao_8and9.ppj9.task3;

public class PPJ9Task3 {
    public static void main(String[] args) {

    }
    public static boolean jestRowna(int[][]tab1, int[][]tab2){
        if(tab1.length != tab2.length)
            return false;
        for (int i = 0; i < tab1.length; i++) {
            if(tab1[i].length != tab2[i].length)
                return false;
        }
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                if(tab1[i]!=tab2[i])
                    return false;
            }
        }
        return true;
    }
}
