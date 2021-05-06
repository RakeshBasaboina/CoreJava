package Synechronized;

public class Progg 
{
public static void main(String[] args)
{
	CommonResourse cr=new CommonResourse();
	Resourse1 r1=new Resourse1(cr);
	Resourse2 r2=new Resourse2(cr);
	r1.start();
	r2.start();
}
}
