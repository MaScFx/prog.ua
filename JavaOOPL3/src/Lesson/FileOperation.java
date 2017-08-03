package Lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Admin on 29.07.2017.
 */
public class FileOperation {
    public static void fileCopy(File in, File out) throws IOException {
        if (in == null || out == null) {
            throw new IllegalArgumentException("Null file pointer");
        }
        try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(out)) {
            byte[] bufferArray = new byte[1024 * 1024];
            int readByte = 0;
            for (; (readByte = fis.read(bufferArray)) > 0; ) {
                fos.write(bufferArray, 0, readByte);
            }
        } catch (IOException e) {
            throw e;
        }


    }
}
