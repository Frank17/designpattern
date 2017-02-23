/**
 * 
 */
package io.designpattern.demos.absfacmethodpattern;

/**
 * 工厂接口类
 * @author Frank
 *
 */
public interface Factory {
	/**
	 * 生产电视机
	 * @return 电视机实例
	 */
	public Television createTelevision();
	
	/**
	 * 生产手机
	 * @return 手机实例
	 */
	public Screen createScreen();
	
}
