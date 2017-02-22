/**
 * 
 */
package io.designpattern.demos.simplefactorypattern;

/**
 * 产品A工厂
 * @author Frank
 *
 */
public class ProductAFactory implements Factory {

	/* (non-Javadoc)
	 * @see io.designpattern.demos.simplefactorypattern.Factory#getProduct(int)
	 */
	public Product getProduct() {
		return new ProductA();
	}

}
