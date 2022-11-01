package dorsey;

public class BCD 
{
	public void m1()
	{
		System.out.println("DEFAULT METHOD");
		this.m3(0, 0, 0);
	}
	public void m2(int a)
	{
		System.out.println("ONE PARAMETRIZED METHOD");
	}
	public void m2(int a,int b)
	{
		System.out.println("TWO PARAMETRUZED METHOD");
	}
	public void m3(int a,int b,int c)
	{
		System.out.println("THREE PARAMETRUZED METHOD");
	}
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("FOUR PARAMETRUZED METHOD");
	}
	public static void main(String[] args)
	{
		BCD x=new BCD();
		x.m1();
		x.m2(1);
		x.m4(1, 3, 6, 8);

}
}