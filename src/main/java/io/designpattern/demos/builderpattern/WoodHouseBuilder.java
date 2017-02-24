package io.designpattern.demos.builderpattern;


/**
 * 木房子建造者
 * @author Administrator
 * @version 1.0
 * @created 24-����-2017 10:05:13
 */
public class WoodHouseBuilder implements Builder {

	public WoodHouseBuilder(){

	}

	private House house = new House();
	
	public String buildDoor(){
		house.setDoor("wooden door");
		return house.getDoor();
	}

	public String buildWall(){
		
		house.setWall("wooden wall");
		return house.getWall();
		
	}

	public String buildWindow(){
		
		house.setWindow("wooden window");
		return house.getWindow();
		
	}

	public House getHouse(){

		return house;
		
	}

}