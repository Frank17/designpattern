package io.designpattern.demos.builderpattern;


/**
 * 钢筋混凝土房子建造者
 * @author Administrator
 * @version 1.0
 * @created 24-����-2017 10:05:14
 */
public class ConcreteHouseBuilder implements Builder {

	private House house = new House();
	
	public ConcreteHouseBuilder(){

	}

	public String buildDoor(){
		house.setDoor("concrete door");
		return house.getDoor();
	}

	public String buildWall(){
		
		house.setWall("concrete wall");
		return house.getWall();
		
	}

	public String buildWindow(){
		
		house.setWindow("concrete window");
		return house.getWindow();
		
	}

	public House getHouse(){

		return house;
		
	}

}