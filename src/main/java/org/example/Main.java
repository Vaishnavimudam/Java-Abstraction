
import java.util.*;
abstract class Employee
{
    abstract void calculatesalary();
    public void showdetails()
    {
        System.out.println("Show details:");
    }
}
class Fulltime extends Employee{
    public void calculatesalary() {
        System.out.println("Salary:50,000");
    }
}
class PartTime extends Employee{
    public void calculatesalary(){
        int n=4;
        System.out.println("Salary:"+n*500);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee emp=new Fulltime();
        Employee emp2=new PartTime();
        emp.showdetails();
        String  employee_name=sc.next();
        int id=sc.nextInt();
        emp.calculatesalary();
        emp2.calculatesalary();
    }
}
