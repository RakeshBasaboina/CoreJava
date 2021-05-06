package ITC;

public class Player2 extends Thread
{
FootBall fb;
public Player2(FootBall fb)
{
	this.fb=fb;
}
@Override
public void run()
{
	fb.pass();
}
}
