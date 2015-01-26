package com.studio.elephant.level.editor.models;
/**
 * 坐标
 * @author file
 * @since 2015-1-25 下午5:54:10
 * @version 1.0
 */
public class Position {
	private int x;//横坐标
	private int y;//纵坐标
	
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
	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
	
}
