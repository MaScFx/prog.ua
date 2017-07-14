package net.ukr.bior.Lesson4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * Created by Igor on 08.07.2017.
 */
public class L1 {
    public static void main(String[] args) {
//        long t=  12312313135412L; //с первого января 1970 года
        Date date = new Date();
        SimpleDateFormat sdfOne= new SimpleDateFormat("'Today is ' - dd MMMM yyyy");  //sadas
        SimpleDateFormat sdfTwo= new SimpleDateFormat("dd MM yyyy");  //sadas
        Scanner sc= new Scanner(System.in);
        System.out.println("Input date - dd MM yyyy");
        String textDate = sc.nextLine();

        try {                                   //исключения
            date = sdfTwo.parse(textDate);
        }catch (ParseException e){
            e.printStackTrace();
        }

        String text = sdfOne.format(date);

        System.out.println(text);
        System.out.println(date.getTime());


    }
}
