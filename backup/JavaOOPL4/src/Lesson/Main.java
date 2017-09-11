package Lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

/**
 * Created by Admin on 05.08.2017.
 */
public class Main {
    static Cat cat2 = null;
    public static void main(String[] args) {


       Ac ac = new Ac(true);
        L1 pushTh = new L1("Push", ac, true);
        L1 PullTh = new L1("Pull", ac, false);

        Thread th1 = new Thread(pushTh);
        Thread th2 = new Thread(PullTh);

        th1.start();
        th2.start();


        //  CAT TEST

//        for (int i = 0; i <1000000 ; i++) {
//            Cat cat1 = new Cat("Vaska", 3 ,"white");
//        }
        System.gc();
        try {
            Thread.sleep(500);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(cat2);

        cat2=null;
    System.gc();
        try {
            Thread.sleep(500);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(cat2);
        Cat cat= new  Cat("umka", 5,"black");
        Cat cat2= new  Cat("umka", 5,"black");
        System.out.println(cat.equals(cat2));
        System.out.println(cat);
        System.out.println(cat2.hashCode());

        Cat cat3=null;
        try {
            cat3=cat.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println(cat3);
        System.out.println(cat3==cat);

        Class catClass = Cat.class;
        Field[] fields = catClass.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f);
        }
        Method[] metods = catClass.getDeclaredMethods();
        for (Method m:metods){
            System.out.println(m);
        }

        try {
            Field ageField = catClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.setInt(cat, 10);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(cat);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"))){
            oos.writeObject(cat);
        }catch (Exception e){

        }

        Cat cat5 = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"))){
            cat5 = (Cat) ois.readObject();
        }catch (Exception e){

        }
        System.out.println(cat5);


    }
}
