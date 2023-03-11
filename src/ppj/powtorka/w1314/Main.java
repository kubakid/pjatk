package ppj.powtorka.w1314;

import java.io.*;
import java.util.Scanner;

public
    class Main {

    public static void main(String[] args) {
        Person person = new Person("Jan", 1967);
        Student student = new Student("Ala", 2000, 12345);

        person = student;

        System.out.println(person);

        Student s1 = new Student("Ala", 2000, 12345);
        Student s2 = new Student("Ala", 2000, 12345);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

// ===========================================================

        System.out.println(
            ~0b0001  // 1111_1110
        );

        System.out.println(
              0b0001_1000
            & 0b0000_1000
            //--0000_1000
        );

        System.out.println(
            123457 & 0b1111
            //00011110001001000001
        );

// =======================================================================

        File file = new File("C:\\2223 Z\\win\\wyklady\\data\\1.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {

//            int tmp = fis.read();
//            while(tmp != -1) {
//                System.out.print((char) tmp);
//                tmp = fis.read();
//            }
//            System.out.println();
            {
                FileInputStream fis = new FileInputStream(file);
                int tmp;
                System.out.print("fis: ");
                while ((tmp = fis.read()) != -1)
                    System.out.print((char) tmp);
                System.out.println();
                fis.close();
            }

            {
                FileInputStream fis = new FileInputStream(file);
                int tmp;
                StringBuilder stringBuilder = new StringBuilder();
                StringBuffer stringBuffer = new StringBuffer();
                while ((tmp = fis.read()) != -1)
                    stringBuilder.append((char) tmp);
                System.out.println(stringBuilder.toString());
                fis.close();
            }

            {
                FileReader fr = new FileReader(file);
                StringBuffer stringBuffer = new StringBuffer();
                int tmp;
                while( (tmp = fr.read()) != -1)
                    stringBuffer.append((char) tmp);
                fr.close();
                System.out.println(stringBuffer.toString());
            }

            {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                StringBuffer stringBuffer = new StringBuffer();
                String tmp;
                while( (tmp = br.readLine()) != null)
                    stringBuffer.append(tmp);
                fr.close();
                System.out.println(stringBuffer.toString());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        {
            File outFile = new File("C:\\2223 Z\\win\\wyklady\\data\\out.txt");
            try {
                FileWriter fw = new FileWriter(outFile);
                fw.write("a Janek ma psa ł");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        {
            File outFile = new File("C:\\2223 Z\\win\\wyklady\\data\\outFOS.txt");
            try {
                FileOutputStream fos = new FileOutputStream(outFile);
                String dataOut = "a Janek ma psa ł";
                for(int i=0; i<dataOut.length(); i++)
                    fos.write(dataOut.charAt(i));
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int val = 16000000;
        {
            File outFile = new File("C:\\2223 Z\\win\\wyklady\\data\\val.txt");
            try {
                FileWriter fw = new FileWriter(outFile);
                fw.write(""+val);
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        {
            File outFile = new File("C:\\2223 Z\\win\\wyklady\\data\\valFOS.bin");
            /*
            <4byte 2byte 1byte 4byte>...
             */
            try {
                FileOutputStream fos = new FileOutputStream(outFile);
                // val = 0b00000000_11110100_00100100_00000000
                //     & 0b00000000_00000000_00000000_11111111
                // ==                                _00000000
                fos.write(val >> 0);
                // val = 0b00000000_11110100_00100100_00000000
                // >> 8  0b00000000_00000000_11110100_00100100
                //     & 0b00000000_00000000_00000000_11111111
                // ==                                _00100100
                fos.write(val >> 8);
                // val = 0b00000000_11110100_00100100_00000000
                // >>16  0b00000000_00000000_00000000_11110100
                //     & 0b00000000_00000000_00000000_11111111
                // ==                                _11110100
                fos.write(val >>16);
                fos.write(val >>24);
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                FileInputStream fis = new FileInputStream(outFile);
                int res = 0;
                res = res | (fis.read() << 0);
                res = res | (fis.read() << 8);
                res = res | (fis.read() <<16);
                res = res | (fis.read() <<24);
                fis.close();
                System.out.println("res: "+res);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException ex){
                System.out.println(ex);
            }
        }

        //================================================
        Person p = new Person("Jan", 1967);
        System.out.println(p);
        {
            File outFile = new File("C:\\2223 Z\\win\\wyklady\\data\\person.obj");
            try {
                FileOutputStream fos = new FileOutputStream(outFile);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(p);
                fos.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                FileInputStream fis = new FileInputStream(outFile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object obj = ois.readObject();
                fis.close();
                System.out.println(obj.toString());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
