package animation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Anima extends JFrame implements Runnable {
	private JLabel label1 = new JLabel();
	private JFrame demo = new JFrame();
	int direct = 0;//0=down stop 1=up 2=down 3=left 4=right 5=up stop 6=left stop 7=right stop
	int act = 0;
	String [] Name = {"Yuki","Asuna","Jade","Hao","Hasaki","Sai"};
	int ID = 0;
	
	public void Animat(int IDset)
	{
	    ID = IDset;
	    
	    switch(ID)
	    {
		    case 1:
		    	Character Yuki=new Character(ID,50,10,4,'w',15);
		    	break;
		    case 2:
		    	Character Asuna=new Character(ID,80,10,3,'w',60);
		    	break;
		    case 3:
		    	Character Jade=new Character(ID,50,10,4,'f',10);
		    	break;
		    case 4:
		    	Character Hao=new Character(ID,40,10,2,'f',10);
		    	break;
	    }
	    
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		demo.setBounds(100,100,500,500);
		Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_d_1.png" ) );
	    label1 = new JLabel( image );
		demo.add(label1);
		demo.setVisible(true); 
		demo.setLayout(null); 
	    demo.addKeyListener(new DirectKey());
	    new Thread(this).start();
	}
	
	public class DirectKey implements KeyListener{
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				direct = 1;
			}
			else if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				direct = 2;			
			}
			else if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				direct = 3;			
			}
			else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				direct = 4;			
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				direct = 5;
			}
			else if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				direct = 0;			
			}
			else if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				direct = 6;			
			}
			else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				direct = 7;			
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}
	
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			if(act==4) act=0;
			if(direct==0)
			{
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_d_1.png" ) );
				label1.setIcon(image);
				act=0;
			}
			else if(direct==1)
			{
				char [] pic={'1','2','1','3'};
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_u_"+pic[act]+".png" ) );
				label1.setIcon(image);
				act++;
			}
			else if(direct==2)
			{
				char [] pic={'1','2','1','3'};
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_d_"+pic[act]+".png" ) );
				label1.setIcon(image);
				act++;
			}
			else if(direct==3)
			{
				char [] pic={'1','2','1','3'};
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_l_"+pic[act]+".png" ) );
				label1.setIcon(image);
				act++;
			}
			else if(direct==4)
			{
				char [] pic={'1','2','1','3'};
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_r_"+pic[act]+".png" ) );
				label1.setIcon(image);
				act++;
			}
			else if(direct==5)
			{
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_u_1.png" ) );
				label1.setIcon(image);
				act=0;
			}
			else if(direct==6)
			{
				char [] pic={'1','2','1','3'};
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_l_1.png" ) );
				label1.setIcon(image);
				act=0;
			}
			else if(direct==7)
			{
				char [] pic={'1','2','1','3'};
				Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_r_1.png" ) );
				label1.setIcon(image);
				act=0;
			}
            
            try {
                Thread.sleep(130);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
	}

	
}
