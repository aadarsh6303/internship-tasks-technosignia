class Person {
 private String name;
 public Person(String name) { this.name = name; }
 public String getName() { return name; }
}
class Student extends Person {
 private int rollNo;
 public Student(String name, int rollNo) {
 super(name);
 this.rollNo = rollNo;
 }
 public void display() {
 System.out.println("Name: " + getName());
 System.out.println("Roll Number: " + rollNo);
 }
}
public class Main3 {
 public static void main(String[] args) {
 Student s = new Student("Aarav", 101);
 s.display();
 }
}
