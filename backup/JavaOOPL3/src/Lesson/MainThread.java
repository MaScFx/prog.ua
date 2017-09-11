package Lesson;

/**
 * Created by Admin on 29.07.2017.
 */
public class MainThread {
    public static void main(String[] args) {
        Thread th1= new Thread(new FactorialThread(10));
        Thread th2= new Thread(new FactorialThread(10));
        Thread th3= new Thread(new FactorialThread(10));
        Thread th4= new Thread(new FactorialThread(10));
        th1.setDaemon(true);
        th2.setDaemon(true);
        th3.setDaemon(true);
        th4.setDaemon(true);
        th1.start();
        th2.start();
        th3.start();
        th4.start();


//        try {
//            th1.join();
//            th2.join();
//            th3.join();
//            th4.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println("Main is STOP");
    }
}
