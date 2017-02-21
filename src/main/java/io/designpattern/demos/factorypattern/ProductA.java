/**
 * 
 */
package io.designpattern.demos.factorypattern;

/**
 * 产品A
 * @author Administrator
 *
 */
public class ProductA implements Product {

	/* (non-Javadoc)
	 * @see io.designpattern.demos.factorypattern.Product#doAsProduct()
	 */
	public void doAsProduct() {
		System.out.println("it is a product a");
	}

}
