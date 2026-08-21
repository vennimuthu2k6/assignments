class Addition {
    int a, b;
    Addition(int x, int y) { a = x; b = y; }
    public static void main(String[] args) {
        Addition obj = new Addition(10, 20);
        System.out.println("Sum: " + (obj.a + obj.b));
    }
}