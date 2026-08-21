class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) { length = l; breadth = b; }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 10);
        System.out.println("Area: " + (r.length * r.breadth));
    }
}