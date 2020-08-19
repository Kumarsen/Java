package hey;
import java.util.*;
public class MathOperation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st no");
		int a = sc.nextInt();
		System.out.println("enter 2nd no");
		int b = sc.nextInt();
		sc.close();
		MathOperation mo = new MathOperation();
		System.out.println("addition of two no");
		mo.display(mo.add(a,b));
		System.out.println("substraction of two no");
		mo.display(mo.sub(a,b));
		System.out.println("multification of two no");
		mo.display(mo.mult(a,b));
		System.out.println("division of two no");
		mo.display(mo.div(a,b));
	}
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	int mult(int a,int b)
	{
		return a*b;
	}
	int div(int a,int b)
	{
		return a/b;
	}
	void display(int a)
	{
		System.out.println(a);
	}
}
