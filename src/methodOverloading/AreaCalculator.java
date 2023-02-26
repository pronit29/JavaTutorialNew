package methodOverloading;

public class AreaCalculator {

    public static double area(double radius) {
        double area;
        if(radius < 0) {
            System.out.println(-1.0);
            return -1.0;
        } else {
            area = radius * radius * Math.PI;
            System.out.println("Area of the circle is " + area);
        }
        return area;
    }

    public static double area(double x, double y) {
        double area;
        if(x < 0 || y <0 || (x < 0 && y < 0)) {
            System.out.println(-1.0);
            return -1.0;
        } else {
            area = x * y;
            System.out.println("Area of the rectangle is " + area);
        }
        return area;
    }

    public static void main(String[] args) {

        area(5.0);
        area(-1);
        area(5.0,4.0);
        area(-1.0,4.0);

    }
}
