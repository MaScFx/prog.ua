package net.ukr.bior.Lesson2.HW.L1;

/**
 * Created by Igor on 24.07.2017.
 */
public class OutOfBoundGroupExeption extends Exception {
    @Override
    public String getMessage() {
        return " Group is FULL!";
    }
}
