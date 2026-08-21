class Student {
    String name; int age;
    Student() { name = "Unknown"; age = 0; }
    Student(String n) { name = n; age = 18; }
    Student(String n, int a) { name = n; age = a; }
    public static void main(String[] args) {
        Student s1 = new Student(), s2 = new Student("Arun"), s3 = new Student("Kumar", 21);
        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
    }
}