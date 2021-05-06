package multi_second;

public class One implements Runnable
{
@Override
public void run() 
{
	walk();
	fun();
}
public void walk()
{
	System.out.println("walk to hostel");
}
public void fun()
{
	System.out.println("run to ground");
}
}
