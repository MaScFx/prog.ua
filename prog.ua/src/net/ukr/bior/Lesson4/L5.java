package net.ukr.bior.Lesson4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

/**
 * Created by Igor on 08.07.2017.
 */
public class L5 {
    public static void main(String[] args) {
        File folder = new File("D:\\games\\WOT");
        String text = getFolderInfo(folder);
        File info= new File("imfo.txt");
        System.out.println(text);
        saveTextToFile(text,info);
//        File file = new File("info.txt");
//        saveTextToFile(text, file);
    }

    public static void saveTextToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getFolderInfo(File folder){
        StringBuilder sb = new StringBuilder();
        File [] files = folder.listFiles();
        for (File file:files){
            String fileName = file.getName();
            String type = file.isFile() ? "File" : "Folder";
            long fileSize = file.length();
            SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
            String fileChangeDate = sdf.format(file.lastModified());

            String result = String.format("%-20.20s\t%-6.6s\t%-12.12s\t%-10.10s", file,type,""+fileSize,fileChangeDate);
            sb.append(result);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
