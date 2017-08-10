package HW;

/**
 * Created by Admin on 10.08.2017.
 */
public class Ship {
    private int Box;
    private String name;

    public Ship(int box, String name) {
        Box = box;
        this.name = name;
    }

    public int getBox() {
        return Box;
    }

    public void setBox(int box) {
        Box = box;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
