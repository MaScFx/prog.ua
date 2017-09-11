package Lesson;

import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 29.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        File in=new File("D:\\ISO\\StartIsBack 2.0.9_1.7.5 RePack by KpoJIuK\\StartIsBack.v2.0.9_v1.7.5.exe");
        File out = new File("StartIsBack.exe");
        try {
            FileOperation.fileCopy(in,out);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
