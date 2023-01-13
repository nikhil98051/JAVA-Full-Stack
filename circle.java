//1. Create another class named circle, when you construct a new circle , populate the radisu and circle classs must have 2 functions which are getArea() and getPerimeter()
//class circle(){}
//class shape(){}
11-01-23
q1.
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
}

class shape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

    }
}
