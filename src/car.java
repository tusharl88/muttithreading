
public class car {
public static void main(String [] args){
	scooter sc = new scooter();
	truck tr = new truck();
	sc.start();
	try{Thread.sleep(50);                 // change timings in sleep method 
	} 
	catch (Exception e){}
	tr.start();
	
}
}
 class scooter extends Thread{
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
 class truck extends Thread{										 //double click thread
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