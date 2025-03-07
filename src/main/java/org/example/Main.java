import java.util.*;
/*class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>30)
        System.out.println("Hot");
        else if(n<=30 && n>=20)
        {
            System.out.println("Warm");
        }
        else if(n>=10 && n<20)
        {
            System.out.println("Moderate");
        }
        else {
            System.out.println("cold");
        }
    }
}*/
/*class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x);
        System.out.println("Hello");

    }
}*/
/*class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x+=3);
        System.out.println(x-=3);
        System.out.println(x*=3);
        System.out.println(x/=3);
        System.out.println(x%=3);
        System.out.println(x&=3);
        System.out.println(x|=3);
        System.out.println(x^=3);
        System.out.println(x>>=3);
        System.out.println(x<<=3);
    }
}*/
/*class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
    }
}*/
/*class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==9)
        {
            System.out.println("x is nine");
        }
        else {
            System.out.println("not");
        }
    }
}*/
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