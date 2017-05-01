
public class car2 {
public static void main(String [] args){
	scooter2 sc = new scooter2();         // dont use just scooter and truck, instead use scooter2 and truck2 because scooter and truck 
											//have become thread in previous example and hence we can not have threads with same name.
	truck2 tr = new truck2();
	Thread t1 = new Thread(sc);
	Thread t2 = new Thread(tr);
	t1.start();

	t2.start();
	
}
}
 class scooter2 implements Runnable{
	public void run(){
		for ( int i =0 ; i<5 ; i++){
		System.out.println("help them even when you know they cant help you back");
		try{Thread.sleep(50);                 // change timings in sleep method 
		} 
		catch (Exception e)
		{ System.out.println(e);
			}
		}
	}
	
}
 class truck2 implements Runnable{										
	 public void run (){
	 for ( int i =0 ; i<5 ; i++){
	
		System.out.println("stay alone and work hard");
		try{Thread.sleep(1500);
		} 
		catch (Exception e)
		{ System.out.println(e);
			}
		}
	}
}
