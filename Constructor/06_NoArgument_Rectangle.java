class Rectangle {
    int length, breadth;
    Rectangle() { length = 10; breadth = 5; }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Length: " + r.length);
        System.out.println("Breadth: " + r.breadth);
        System.out.println("Area: " + (r.length * r.breadth));
    }
}