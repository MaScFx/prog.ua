package net.ukr.bior.lession2;

/**
 * Created by Igor on 24.06.2017.
 */
public class pr2 {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            int sum=0;
            for (int j = 0; j <=15; j++) {
                int number = (int)(Math.random()*90+10);
                System.out.print(number+"\t");
                sum+=number;
            }
            System.out.print(sum);
            System.out.println();
        }
    }
}
