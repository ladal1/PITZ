package xloul;


import java.io.File;
import java.util.Scanner;

public class rekurze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vlozte file path");
        String path = sc.nextLine();

        listAll(path);
    }
    private static void listAll(String path){
        System.out.println("\n" + "Obsah " + path);
        File folder = new File(path);
        File[] list = folder.listFiles();

        assert list != null;
        for (File x:list){
            if(x.isFile()){
                System.out.println(x.getName());
            }
            else{
                System.out.println("Slozka - " + x.getName());
                listAll(x.getAbsolutePath());
            }
        }
    }
}
