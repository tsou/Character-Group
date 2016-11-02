package animation;

public class Character {
		private int ID;  
		private int blood;
		private int defence;
		private int speed;
		private char type;
		private int skillCD;
		private int x;
		private int y;
		private boolean SkillUse = false; //Can use skill or not
		private char[] bag = {'n','n'}; //n=empty
		private int BagCapacity = 0; //How many things in the bag
		//status arraylist(???????
	
		Character(int PlayerID ,int PlayerBlood ,int PlayerDefence ,int PlayerSpeed ,char PlayerType ,int PlayerSkillCD)
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
		public int SetBag(char BagNew){
			if(BagCapacity==1)
			{
				bag[BagCapacity]=BagNew;
				BagCapacity++;
				return 2;//there is 2 things in the bag
			}
			else if(BagCapacity==0)
			{
				bag[BagCapacity]=BagNew;
				BagCapacity++;
				return 1;//there is 1 things in the bag
			}
			return 0;//the bag is full
		}
		public void DeleteBag(){
			if(BagCapacity>0)//the bag is not empty
			{
				bag[BagCapacity-1]='n';
				BagCapacity--;
			}
		}
		//*******************************
		public char[] GetBag(){ //return matrix will have risk
			return bag;
		}		
	}