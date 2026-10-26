import java.util.ArrayList;
import java.util.Scanner;
class Student 
{
private int rollNo;
private String name;
private int age;
public Student (int rollNo,String name,int age)
{
this.rollNo=rollNo;
this.name=name;
this.age=age;
}
public int getRollNo()
{return rollNo;
}
public void display()
{
System.out.println("Roll No: "+rollNo+"Name: "+name+ "Age: "+age);
}
}
public class Main2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<Student> students = new ArrayList<>();
int choice;
do {
System.out.println(" --- Student Management System ----- ");
System.out.println("1. Add Student");
System.out.println("2. Display All Student");
System.out.println("3. Search by Roll Number");
System.out.println("0 Exit");
System.out.println("Enter choice: ");
choice =sc.nextInt();
sc.nextLine();
switch(choice)
{
case 1:
System.out.println("Roll number:");
int roll = sc.nextInt();
sc.nextLine();
System.out.println("Enter a Name:");
String name = sc.nextLine();
System.out.println("Enter a age: ");
int age = sc.nextInt();
sc.nextLine();
students.add(new Student(roll, name, age));
System.out.println("Student added ");
break;
case 2:
if (students.isEmpty())
{
System.out.println("No Student found");
}
else 
{
for (Student s : students)
{
s.display();
}
}
break;
case 3:
System.out.println("Enter roll number to search: ");
int target = sc.nextInt();
Boolean found  =  false;
for (Student s : students)
{
if (s.getRollNo()== target)
{
s.display();
found=true;
break;
}
}
if (!found)
{
System.out.println("Student not found: ");
}
case 0:
System.out.println("Exiting application:");
break;
default:
System.out.println("Invalid choice");




} 


}while (choice != 0);
}
}