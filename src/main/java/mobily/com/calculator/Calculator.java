package mobily.com.calculator;

public class Calculator {
	public int v1, v2;
	
	Calculator(int a, int b)
	{
		this.v1=a;
		this.v2=b;
	}
	
	public int add()
	{
		return (v1+v2);
	}
	public int substract()
	{
		return (v1-v2);
	}
	public int multiply()
	{
		return (v1*v2);
	}
	public int devide()
	{
		return (v1/v2);
	}
}
