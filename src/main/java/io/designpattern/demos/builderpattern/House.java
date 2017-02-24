package io.designpattern.demos.builderpattern;


/**
 * 房子尸体
 * @author Administrator
 * @version 1.0
 * @created 24-����-2017 10:05:11
 */
public class House {

	private String door;
	private String wall;
	private String window;

	public House(){

	}

	/**
	 * @return the door
	 */
	public String getDoor() {
		return door;
	}

	/**
	 * @param door the door to set
	 */
	public void setDoor(String door) {
		this.door = door;
	}

	/**
	 * @return the wall
	 */
	public String getWall() {
		return wall;
	}

	/**
	 * @param wall the wall to set
	 */
	public void setWall(String wall) {
		this.wall = wall;
	}

	/**
	 * @return the window
	 */
	public String getWindow() {
		return window;
	}

	/**
	 * @param window the window to set
	 */
	public void setWindow(String window) {
		this.window = window;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "House [door=" + door + ", wall=" + wall + ", window=" + window + "]";
	}

	
}