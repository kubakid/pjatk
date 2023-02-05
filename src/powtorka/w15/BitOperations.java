package powtorka.w15;

public
    class BitOperations {

    public static void main(String[] args) {
        /*
        15 -> 00001111
        00001111 >> 3 -> 00000001
         */

        int val = 15;
        System.out.println( val >> 3 );

        // ===================================
/*
        // 01110011_00010001
        //&11111111_11101111
        // 01110011_00000001
 */
        val = 0b01110011_00010001;
        System.out.println( val );
        System.out.println( val & 0b11111111_11101111);

        System.out.println(
            decToBin(189)
        );
    /*
        // 1000000...1001
        // 1000000...1001 >> 2
        // 1110000...0010

        // 1000000...1001 >>> 2
        // 0010000...0010
    */
    }

    public static String decToBin(int val){
        StringBuilder sb = new StringBuilder();
        for(int i=31; i>=0; i--)
            sb.append( (val >> i) & 0b0001 );
        return sb.toString();
    }
}
