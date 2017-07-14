package net.ukr.bior.Lesson4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Igor on 08.07.2017.
 */
public class L6 {
    public static void main(String[] args) {
        File file = new File("src/net/ukr/bior/Lesson4/L6.java");
        String text = loadStringFromFile(file);
        System.out.println(text);
    }

    public static String loadStringFromFile(File file){
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(file)){
            for (;sc.hasNextLine();) {
                sb.append(sc.nextLine());
                sb.append(System.lineSeparator());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
