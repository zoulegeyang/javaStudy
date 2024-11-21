import java.time.LocalDate;

class Employee {
    private String name;
    private double salary;
    private int age;
    private LocalDate hireDay;
    public Employee(String name, int a, double s, int y, int m, int d) {
        this.name = name;
        age = a;
        salary = s;
        hireDay = LocalDate.of(y, m, d);
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public void  raiseSalary(int percent) {
        salary = salary + salary * percent / 100;
    }
}