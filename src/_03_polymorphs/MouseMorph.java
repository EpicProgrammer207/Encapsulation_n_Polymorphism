package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

import javax.swing.JOptionPane;

public class MouseMorph extends Polymorph {
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

	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}
public void update() {
	super.update();
	x = MouseInfo.getPointerInfo().getLocation().x;
	y = MouseInfo.getPointerInfo().getLocation().y;
	
}
}