import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rect(4, 2, 3);
        System.out.println("Периметр треугольника = " + rect.perimeter());
        System.out.println("Площадь треугольника = " + rect.area());
        Shape square = new Square(5);
        System.out.println("Периметр квадрата = " + square.perimeter());
        System.out.println("Площадь квадрата = " + square.area());
        Shape circle = new Circle(30);
        System.out.println("Периметр круга = " + circle.perimeter());
        System.out.println("Площадь круга = " + circle.area());
        Shape[] shapes = {rect, square, circle};
        Arrays.sort(shapes);
        System.out.println("Самая большая площадь = " + Math.round(findBiggestArea(shapes) * 100d) / 100d);
        double areaValue = findBiggestArea(shapes);
    }

    public static double findBiggestArea(final Shape[] s) {
        double tmp = s[0].area();

        for (int i = 1; i < s.length; i++) {
            if (s[i].area() > tmp) tmp = s[i].area();
        }
        return tmp;
    }
}

