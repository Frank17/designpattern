/**
 * 
 */
package io.designpattern.demos.simplefactorypattern;

/**
 * 工厂接口
 * @author Frank
 *
 */
public interface Factory {

	/**
	 * 创建产品工厂
	 * @return 产品实例
	 */
	public Product getProduct();
	
}
