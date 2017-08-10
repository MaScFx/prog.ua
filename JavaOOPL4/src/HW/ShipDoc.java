package HW;

/**
 * Created by Admin on 10.08.2017.
 */
public class ShipDoc extends Thread {
    private Ship ship;
    private boolean free;

    public ShipDoc(Ship ship) {
        this.ship = ship;
        free=false;
    }

    @Override
    public void run() {
        while (true){
            int box = ship.getBox();
            if (box>0){
                ship.setBox(box-1);
                System.out.println("Left cargo on "+ship.getName()+"- "+ship.getBox()+" PC");
            } else {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        free=true;

    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
