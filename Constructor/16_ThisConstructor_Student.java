class Student {
    String name; int age;
    Student(String name, int age) { this.name = name; this.age = age; }
    public static void main(String[] args) {
        Student s = new Student("Vennimuthu",20);
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}