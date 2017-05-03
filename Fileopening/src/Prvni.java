import java.io.*;
import java.util.Scanner;

/**
 * Created by Ladislav Louka on 05.04.2017.
 */

public class Prvni {
    public static void main(String[] arg){
        try {
            FileInputStream fis1 = new FileInputStream("C:\\Users\\Ladis\\Documents\\GitHub\\PITZ\\Fileopening\\src\\1.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\Ladis\\Documents\\GitHub\\PITZ\\Fileopening\\src\\2.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Ladis\\Documents\\GitHub\\PITZ\\Fileopening\\src\\result.txt");
            Scanner sc1 = new Scanner(fis1, "cp1250");
            Scanner sc2 = new Scanner(fis2, "cp1250");

            while(sc1.hasNextLine()){
                String line1 = sc1.nextLine();
                System.out.println(line1);
                save(line1, fos);
            }
            while(sc2.hasNextLine()){
                String line2 = sc2.nextLine();
                System.out.println(line2);
                save(line2, fos);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    private static void save(String x, FileOutputStream fos){
        byte[] contentInBytes = x.getBytes();
        try {
            fos.write(contentInBytes);
            fos.write(System.getProperty("line.separator").getBytes());
            fos.flush();
        }
        catch (IOException e){
            System.out.println("Failed IOException");
        }
    }
}
