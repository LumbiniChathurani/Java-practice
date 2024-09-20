package mypack2;

public class Main {
    public static void main(String[] args) {
Employee e1 = new Employee();
e1.setEmployee_id(123);
e1.setEmployee_name("Lumbini");
e1.setEmployee_salary(50000.0);

int employeeId= e1.getEmployee_id();
String employeeName=e1.getEmployee_name();
double employeeSalary=e1.getEmployee_salary();

        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+employeeSalary);
    }
}