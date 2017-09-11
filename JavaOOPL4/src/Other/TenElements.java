package Other;

import java.util.ArrayList;

public class TenElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        list.remove(0);
        list.remove(0);
        list.remove(list.size()-1);


        System.out.println(list);

    }

}
