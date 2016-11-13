package animation;

import java.util.Timer;
import java.util.TimerTask;





public class skill {
	
	
	public void skill1(Character c1)     
	{
		Timer timer = new Timer();
		
		int saverun=0;
		switch(c1.GetID()) { 
		  	case 1: 
		  		saverun=c1.GetSpeed();
		  		c1.SetSpeed(1); 
		  		timer.schedule(new TimerTask() {  
		            @Override  
		            public void run() {  
		               c1.SetSpeed(saverun);
		            }  
		        }, 7000);   
		  		
		  		
		      		break;
		      		
		  	case 2: 
		  		c1.SetBlood(c1.GetBlood()+10); 
		      		break; 
		      	
		  	case 3: 
		      	saverun=monster.GetSpeed();
		      	monster.SetSpeed(0);
		      	timer.schedule(new TimerTask() {  
		            @Override  
		            public void run() {  
		            	monster.SetSpeed(saverun);
		            }  
		        }, 2000); 
		      	Thread.sleep(2000);
		  		
		  		break;
		  		
		  	case 4:
		  		saverun=c1.GetSpeed();
		  		c1.SetSpeed(c1.GetSpeed()+2);
		  		timer.schedule(new TimerTask() {  
		            @Override  
		            public void run() {  
		               c1.SetSpeed(saverun);
		            }  
		        }, 2000);  
		  		
		  		
		  		break;
		  		
		  	case 5:
		  		
		  		//delete monster??
		  		break;
		  		
		  	case 6:
		  		
		  		saverun=monster.GetSpeed();
		  		monster.SetSpeed(0);
		  		timer.schedule(new TimerTask() {  
		            @Override  
		            public void run() {  
		            	monster.SetSpeed(saverun);
		            }  
		        }, 5000); 
		  		
		  		
		  		break;
	  }
	
	
	}
}

	

	
	

	

