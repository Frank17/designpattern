/**
 * 
 */
package io.designpattern.demos.simplefactorypattern;

/**
 * 产品B工厂
 * @author Frank
 *
 */
public class ProductBFactory implements Factory {

	/* (non-Javadoc)
	 * @see io.designpattern.demos.simplefactorypattern.Factory#getProduct()
	 */
	public Product getProduct() {
		return new ProductB();
	}

	
}
