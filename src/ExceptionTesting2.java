
 public class ExceptionTesting2 extends Thread {
	
	
	
	
	public void run() 
	{
		
		for(int i=0;i<=5; i++)
		{
			System.out.println("Printer" + i);
			
		}
	}
 }
	
	 class Testing{
	
		 private Testing()
		 {
			 
			 
		 }
		 
		 
	public static void main(String[] args)
	{
		
		ExceptionTesting2 t = new ExceptionTesting2();
		ExceptionTesting2 t1= new ExceptionTesting2();
		t.start();
		t1.start();

		synchronized (t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		for(int i=6 ;i<=10 ;i++)
		{
			
			System.out.println("Printer" + i);
		}
		
	}
	}


