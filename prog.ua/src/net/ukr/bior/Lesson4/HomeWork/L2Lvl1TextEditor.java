package net.ukr.bior.Lesson4.HomeWork;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Administrator on 12.07.2017.
 */
public class L2Lvl1TextEditor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text="";
        String tempText;
        while (true){
            System.out.println("Enter text or enter word 'exit'");
            tempText= sc.nextLine();
            if (tempText.equals("exit")){
                break;
            }
            text+=tempText+"\n";
        }
        File file=new File("TextEditor.txt");
        textToFile(text,file);


    }

    public static void textToFile(String text, File file){
        try (PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
