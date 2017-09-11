package L5.Lesson;

/**
 * Created by Admin on 12.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass<Integer> a = new SomeClass<>(100);
        a.setField(1);

        System.out.println(a);

        Integer[] arrayOne = new Integer[]{0,3,9,2};
        Integer minOne = getMin(arrayOne);
        System.out.println(minOne);

        String[] arrayTwo = new String[]{"Abba", "Cat", "Hello"};
        System.out.println(getMin(arrayTwo));

    }

    static <T extends Comparable<T>> T getMin(T[] array){
        T min = array[0];

        for (T element:array){
            if (min.compareTo(element)>0){
                min=element;
            }
        }
        return min;
    }

    static void print(SomeClass<?> a){
        System.out.println(a);
    }

}
