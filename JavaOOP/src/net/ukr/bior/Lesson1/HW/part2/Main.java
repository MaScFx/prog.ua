package net.ukr.bior.Lesson1.HW.part2;

public class Main {
    public static void main(String[] args) {
        System.out.println("2");
        Point a = new Point(2, 3);
        Point b = new Point(3, 3);
        Point c = new Point(4, 2);


        Triangle tr = new Triangle(a, b, c);
        System.out.println("Area triangle = " + tr.getArea());
        System.out.println("Perimetr triangle = " + tr.getPerimetr());
//
        Point d = new Point(0, 0);
        Point e = new Point(0, 3);
        Point f = new Point(3, 0);
        Square sq = new Square(b, d, e, f);
        System.out.println("Area square = " + sq.getArea());
        System.out.println("Perimetr square = " + sq.getPerimetr());

        Circle cr = new Circle(d, 4);
        System.out.println("Area circle = " + cr.getArea());
        System.out.println("Perimetr circle = " + cr.getPerimetr());
        System.out.println("_____________________");
        Board board= new Board();
        System.out.println(board.info()+"\n");

        board.add(tr,0);
        System.out.println(board.info());
        board.add(sq,1);
        board.add(cr,2);
        System.out.println(board.info());
        board.move(1,2);
        board.remove(2);
        System.out.println(board.info());


    }
}
