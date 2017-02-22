package io.designpattern.demos;

import io.designpattern.demos.simplefactorypattern.Factory;
import io.designpattern.demos.simplefactorypattern.Product;
import io.designpattern.demos.simplefactorypattern.ProductAFactory;
import io.designpattern.demos.simplefactorypattern.ProductBFactory;
import junit.framework.TestCase;

public class FactoryMethodPatternTest extends TestCase {

	public void testFactory() {
		
		Factory factoryA = new ProductAFactory();
		
		Factory factoryB = new ProductBFactory();
		
		Product productA = factoryA.getProduct();
		
		Product productB = factoryB.getProduct();
		
		
		productA.doAsProduct();
		
		productB.doAsProduct();
		
	}
	
}
