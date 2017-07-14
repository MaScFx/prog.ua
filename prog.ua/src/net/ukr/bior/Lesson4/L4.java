package net.ukr.bior.Lesson4;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Igor on 08.07.2017.
 */
public class L4 {
    public static void main(String[] args) {
        File fileOne = new File("a.txt");
        try {
            fileOne.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
        File folderTwo = new File("Folder A");
        folderTwo.mkdir();

        File fileTwo = new File(folderTwo, "b,txt");
        try {
            fileTwo.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
        fileTwo.delete();
        folderTwo.delete();

        File folder = new File(".");
        File [] files = folder.listFiles();
        for (File file:files){
            String fileName = file.getName();
            String type = file.isFile() ? "File" : "Folder";
            long fileSize = file.length();
            SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
            String fileChangeDate = sdf.format(file.lastModified());

            String result = String.format("%-20.20s\t%-6.6s\t%-12.12s\t%-10.10s", file,type,""+fileSize,fileChangeDate);
            System.out.println(result);
        }

//        System.out.println(Arrays.toString(files));
    }
}
