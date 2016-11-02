public class Monster {
	//immediately position
	protected int x = -1;
	protected int y = -1;
	protected int speed = -1;//run speed
	protected int ID = -1;
	protected int attack = -1;//attack power
	
	
	public int GetID()
	{
		return ID;
	}
	
	public int GetX()
	{
		return x;
	}
	public void SetX(int nowx)
	{
		x=nowx;
	}
	
	public int GetY()
	{
		return y;
	}
	public void SetY(int nowy)
	{
		y=nowy;
	}
	
	public int GetSpeed()
	{
		return speed;
	}
	public void SetSpeed(int nows)
	{
		speed=nows;
	}
	
	public int GetAttack()
	{
		return attack;
	}
	public void SetAttack(int nowa)
	{
		attack=nowa;
	}
	
}