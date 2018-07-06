package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;

	protected int getx() {
		return x;
	}

	protected int gety() {
		return y;
	}

	void setx() {
		this.x = x;
	}

	void sety() {
		this.y = y;
	}

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
