package test;

import java.util.Scanner;

public class Test {

        public static void getGpoint(Point p1, Point p2, Point p3) {
                double x = (double) (p1.getX() + p2.getX() + p3.getX()) / 3;
                double y = (double) (p1.getY() + p2.getY() + p3.getY()) / 3;

                x = Math.round(x * 10) / 10;
                y = Math.round(y * 10) / 10;

                System.out.println(x + ", " + y);
        }

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                Point p1 = new Point(scanner.nextInt(), scanner.nextInt());
                Point p2 = new Point(scanner.nextInt(), scanner.nextInt());
                Point p3 = new Point(scanner.nextInt(), scanner.nextInt());

                scanner.close();

                getGpoint(p1, p2, p3);
        }
}

class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
                this.x = x;
                this.y = y;
        }

        public int getX() {
                return this.x;
        }

        public int getY() {
                return this.y;
        }

        public void getGpoint(Point p1, Point p2, Point p3) {
                double x = (double) (p1.x + p2.x + p3.x) / 3;
                double y = (double) (p1.y + p2.y + p3.y) / 3;

                x = Math.round(x * 10) / 10;
                y = Math.round(y * 10) / 10;

                System.out.println(x + ", " + y);
        }
}
