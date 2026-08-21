class Employee {
    String name; int salary;
    Employee(String n, int s) { name = n; salary = s; }
    Employee(Employee e) { name = e.name; salary = e.salary; }
    public static void main(String[] args) {
        Employee e1 = new Employee("Kumar",30000), e2 = new Employee(e1);
        System.out.println("Original: " + e1.name + " " + e1.salary);
        System.out.println("Copy: " + e2.name + " " + e2.salary);
    }
}