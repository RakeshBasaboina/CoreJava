package Synechronized;

public class Resourse2 extends Thread
{
	CommonResourse cr;
	public Resourse2(CommonResourse cr)
	{
		this.cr=cr;
	}
	@Override
	public void run()
	{
		cr.fun();
	}
}
