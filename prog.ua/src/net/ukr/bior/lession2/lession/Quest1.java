package net.ukr.bior.lession2.lession;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Igor on 24.06.2017.
 */
public class Quest1 {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number " + (i + 1));
            mass.add(sc.nextInt());
        }
        int max = mass.stream().max(Integer::compareTo).get();
        System.out.println(max);

//Integer max = mass.stream().max((a,b)->(a-b));

    }

    static int max(int maxA, int maxB) {
        if (maxA > maxB) {
            return maxA;
        } else {
            return maxB;
        }
    }
}

/*
    } public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Input number "+(i+1));
            mass.add(sc.nextInt());
        }
        int massMax=mass.get(0);
        for (int i = 0; i < mass.size(); i++) {
            massMax= max(massMax,mass.get(i));
        }
        System.out.println(massMax);

    }
    static int max(int maxA,int maxB){
        if (maxA>maxB){
                return maxA;
        } else {
            return maxB;
        }


    }


}*/
