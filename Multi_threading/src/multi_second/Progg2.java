package multi_second;

public class Progg2
{
public static void main(String[] args)
{
	One oo=new One();
	Resourse1 r1=new Resourse1(oo);
	Resourse2 r2 = new Resourse2(oo);
	Thread t1=new Thread(r1);
	Thread t2 = new  Thread(r2);
	t1.start();
	t2.start();
	
}
}
