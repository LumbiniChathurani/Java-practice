package mypack2;

public class Main {
    public static void main(String[] args) {
Circle c1 = new Circle();
c1.setRadius(35);
double radius = c1.getRadius();
double area = c1.getArea();
double perimeter = c1.getPerimeter();
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}