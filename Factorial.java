import java.util.Scanner;
class Factorial
{
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
if (n<0)
{
System.out.println("Factorial is not define for negative numbers");
}
else 
{
long fact = 1;
for (int i = 1; i<=n; i++)
{
fact = fact*i;
}
System.out.println("Factorial : " +fact);
}
}
}