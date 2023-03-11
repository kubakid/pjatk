package ppj.ppj3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // zad 1

        //wyprintuje 16

        // zad 2
        System.out.println(((1 + 2*3 + 4 ) / (5 - 6) + 78)/ (9. - 10./11.));



        // zad 3

            // int
            int minBin = 0b10000000000000000000000000000000;
            int minOct = 02_0_0_0_0_0_0_0_0_0_0;
            int minHex = 0x8_0_0_0_0_0_0_0;
            int min = -2147483648;

            int maxBin = 0b01111111111111111111111111111111;
            int maxOct = 01_7_7_7_7_7_7_7_7_7_7;
            int maxHex = 0x7fffffff;
            int max = 2147483647;

            //long
            long minBinL = 0b1000000000000000000000000000000000000000000000000000000000000000L;
            long minOctL = 01000000000000000000000L;
            long minHexL = 0x8000000000000000L;
            long minL = -9223372036854775808L;

            long maxBinL = 0b0111111111111111111111111111111111111111111111111111111111111111L;
            long maxOctL = 07_7_7_7_7_7_7_7_7_7_7_7_7_7_7_7_7_7_7_7_7L;
            long maxHexL = 0x7fffffffffffffffL;
            long maxL = 9223372036854775807L;

            // boolean
            boolean minBoolean = false;
            boolean maxBoolean = true;

            //byte
            byte minBinB = (byte)0b10000000;
            byte minOctB = (byte) 0200;
            byte minHexB = (byte) 0x80;
            byte minB = -128;

            byte maxBinB = (byte) 0b01111111;
            byte maxOctB = (byte) 0177;
            byte maxHexB = (byte) 0x7f;
            byte maxB = 127;

            //short
            short minBinS = (short)0b1000000000000000;
            short minOctS = (short)0100000;
            short minHexS = (short)0x8000;
            short minS = -32768;

            short maxBinS = (short)0b0111111111111111;
            short maxOctS = (short)0077777;
            short maxHexS = (short)0x7fff;
            short maxS = 32767;


            // float

            float minVal = 1.175494351E-38F;
            float maxVal = 3.402823466E+38F;


            //double

            double  minValD = 2.2250738585072014E-308;
            double maxValD = 1.7976931348623157E+308;

            //char
             char minC = '\u0000';
             char maxC = '\uffff';













        //zad 4
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = (input % 4 == 0 && input % 100 != 0) ? ("Rok " + input + " jest przestępny") : (input % 400 == 0 ? ("Rok " + input + " jest przestępny") : ("Rok " + input + " nie jest przestępny"));
        scanner.close();
        System.out.println(output);


        //zad 5

        // wszystkie oprócz trzeciego literału opisują ten sam literał

        //zad 6

            //literal liczb całkowitych
            long przyklad1 = 0b01111111111111111111111111111111111111111111111111L;

            //literał liczb zmiennoprzecinkowych;
            double przyklad2 = 4325346363.432425;
    }

}