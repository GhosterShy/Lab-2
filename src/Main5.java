//5 YAGNI

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}



public class Main5 {
    public static void main(String[] args) {
        Circle circle = new Circle(15);

    }
}

