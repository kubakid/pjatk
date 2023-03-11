package ppj.powtorka.nowe;

import java.io.*;

public class IO {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Kuba\\IdeaProjects\\pja\\src\\ppj.powtorka\\nowe\\aaa.txt");
        try {

            {
//                FileInputStream fis = new FileInputStream(file);
//                int tmp;
//                while((tmp = fis.read() )!= -1){
//                    System.out.println((char)(tmp));
//                }
//                fis.close();
            }


            {
//                FileInputStream fis = new FileInputStream(file);
//                int tmp;
//                StringBuilder stringBuilder = new StringBuilder();
//                StringBuffer stringBuffer = new StringBuffer();
//                while((tmp = fis.read()) != -1){
//                    stringBuilder.append((char)(tmp));
//                }
//                System.out.println(stringBuilder.toString());
//                fis.close();


            }


            {
//                FileReader fr = new FileReader(file);
//                StringBuffer stringBuffer = new StringBuffer();
//                int tmp;
//                while ( (tmp = fr.read()) != -1){
//                    stringBuffer.append((char)tmp);
//                }
//                fr.close();
//                System.out.println(stringBuffer);
            }

            {
                FileReader fr = new FileReader(file);
                BufferedReader bf = new BufferedReader(fr);
                StringBuffer stringBuilder = new StringBuffer();
                String tmp;
                while ((tmp = bf.readLine()) != null){
                    stringBuilder.append(tmp).append(", ");
                }
                fr.close();
                System.out.println(stringBuilder);
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch(IOException e ){
           throw new RuntimeException(e);
        }

        File outFile = new File("C:\\Users\\Kuba\\IdeaProjects\\pja\\src\\ppj.powtorka\\nowe\\bbb.txt");
        try {
            FileWriter fw = new FileWriter(outFile);
            fw.write("Ja cie zapisuje");
            fw.write("\nessa");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write('y');
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            int tmp;
            while((tmp = fis.read()) != -1){
                System.out.println((char) (tmp));
            }
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
