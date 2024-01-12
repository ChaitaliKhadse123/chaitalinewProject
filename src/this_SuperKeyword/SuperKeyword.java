package this_SuperKeyword;

public class SuperKeyword extends ThisKeyword
{
	 int a=1000;
	
	public static void main(String[] args)
	{
//		SuperKeyword s=new SuperKeyword();
//		s.test3();


	}
	public   void test3() //non static method
	{
		int a=999; //local non static variable from sub class
		int sum=a+100;
		System.out.println("test3 subclass sum is ="+sum);
		
		int sum1=this.a+100;
		System.out.println("test3 subClass "+sum1);
		
		int sum2=b+100;//used global value of b from super class
		System.out.println(sum2);
		
		int sum3=super.a+100; //used global value of a from super class
		System.out.println(sum3);
		
		int sum4=super.c+1;
		System.out.println(sum4);
	}

}
