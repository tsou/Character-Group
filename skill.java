
public class skill {
	public void skill(charactar,monster)     
	{
		int saverun=0;
		switch(charactar.GetID) { 
		  	case 1: 
		  		saverun=monster.GetSpeed()
		  		monster.SetSpeed(1); 
		  		Thread.sleep(7000);
		  		monster.SetSpeed(saverun);
		      		break;
		      		
		  	case 2: 
		  		charactar.SetBlood(charactar.GetBlood()+10); 
		      		break; 
		      	
		  	case 3: 
		      	saverun=monster.GetSpeed();
		      	monster.SetSpeed(0);
		      	Thread.sleep(2000);
		  		monster.SetSpeed(saverun);
		  		break;
		  		
		  	case 4:
		  		saverun=charactar.GetSpeed();
		  		charactar.SetSpeed(charactar.GetSpeed()+2);
		  		Thread.sleep(2000);
		  		charactar.SetSpeed(saverun);
		  		break;
		  		
		  	case 5:
		  		
		  		//delete monster??
		  		break;
		  		
		  	case 6:
		  		
		  		saverun=monster.GetSpeed();
		  		monster.SetSpeed(0);
		  		Thread.sleep(5000);
		  		monster.SetSpeed(saverun);
		  		break;
	  }
}
