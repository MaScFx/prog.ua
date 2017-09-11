package Other;

import java.io.File;
import java.util.Scanner;

public class CheckFileMain {
    public static void main(String[] args) {
        File file;
        String nameCheckFile;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of file ");
        nameCheckFile=scanner.nextLine();
        System.out.println("Enter path as \"C:\\\\New folder\\\\\" or \"C:/New folder/");
        file=new File(scanner.nextLine());
        CheckFile checkFile=new CheckFile(nameCheckFile,file);
        checkFile.run();
    }
}
