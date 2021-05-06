package multi_second;

public class Resourse1 extends One
{
One oo;
public Resourse1(One oo)
{
	this.oo=oo;
}
//@Override
public void runm()
{
	oo.walk();
}

}
