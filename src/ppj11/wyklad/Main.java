package ppj11.wyklad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {


    // polimorfizm
    // nie mozemy porówynwc obiektów, musimy zrobić override metody equals
    // if (obj instanceof Studnet) - sprawdza czy obj realizuje załozenia klasy obj

    //metoda equals nadpisana do klasy Student

    // typy złozone porównujemy metodą equals

    //hashcode bardzo ważna rzecz, generuje kod unikalny dla konkretnych argumentów

//    @Override // adnotacja - ułataiwmy kompilatorowi

    // OPERACJE BITOWe ~

    public static void main(String[] args) {
        System.out.println(~0b011); // mnożenie przez -1 a potem jeszcze odjąć jeden

        // operatory & i | działają tak samo, ^ - albo

        // operatory przesuniecia

        // 0000 1010 << 2 = 0010 100


        // OPERACJE WEJSCIA WYJSCIA
        // operacje wykonywane na plikach lub urządzeniach

        //przykład chcemy odczytać z pliku dokumenty

        File file = new File("C:\\Users\\Kuba\\IdeaProjects\\pja\\src\\ppj11\\wyklad\\data.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fis = new FileInputStream(file);
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // za każdym razem trzeba wczytać read(), jeżeli okaże się, że nie ma już informacji to read zwróic -1


        // KLASY DO OPERACJI NA STRINGACH

        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuilder.append("c");
        System.out.println(stringBuilder.toString());


        // KAŻDY STRUMIEN KTORY OTWORZYMY MUSIMY W KTORYMS MOMENCIE ZAMKNĄĆ


        // FileWriter - sluzac do tworzenia plikow wyjsciowych, kazdy plik wyjsciowy trzeba obligatoryjnie zamknac -
        // przygotowany, zeby zapisywac informacje w sposób znakowy
        //jezeli FileWriter nie znajduje pliku to sam utworzy taki plik

        int[][] arr = {{1,2,3}, {4,5,6}};

        int[] arr1 = {1,2,3};

        ToolBox.showArr(MyTB.appendArr(arr, arr1));

        ToolBox.showArr(MyTB.randomArr2D(5,5,10,20));


        System.out.println(MyTB.round(5.678,2));





    }

}
