package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class TrigMorph extends Polymorph {
	protected int width = 50;
	protected int height = 50;
double i = 0;
	protected int getwidth() {
		return width;
	}

	protected int getheight() {
		return height;
	}

	void setwidth() {
		this.width = width;
	}

	void setheight() {
		this.height = height;
	}

	TrigMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}
public void update() {
	super.update();
	y+=Math.cos(i);
	x+=Math.sin(i);
	i+=(Math.PI/180)*10;
	
}
}