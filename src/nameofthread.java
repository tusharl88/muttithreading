
public class nameofthread {
	public static void main(String [] args) throws Exception
	{
		Thread tomato = new Thread(()->                 
		{
		for ( int i =0 ; i<5 ; i++)
			{
		      System.out.println("help them even when you know they cant help you back");
		      try{Thread.sleep(50);                 
		     } 
		      catch (Exception e)
		      { }
			}
		},"hinameofthread1");    					 // this how naame of thread is done by using comma and name between double quotes.
			
			Thread potato = new Thread(()->                 
			{
				for ( int i =0 ; i<5 ; i++){

					System.out.println("stay alone and work hard");
					try{Thread.sleep(1500);
					} 
					catch (Exception e)
					{}
				}
			},"hellonameofthread2");			// this how naame of thread is done by using comma and name between double quotes.
			
		// NAMING OF THREAD IS DONE TO AVOID CONFUSION WHEN WE ARE USING MULTIPLE THREADS.
		
		
		tomato.start();
		potato.start();
		
		tomato.join();     // join method will execute thread tomato and potato first and stops main thread temporarily and thus bye is printed after some time.
		potato.join();
		System.out.println("bye");   			
		System.out.println(tomato.isAlive());  	
												
	}
}
