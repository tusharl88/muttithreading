
public class joinandalive {
	public static void main(String [] args) throws Exception
	{
		
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
		
		System.out.println(tomato.getName());
		System.out.println(potato.getName());
		tomato.setName("tushar");
		potato.setName("bansal");
		System.out.println(tomato.getName());
		System.out.println(potato.getName());
		
		tomato.start();
		potato.start();
		
		tomato.join();     // join method will execute thread tomato and potato first and stops main thread temporarily and thus bye is printed after some time.
		potato.join();
		System.out.println("bye");   			// bye is printed due to main thread.
		System.out.println(tomato.isAlive());  	// isalive method whether our thread is Alive or not. since join method gets executed 
												//and our thread tomato is died hence it return false which gets printed.
		
		// THUS CLEARLY IN ONE PROCESS WE HAVE MANY THREADS LIKE main, thread potato and tomato i.e . many SUB PROCESSES in one process.
		}

		}






