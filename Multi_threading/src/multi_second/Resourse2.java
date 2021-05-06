package multi_second;

public class Resourse2 implements Runnable
{
One oo;
public Resourse2(One oo)
{
	this.oo=oo;
}
@Override
public void run()
{
	oo.fun();
}


}
