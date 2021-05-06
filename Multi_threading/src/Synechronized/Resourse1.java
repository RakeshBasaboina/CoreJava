package Synechronized;

public class Resourse1 extends Thread
{
	CommonResourse cr;
	public Resourse1(CommonResourse cr)
	{
		this.cr=cr;
	}
	@Override
	public void run()
	{
		cr.walk();
	}
}
