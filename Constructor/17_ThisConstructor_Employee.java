class Employee {
    String name; int salary;
    Employee(String name, int salary) { this.name = name; this.salary = salary; }
    public static void main(String[] args) {
        Employee e = new Employee("Arun",30000);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }
}