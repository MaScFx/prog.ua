package net.ukr.bior.Lesson1.HW.part2;

public class Board {
    private Shape[] board = new Shape[4];


    public Board(Shape[] board) {
        this.board = board;
    }

    public Board() {
    }

    public void add(Shape shape, int part){
        if (part < board.length && part >= 0) {
            board[part]=shape;       //!!!
        } else {
            System.out.println("Incorrect part");
        }
    }

    public String info() {
        if (board[0] == null && board[1] == null && board[2] == null && board[3] == null) {
            return "Board is clear";
        }
        String inf = "";
        double area=0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                inf += "Part" + i + " - " + board[i].toString() + ",  area - "+board[i].getArea()+ "\n";
                area+=board[i].getArea();
            } else {
                inf += "Part" + i + " - is clear\n";
            }
        }
        inf+="Total area - "+area+"\n";
        return inf;
    }

    public void move(int from, int where) {
        if (from < board.length && from >= 0 && where < board.length && where >= 0 && from != where) {
            Shape temp = board[from];
            board[from] = board[where];
            board[where] = temp;
        } else {
            System.out.println("Incorrect parts");
        }
    }

    public void remove(int part) {
        if (part < board.length && part >= 0) {
            board[part] = null;
        } else {
            System.out.println("Incorrect part");
        }
    }

    public Shape[] getBoard() {
        return board;
    }

    public void setBoard(Shape[] board) {
        this.board = board;
    }
}

