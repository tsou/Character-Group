package animation;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChooseCharacter extends JFrame implements ActionListener {
	private JLabel label1 = new JLabel();
	private JFrame demo = new JFrame();
	Button button1, button2, button3;
	String [] Name = {"Yuki","Asuna","Jade","Hao","Hasaki","Sai"};
	int ID = 0;

	public static void main( String args[] )
	{
		ChooseCharacter First = new ChooseCharacter();
		First.Choose();
		
	}
	public void Choose()
	{
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		demo.setBounds(100,100,500,500);
		demo.setLayout(new FlowLayout());
		
		button1 = new Button("previous");
	    button2 = new Button("next");
	    button3 = new Button("OK");
	    button1.setActionCommand("b1");
        button1.addActionListener(this);
        button2.setActionCommand("b2");
        button2.addActionListener(this);
        button3.setActionCommand("b3");
        button3.addActionListener(this);
        
		Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_d_1.png" ) );
	    label1 = new JLabel( image );
	    
	    demo.add(button1);
		demo.add(label1);
		demo.add(button2);
		demo.add(button3);
		demo.setVisible(true); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
        if (cmd == "b1") {
            if(ID==0)
            	ID=5;
            else 
            	ID--;
            Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_d_1.png" ) );
			label1.setIcon(image);
        }
        if (cmd == "b2") {
        	if(ID==5)
        		ID=0;
            else 
            	ID++;
        	Icon image = new ImageIcon( getClass().getResource( Name[ID]+"_d_1.png" ) );
			label1.setIcon(image);
        }
        if (cmd == "b3") {
        	Anima Ani = new Anima();
        	demo.setVisible(false);
    		Ani.Animat(ID);
        }
	}
}