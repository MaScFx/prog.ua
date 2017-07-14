package net.ukr.bior.Lesson4.HomeWork;

import java.io.File;

public class L2Lvl1Folder {
    public static void main(String[] args) {
        File folder = new File("D:/");
        System.out.println(getFolderInfo(folder));
    }

    public static String getFolderInfo(File folder){
        StringBuilder sb = new StringBuilder();
        File [] files = folder.listFiles();
        for (File file:files){
             if (!file.isFile()) {
                 sb.append(file.getName());
                 sb.append(System.lineSeparator());
             }
        }
        return sb.toString();
    }
}
