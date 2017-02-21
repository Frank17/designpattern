/**
 * 
 */
package io.designpattern.demos.factorypattern;

/**
 * 产品工厂
 * @author Administrator
 *
 */
public class ProductFactory {
	
	public final static int PRODUCT_TYPE_A = 1;
	
	public final static int PRODUCT_TYPE_B = 2;
	
	/**
	 * 由工厂获取一个产品
	 * @param type 产品类别
	 * @return 要得到的产品
	 */
	public final static Product getProduct(int type) {
		if (1 == type) {
			return new ProductA();
		} else if (2 == type) {
			return new ProductB();
		}
		return null;
	}
	
}
