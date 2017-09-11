package HW.Les1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // задание 1
        File from = new File("D:\\download");
        File where = new File("D:\\123");
        try {
            CopyDoc.copyDoc(from,where,"doc");
        }catch (IOException e){
            e.printStackTrace();
        }

        //Задание 2
        File txt1 = new File("D:\\ProjectJava\\1.txt");
        File txt2 = new File("D:\\ProjectJava\\2.txt");
        try {
           TxtMethods.twoTxtToOne(txt1,txt2);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
