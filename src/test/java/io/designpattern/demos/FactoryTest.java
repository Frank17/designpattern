/**
 * 
 */
package io.designpattern.demos;

import io.designpattern.demos.factorypattern.Product;
import io.designpattern.demos.factorypattern.ProductFactory;
import junit.framework.TestCase;

/**
 * 产品工厂测试类
 * @author Administrator
 *
 */
public class FactoryTest extends TestCase {

	public void testFactory() {
		Product product = ProductFactory.getProduct(ProductFactory.PRODUCT_TYPE_A);
		
		product.doAsProduct();
		
		product = ProductFactory.getProduct(ProductFactory.PRODUCT_TYPE_B);
		product.doAsProduct();
	}
	
}
