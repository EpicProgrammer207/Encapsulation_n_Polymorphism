package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph {
	protected int width = 50;
	protected int height = 50;

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

	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}

}
