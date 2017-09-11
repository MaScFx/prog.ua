package L5.Lesson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 12.08.2017.
 */
public class MainHM {
    public static void main(String[] args) {
        int[] array = genereteArray(10000);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            } else {
                map.put(array[i],map.get(array[i])+1);
            }
        }

    /*    for (int element: array){
            Integer count  = map.get(array);
            if (count==null){
                map.put(element,1);
            }else {
                map.put(element,count+1);
            }
        }*/
        System.out.println(map);

    }
    static int[] genereteArray(int size){
        if (size<0){
            throw new IllegalArgumentException("Size");
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*11);
        }

        return array;
    }
}
