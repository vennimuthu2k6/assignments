class Student {
    String name; int age;
    Student() { name = "Vennimuthu"; age = 20; }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}