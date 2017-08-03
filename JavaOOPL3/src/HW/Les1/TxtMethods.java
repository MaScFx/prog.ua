package HW.Les1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TxtMethods {
    public static File twoTxtToOne(File txt1, File txt2) throws IOException {
        File result = new File("result.txt");
        String txt1String = "";
        String txt2String = "";

        try (BufferedReader f = new BufferedReader(new FileReader(txt1))) {
            String str = "";
            for (; (str = f.readLine()) != null; ) {
                txt1String += str;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader f = new BufferedReader(new FileReader(txt2))) {
            String str = "";
            for (; (str = f.readLine()) != null; ) {
                txt2String += str;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String[] txt1arr = txt1String.split("\\s+");
        String[] txt2arr = txt2String.split("\\s+");
        Set<String> txtResult = new HashSet<>();

        for (String t1 : txt1arr) {
            for (String t2 : txt2arr) {
                if (t1.equals(t2)) {
                    txtResult.add(t1);
                }
            }
        }

        try (PrintWriter a = new PrintWriter(result)) {
            for (String s : txtResult) {
                a.println(s);
            }
        }
        return result;

    }

}
