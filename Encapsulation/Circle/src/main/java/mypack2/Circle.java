package mypack2;

public class Circle {
    private double radius;
public double getRadius(){
    return radius;
}
public void setRadius(double radius){
    this.radius=radius;
}
public double getArea(){
    return Math.PI*radius*radius;
}
public double getPerimeter(){
    return 2*Math.PI*radius;
}
}
