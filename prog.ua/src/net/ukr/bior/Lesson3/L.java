package net.ukr.bior.Lesson3;

import java.util.Arrays;

/**
 * Created by Igor on 01.07.2017.
 */
public class L {
    public static void main(String[] args) {
        int[] arr;
        int arr2[]=new int[5];
        int [] arr3 = {3,5,6,88,3};
        int[] arr4 = new int[]{3,5,6,4,2};
        //ссылка    =   данные
        arr=new int[12];
        System.arraycopy(arr3,0,arr2,0,arr3.length);  //копирование нативный метод
        //
        int[] arrr= new int[10];
        for (int i = 0; i < arrr.length; i++) {
            arrr[i]=i*i;
        }
        System.out.println(Arrays.toString(arrr));  //копирование с 0 по 5
        int[] arrrDubl=Arrays.copyOfRange(arrr,0,5);
        int [] arrrMore= Arrays.copyOf(arrr, 8);
        Arrays.sort(arrrMore); // сортировка

        for(int element:arrr){             //foreach
            System.out.println(element);
        }
        int [][] mass = new int[3][4];

        //String
        String textOne = "Hello";
        String textTwo = "Hello";
        char [] letterArray =  textOne.toCharArray();
        System.out.println(Arrays.toString(letterArray));
        System.out.println(letterArray.toString());
        if (textOne.compareTo(textTwo)==0){
            System.out.println("same");
        }if (textOne.equals(textTwo)){
            System.out.println("same");
        }
        String textTtee = "123,234,432,4342";
        String[] t = textTtee.split("[,]");





    }
}
