class Car {
    String brand; int price;
    Car() { brand = "Toyota"; price = 1500000; }
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Brand: " + c.brand);
        System.out.println("Price: " + c.price);
    }
}