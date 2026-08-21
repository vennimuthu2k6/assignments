class Circle {
    double radius;
    Circle(double radius) { this.radius = radius; }
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + (3.14*c.radius*c.radius));
    }
}