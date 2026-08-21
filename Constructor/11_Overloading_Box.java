class Box {
    int length, breadth, height;
    Box() { length = breadth = height = 1; }
    Box(int l, int b) { length = l; breadth = b; height = 1; }
    Box(int l, int b, int h) { length = l; breadth = b; height = h; }
    public static void main(String[] args) {
        Box b1 = new Box(), b2 = new Box(10,20), b3 = new Box(10,20,30);
        System.out.println("Volume 1: " + (b1.length*b1.breadth*b1.height));
        System.out.println("Volume 2: " + (b2.length*b2.breadth*b2.height));
        System.out.println("Volume 3: " + (b3.length*b3.breadth*b3.height));
    }
}