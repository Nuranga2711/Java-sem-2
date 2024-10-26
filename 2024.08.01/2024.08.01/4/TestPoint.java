public class TestPoint {
    public static void main(String[] args) {
        Point P1 = new Point(2,3);
        System.out.println(P1.distance());

        Point P2 = new Point(2,3);
        System.out.println(P2.distance(4, -7));

        System.out.println(P2);
    }

}
