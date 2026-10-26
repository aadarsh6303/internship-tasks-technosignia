import java.util.Scanner;
class ReverseNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number: ");
int n = sc.nextInt();
int reverse = 0;
while (n != 0)
{
int k = n % 10 ;
reverse = reverse * 10 + k;
n = n / 10;
}
System.out.println("Reversed number: " +reverse);
}
}