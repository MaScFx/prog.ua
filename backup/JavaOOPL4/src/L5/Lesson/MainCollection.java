package L5.Lesson;

import java.util.*;

/**
 * Created by Admin on 12.08.2017.
 */
public class MainCollection {
    public static void main(String[] args) {
        List<Integer> listOnde= new ArrayList<>();
        listOnde.add(2);
        listOnde.add(10);
        System.out.println(listOnde);

        listOnde.add(0, 5);
        System.out.println(listOnde);
        listOnde.remove(2);
        System.out.println(listOnde);
        Integer[] array = new Integer[]{2,4,5,66,3,2};
        listOnde.addAll(Arrays.asList(array));
        System.out.println(listOnde);
        for (Integer element : listOnde){
//            System.out.println(element);
        }
//        System.out.println("___________");
        Iterator<Integer> itr=listOnde.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        System.out.println("_______HM_________");

        Map <Integer, String> mapOne = new HashMap<>();
        mapOne.put(3 , "three");
        mapOne.put(5 , "five");
        mapOne.put(1,"One");
        System.out.println(mapOne);

        String text = mapOne.get(1);
        System.out.println(text);

        Set<Integer> keys = mapOne.keySet();
        for (Integer key:keys){
            System.out.println(mapOne.get(key));
        }




    }
}
