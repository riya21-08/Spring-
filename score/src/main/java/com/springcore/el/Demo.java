package com.springcore.el;

import org.springframework.

@Component
public class Demo {

	@Value("#(1+2}")	
	private int x;
	
	@Value("#{5+2}")
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	 
	
	
	
}
