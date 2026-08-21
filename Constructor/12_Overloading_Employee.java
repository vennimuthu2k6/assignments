class Employee {
    String name; int salary;
    Employee() { name = "Unknown"; salary = 0; }
    Employee(String n) { name = n; salary = 20000; }
    Employee(String n, int s) { name = n; salary = s; }
    public static void main(String[] args) {
        Employee e1 = new Employee(), e2 = new Employee("Ravi"), e3 = new Employee("Kumar",35000);
        System.out.println(e1.name + " " + e1.salary);
        System.out.println(e2.name + " " + e2.salary);
        System.out.println(e3.name + " " + e3.salary);
    }
}