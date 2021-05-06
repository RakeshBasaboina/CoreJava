package multi;

public class Sample extends Thread
{
	@Override
	public void run()
	{
		walk();
	}
public void walk()
{
	System.out.println("walk to kphb");
}
}
