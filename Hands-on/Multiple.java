//WAP to print any multiplication table by using  exception handling and call Thread.Sleep method

package main;

public class Multiple extends Thread // Extending the Thread Class 
{
	public void run()
	{
		try
		{
			for(int i = 1 ; i <= 10 ; i++)
			{
				Thread.sleep(1000);	// sleep method of Thread Class
				System.out.println(i*5);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m = new Multiple();
		m.start();
	}
}
