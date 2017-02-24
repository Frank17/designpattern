package io.designpattern.demos.builderpattern;


/**
 * 指导者，指导对象构建
 * @author Administrator
 * @version 1.0
 * @created 24-����-2017 10:05:12
 */
public class Director {

	private Builder houseBuilder;

	public Director(){

	}
	public House construct(){
		houseBuilder.buildDoor();
		houseBuilder.buildWall();
		houseBuilder.buildWindow();
		
		return houseBuilder.getHouse();
	}

	/**
	 * @return the houseBuilder
	 */
	public Builder getHouseBuilder() {
		return houseBuilder;
	}

	/**
	 * @param houseBuilder the houseBuilder to set
	 */
	public void setHouseBuilder(Builder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	

}