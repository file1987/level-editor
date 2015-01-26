package com.studio.elephant.level.editor.models;
/**
 * 关卡表格内单位
 * @author file
 * @since 2015-1-25 下午6:00:40
 * @version 1.0
 */
public class LevelItem {
	
	private String background; //单元的背景图
	private String image;      //显示的图片
	private int value;         //虚拟的标志性值（用于解析判断是否属于同一种图片）
	private Position pos;      //单元坐标
	
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public Position getPos() {
		return pos;
	}
	public void setPos(Position pos) {
		this.pos = pos;
	}
	@Override
	public String toString() {
		return "LevelItem [background=" + background + ", image=" + image + ", value=" + value + ", Position=" + pos +  "]";
	}

}
