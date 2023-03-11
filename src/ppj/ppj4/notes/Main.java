package ppj.ppj4.notes;

public class Main {
    public static void main(String[] args) { // psvm
        System.out.println("a"); //sout, makra przestudiować  na stronie albo help -> learn id features
        // systemy liczbowe, liczby ujemne

        //typ byte posiada wartości dodatnie i ujemne od -128 do 127 zapis bitowy -128 : 10000000
        // 10000001 = -127
        // -66 = ?
        // -128 + x = - 66
        // -66 bin : 10111110

        byte decimal = -66;
        byte bin = (byte)0b10111110;
        System.out.println("byte = " + bin);
        //z binarnego na 8kowy to dzielimy bity na trójki od prawej, na 16 stkowy dzielimy na 4 od prawej
        byte oct = (byte) 0276;
        byte hex = (byte) 0xBE;
        System.out.println(oct);
        System.out.println(hex);

        int min = 0b10000000000000000000000000000000;
        System.out.println(min);
        int minOct = 02_0_0_0_0_0_0_0_0_0_0;
        int minHex = 0x8_0_0_0_0_0_0_0;
        System.out.println(minOct);
        System.out.println(minHex);

        // a++ inkrementuje po wszystkim a ++a inkrementuje przed wszystkim
        // nie wsadzamy operacji do warunków bo logicznych bo przy OR jeśli pierwsze będzie true to idzie dalej od razu nie patzrzy za siebie
        //analogicznie jeśli przy AND pierwsza wartość false to od razu ucieka dalej

    }
}
