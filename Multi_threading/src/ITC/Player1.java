package ITC;

public class Player1 extends Thread
{
FootBall fb;
public Player1(FootBall fb)
{
	this.fb=fb;
}
@Override
public void run()
{
	fb.kick();
}
}
