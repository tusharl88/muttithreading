
public class lambdaexpression {
	public static void main(String [] args){
		
		
			Runnable obj1= ()->
			{
			for ( int i =0 ; i<5 ; i++)
				{
                  System.out.println("help them even when you know they cant help you back");
                  try{Thread.sleep(50);                 // change timings in sleep method 
                 } 
                  catch (Exception e)
                  { }
				}
			}
			;
			Runnable obj2= ()->                 //()-> is lambda expression 
			{
					for ( int i =0 ; i<5 ; i++){

						System.out.println("stay alone and work hard");
						try{Thread.sleep(1500);
						} 
						catch (Exception e)
						{}
					}
				}
             ;
Thread tomato = new Thread(obj1);
Thread potato = new Thread(obj2);
tomato.start();
potato.start();
}

}

