package net.ukr.bior.lession2.lession;

/**
 * Created by Igor on 24.06.2017.
 */
public class Pract1 {
    public static void main(String[] args) {
        //Полная форма
        int ax = 7;
        int bx;
        if (ax>9){
            bx=1;
        } else {
            bx=0;
        }

        //сокращенная форма иф для присвоения
        int a = 5;
        int b = a>9 ? 1:0;
        //int b = (a>9) ? 1:0;

        int aa=10;
        int c;
        if (aa<3){
            c=0;
        } else if(aa<5){
            c=1;
        } else if (aa<7){
            c=2;
        } else {
            c=3;
        }


    }
}
