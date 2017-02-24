package io.designpattern.demos;

import org.junit.Test;

import io.designpattern.demos.builderpattern.Builder;
import io.designpattern.demos.builderpattern.ConcreteHouseBuilder;
import io.designpattern.demos.builderpattern.Director;
import io.designpattern.demos.builderpattern.House;
import io.designpattern.demos.builderpattern.WoodHouseBuilder;
import junit.framework.TestCase;

public class BuilderTest extends TestCase {

	public void test() {
		
		Director director = new Director();
		
		Builder woodenBuilder = new WoodHouseBuilder();
		
		director.setHouseBuilder(woodenBuilder);
		
		House woodenHouse = director.construct();
		
		System.out.println(woodenHouse);
		
		Builder concreteBuilder = new ConcreteHouseBuilder();
		
		director.setHouseBuilder(concreteBuilder);
		
		House concreteHouse = director.construct();
		
		System.out.println(concreteHouse);
		
	}
	
}
