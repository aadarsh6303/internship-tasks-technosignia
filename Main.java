class Student 
{
private String name;
private int age; 
public Student (String name, int age)
{
this.name=name;
this.age=age;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
public void setAge(int age)
{
if (age<0)
{
this.age=age;
}
}
public void display()
{
System.out.println("Student: " +name+ "Age" +age);
}
}
class Employee
{
private String name;
private double salary;
public Employee (String name,double salary)
{
this.name=name;
this.salary=salary;
}
public String getName()
{return name;}
public double getSalary()
{return salary;}
public void display()
{
System.out.println("Employee: "+name+ "Salary: "+salary);
}
}
public class Main
{
public static void main (String[] args)
{
Student s = new Student ("Aarav", 20);
Employee e = new Employee ("Neha",350000);
s.display();
e.display();
s.setAge(21);
System.out.println("Updated age:" +s.getAge());
}
}