package multi;

public class Demo extends Thread
{
	@Override
		public void run()
		{
			jump();
		}
	public void jump()
	{
		System.out.println("jump from building");
	}

}
