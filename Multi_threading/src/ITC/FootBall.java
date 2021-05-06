package ITC;

//import java.beans.IntrospectionException;

public class FootBall 
{
synchronized public void kick()
{
	try 
	{
	wait();
	
	System.out.println("kick the ball");
	}
	catch(InterruptedException ip)
	
	{
		//System.out.println("exception is caught");
	}
	
}
synchronized public void pass()
{
	System.out.println("pass the ball");
	notify();
}

}
