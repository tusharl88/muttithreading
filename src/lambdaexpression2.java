
public class lambdaexpression2 {
	public static void main(String [] args){
		
Thread tomato = new Thread(()->                 //lambda expression placed in place of obj1 because lambda expression is for interface
{												//hence we have ALSO removed runnable interface
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
tomato.start();
potato.start();
}

}



