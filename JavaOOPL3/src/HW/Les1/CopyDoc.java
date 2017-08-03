package HW.Les1;

import Lesson.FileOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDoc {
    public static void copyDoc(File from, File where, String extension) throws IOException {
        if (from.isFile() || where.isFile() || from == null || where == null) {
            throw new IllegalArgumentException("it isn`t Directory");
        }
        File[] arr = from.listFiles();
        FileInputStream fis;
        FileOutputStream fos;
        for (File st : arr) {
            if (st.isFile()) {
                String[] name = st.getName().split("\\.");
                if (name[name.length - 1].equals(extension)) {
                    fis = new FileInputStream(st);
                    File file = new File(where.getAbsolutePath() + "/" + st.getName());
                    fos= new FileOutputStream(file);

                    byte[] buffer = new byte[1024];
                    int byteRead = 0;
                    for (; (byteRead = fis.read(buffer)) > 0; ) {
                        fos.write(buffer, 0, byteRead);
                    }
                }
            }
        }


    }
}
