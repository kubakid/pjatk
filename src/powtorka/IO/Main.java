package powtorka.IO;

import java.io.*;

public class Main {
    // writing data to txt file


    public static void main(String[] args) {
        BufferedWriter writer;

        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("1");
            writer.write("\n5");
            writer.write("8");
            writer.write("\n9");
            writer.close(); // KONIECZNIE TRZEBA ZAMKNĄĆ
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    {

    }
}
