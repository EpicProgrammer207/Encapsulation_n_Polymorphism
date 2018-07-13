package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    Polymorph redPoly;
    Polymorph bluePoly;
    Polymorph moveMorph;
    Polymorph circleMan;
    Polymorph MouseMan;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	//The following line contains a dead meme. 
    	//Please be careful as dead memes are know to cause brain cancer.
    	window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(900, 600));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.addMouseListener(this);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 bluePoly = new BluePolymorph(425, 425);
   	 redPoly = new RedMorph(100, 100);
   	 moveMorph = new MovingMorph(150,150);
   	 circleMan = new TrigMorph(500, 500);
   	 MouseMan = new MouseMorph(200, 200);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 3000, 1500);
   	
   	 //draw polymorph
   	 bluePoly.draw(g);
   	 redPoly.draw(g);
   	 moveMorph.draw(g);
   	 circleMan.draw(g);
   	 MouseMan.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 bluePoly.update();
   	 redPoly.update();
   	 moveMorph.update();
   	 circleMan.update();
   	 MouseMan.update();
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(MouseInfo.getPointerInfo().getLocation().x>400 && MouseInfo.getPointerInfo().getLocation().x<450 && MouseInfo.getPointerInfo().getLocation().y>400 && MouseInfo.getPointerInfo().getLocation().y < 450) {
			System.out.println("YEEEEEEEEEEEEEEEEEEETTTTTTTTTTTTT");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
