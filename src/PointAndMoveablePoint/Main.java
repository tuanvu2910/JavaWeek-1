package PointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point newPoint = new Point(1.1f,1.5f);
        MoveablePoint Move = new MoveablePoint(1.1f,1.5f,0.1f,0.2f);
        System.out.println(Move.move());
    }
}
