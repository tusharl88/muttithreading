
public class car3 {
	public static void main(String [] args){
	// here Runnable is example of anonymous class object not the object of Runnable interface /
		
			Runnable obj1= new Runnable()//though its name is similar to Runnable interface.
			{      	
				public void run(){               // run is the method of Runnable interface which is overrided here .
				for ( int i =0 ; i<5 ; i++){
					System.out.println("help them even when you know they cant help you back");
					try{Thread.sleep(50);                 // change timings in sleep method 
						} 
				catch (Exception e)
						{ }
					}
				}
			};
Runnable obj2= new Runnable(){										
public void run (){
for ( int i =0 ; i<5 ; i++){

System.out.println("stay alone and work hard");
try{Thread.sleep(1500);
} 
catch (Exception e)
{}
}
}
};
Thread tomato = new Thread(obj1);
Thread potato = new Thread(obj2);
tomato.start();
potato.start();
}

}
