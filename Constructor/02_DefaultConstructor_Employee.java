class Employee {
    String name; int salary;
    Employee() { name = "Arun"; salary = 25000; }
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }
}