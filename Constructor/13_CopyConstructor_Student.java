class Student {
    String name; int age;
    Student(String n, int a) { name = n; age = a; }
    Student(Student s) { name = s.name; age = s.age; }
    public static void main(String[] args) {
        Student s1 = new Student("Arun",20), s2 = new Student(s1);
        System.out.println("Original: " + s1.name + " " + s1.age);
        System.out.println("Copy: " + s2.name + " " + s2.age);
    }
}