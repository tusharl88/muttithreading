
public class nameofthread2 {

		public static void main(String [] args) throws Exception{
		Thread tomato = new Thread(()->                 
		{
		for ( int i =0 ; i<5 ; i++)
			{
		      System.out.println("help them even when you know they cant help you back");
		      try{Thread.sleep(50);                 // change timings in sleep method 
		     } 
		      catch (Exception e)
		      { }
			}
		});
		Thread potato = new Thread(()->                 //()-> is lambda expression 
		{
			for ( int i =0 ; i<5 ; i++){

				System.out.println("stay alone and work hard");
				try{Thread.sleep(1500);
				} 
				catch (Exception e)
				{}
			}
		});
		
		// NAMING OF THREAD IS DONE TO AVOID CONFUSION WHEN WE ARE USING MULTIPLE THREADS.
		
		System.out.println(tomato.getName());          // this gives the name to our thread which is Thread 0.
		System.out.println(potato.getName());          // this gives the name of our thread which is Thread 1.
		
		tomato.setName("tushar");					// this changes the name of our thread from Thread 0 to tushar.
		potato.setName("bansal");                 // this changes the name of our thread from Thread 0 to bansal.
		
		System.out.println(tomato.getName());     // this gives the name to our thread which is Thread 1.
		System.out.println(potato.getName());     // this gives the name to our thread which is Thread 1.
		
		tomato.start();
		potato.start();
		
		tomato.join();     // join method will execute thread tomato and potato first and stops main thread temporarily and thus bye is printed after some time.
		potato.join();
		System.out.println("bye");   			
		System.out.println(tomato.isAlive());  	
												
	}


}
