import java.util.Scanner;  

class demo
{
public static void main(String [] args)
{
//System.out.print("hello");
int x, y, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
sum = sum(x, y);  
System.out.println("The sum of two numbers x and y is: " + sum);  
}  
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;  
}
}