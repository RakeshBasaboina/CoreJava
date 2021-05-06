package Thread_Properties;

public class Properties 
{
public static void main(String[] args) 
{
	Thread tt=Thread.currentThread();
	System.out.println(tt.getId());
	System.out.println(tt.getName());
	System.out.println(tt.getPriority());
	System.out.println("///...to change properties");
	tt.setName("rakesh");
	System.out.println(tt.getName());
	tt.setPriority(6);
	System.out.println(tt.getPriority());
}
}
