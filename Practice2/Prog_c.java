package Practice2;

public class Prog_c extends Prog_p1 implements Prog_p {
	public void m5()
	{
		System.out.println("child have a bike");
	}
	public void m6()
	{
		System.out.println("child have a mobile");
	}
	
@Override	
public void m1()
{
	System.out.println("this is interface");
}
@Override
public void m2()
{
	System.out.println("this is interface 2");
}

}
