package HW;

/**
 * Created by Admin on 10.08.2017.
 */
public class ShipUnload {
    public static void main(String[] args) {
        Ship ship1 = new Ship( 10,"ship1");
        Ship ship2 = new Ship(10,"ship2");
        Ship ship3 = new Ship(10,"ship3");

        ShipDoc doc1= new ShipDoc(ship1);
        ShipDoc doc2 = new ShipDoc(ship2);
        doc1.start();
        doc2.start();

        while (true){
            if (doc1.isFree()){
                doc1.setShip(ship3);
                doc1.run();
                break;
            } else if (doc2.isFree()){
                doc2.setShip(ship3);
                doc2.run();
                break;
            } else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
