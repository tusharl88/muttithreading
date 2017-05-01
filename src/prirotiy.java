
public class prirotiy {
	public static void main(String [] args) throws Exception{
		Thread tomato = new Thread(()->                 
		{
		for ( int i =0 ; i<5 ; i++)
			{
		      System.out.println("help them even when you know they cant help you back  "+Thread.currentThread().getPriority());
		      try{Thread.sleep(50);                 // change timings in sleep method 
		     } 
		      catch (Exception e)
		      { }
			}
		});
		Thread potato = new Thread(()->                 //()-> is lambda expression 
		{
			for ( int i =0 ; i<5 ; i++){

				System.out.println("stay alone and work hard  "+ Thread.currentThread().getPriority());
				try{Thread.sleep(1500);
				} 
				catch (Exception e)
				{}
			}
		});
		
		System.out.println(tomato.getPriority());
		System.out.println(potato.getPriority());
		
		tomato.setPriority(Thread.MIN_PRIORITY);							//tomato.setPriority(1);
		potato.setPriority(Thread.MAX_PRIORITY);							//potato.setPriority(10);	
																
		
		System.out.println(tomato.getPriority());
		System.out.println(potato.getPriority());
		
		
		tomato.start();
		potato.start();
		
		tomato.join();     // join method will execute thread tomato and potato first and stops main thread temporarily and thus bye is printed after some time.
		potato.join();
		System.out.println("bye");   			
		System.out.println(tomato.isAlive());  	
												
	}


}
