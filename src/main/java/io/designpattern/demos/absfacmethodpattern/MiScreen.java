/**
 * 
 */
package io.designpattern.demos.absfacmethodpattern;

/**
 * 小米手机
 * @author Frank
 *
 */
public class MiScreen implements Screen {

	private final static String sign = "MI";
	
	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Phone#call()
	 */
	public void show() {
		
		System.out.println(sign + " screen to show!");

	}

}
