/**
 * 
 */
package io.designpattern.demos.absfacmethodpattern;

/**
 * 联想手机
 * @author Frank
 *
 */
public class LenovoScreen implements Screen {

	private final static String sign = "Lenovo";
	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Phone#call()
	 */
	public void show() {

		System.out.println(sign + " screen to show!");

	}

}
