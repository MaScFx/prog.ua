package Other;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleCola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        while (true){
            System.out.println("Enter count of cola");
            count=scanner.nextInt();
            if (count>=0)
                break;
        }
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sheldon");
        list.add("Leonard");
        list.add("Volovitc");
        list.add("Kutrapalli");
        list.add("Penny");

        for (int i = 0; i <count  ; i++) {
            String temp = list.get(0);
            list.remove(0);
            list.add(temp);
            list.add(temp);
        }

        System.out.println(list);

    }
}
