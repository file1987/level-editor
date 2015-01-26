package com.studio.elephant.level.editor.models;

/**
 * 关卡初始化数据
 * @author file
 * @since 2015-1-25 下午5:50:56
 * @version 1.0
 */
public class LevelData {
	
	private String id;  //关卡id
	private String background; //背景图
	private int  rows; // 行数
	private int  cols; // 列数 
	private LevelItem[][] items; //数据
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getCols() {
		return cols;
	}
	public void setCols(int cols) {
		this.cols = cols;
	}
	public LevelItem[][] getItems() {
		return items;
	}
	public void setItems(LevelItem[][] items) {
		this.items = items;
	}
	
	
	
}
