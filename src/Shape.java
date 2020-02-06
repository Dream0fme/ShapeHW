public abstract class Shape implements Comparable<Shape> {
    public abstract double area();

    public abstract double perimeter();

    @Override
    public int compareTo(Shape s) {
        if (area() > s.area()) return 1;
        if (area() < s.area()) return -1;
        return 0;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Square extends Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return a * 4;
    }
}


class Rect extends Shape {
    double a;
    double b;
    double c;

    public Rect(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter() / 2 * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

}
