import java.io.*;
import java.util.Scanner;

public class Demo {

    public static String read(String path)  {
//открываем файл по пути
        BufferedReader reader = new BufferedReader(FileReader.nullReader());

        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        StringBuilder stringBuilder = new StringBuilder();
        String currentString;
//построчно считываем файл
        try {
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//закрываем файл
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

//возвращаем вычитанный текст в строке
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System. out .println( read ( "/Users/zakharvalko/Desktop/Test.txt" ));
    }
}