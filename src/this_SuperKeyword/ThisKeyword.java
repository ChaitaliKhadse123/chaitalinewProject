package this_SuperKeyword;

public class ThisKeyword 
{
	 int a=10; //non static global variable
	 int b=20; //non static global variable
	static int c=30;

	public static void main(String[] args) 
	{
		ThisKeyword t=new ThisKeyword();
		t.test();
		ThisKeyword.test2();

	}
	public void test() // non static method
	{
		int a=100; //non static local variable
		int sum=this.a+1;
		int sum1=a+1;
		System.out.println("sum1 is = "+sum1);
		System.out.println("sum is = "+sum);
		
		int b=8;
		int sum2=this.b+2;
		
		System.out.println("sum2 is = "+sum2);
		
		int sum3=b+2;
		System.out.println("sum3 is = "+sum3);
	
		int c=5;
		int sum4=this.c+5;
		System.out.println("sum4 is ="+sum4);
		
	}
	public static void test2() //static method
	{
		int c=3;
		int sum5=c+3;
		System.out.println("sum5 is = "+sum5);
		
		int sum6=c+3;
		System.out.println("sum6 is ="+sum6);
		
		
	}

}
