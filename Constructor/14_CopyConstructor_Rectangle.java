class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) { length = l; breadth = b; }
    Rectangle(Rectangle r) { length = r.length; breadth = r.breadth; }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20), r2 = new Rectangle(r1);
        System.out.println("Original Area: " + (r1.length*r1.breadth));
        System.out.println("Copy Area: " + (r2.length*r2.breadth));
    }
}