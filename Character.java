package animation;

public class Character {
		private int ID;  
		private int blood;
		private int defence;
		private int speed;
		private byte type;//0=water 1=fire 2=grass
		private int skillCD;
		private int x;
		private int y;
		private boolean SkillUse = false; //Can use skill or not
		private char[] bag = {'n','n'}; //n=empty
		private int BagCapacity = 0; //How many things in the bag
		private int[] status = new int[6];//看有幾種狀態 存01確認是否有狀態即可
	
		Character(int PlayerID ,int PlayerBlood ,int PlayerDefence ,int PlayerSpeed ,byte PlayerType ,int PlayerSkillCD)
		{
			ID = PlayerID;
			blood = PlayerBlood;
			defence = PlayerDefence;
			speed = PlayerSpeed;
			type = PlayerType;
			skillCD = PlayerSkillCD;
			
			//random create the position x&y
			x = (int)(Math.random() * 1000);
			y = (int)(Math.random() * 1000);
			
			//*********************
			//should not produce on obstacle
		}
		
		public int GetID(){
			return ID;
		}
		public void SetBlood(int BloodNew){
			blood = BloodNew;
		}
		public int GetBlood(){
			return blood;
		}
		public void SetDefence(int DefenceNew){
			defence = DefenceNew;
		}
		public int GetDefence(){
			return defence;
		}
		public void SetSpeed(int SpeedNew){
			speed = SpeedNew;
		}
		public int GetSpeed(){ //do not need?
			return speed;
		}
		public void SetStatusOn(int number){
			status[number]=1;
		}
		public void SetStatusOff(int number){
			status[number]=0;
		}
		public int GetStatus(int number){ 
			return status[number];
		}
		public void SetX(int XNew){
			x = XNew;
		}
		public int GetX(){ 
			return x;
		}
		public void SetY(int YNew){
			y = YNew;
		}
		public int GetY(){ 
			return y;
		}
		public void SetSkillUse(boolean SkillUseNew){
			SkillUse = SkillUseNew;
		}
		public boolean GetSkillUse(){ 
			return SkillUse;
		}
		public char GetBag(int number)
		 {
			return bag[number];
		 }
		 public void SetBag(char thing)
		 {
			 if(bag[0]==' ')
			 {
				 bag[0]=thing;
			 }
			 else if(bag[1]==' ')
			 {
				 bag[1]=thing;
			 }
			 //else
			 //the bag is full
		 }
		 public void DeleteBag(int number)
		 {
			 bag[number]=' ';
		 }		
	}