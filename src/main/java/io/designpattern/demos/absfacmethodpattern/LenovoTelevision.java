/**
 * 
 */
package io.designpattern.demos.absfacmethodpattern;

/**
 * 联想电视
 * @author Frank
 *
 */
public class LenovoTelevision implements Television {

	private final static String sign = "Lenovo";
	
	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Television#play()
	 */
	public void play() {
		
		System.out.println(sign + " television trun on!");

	}

}
