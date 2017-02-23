/**
 * 
 */
package io.designpattern.demos.absfacmethodpattern;

/**
 * 小米电视
 * @author Frank
 *
 */
public class MiTelevision implements Television {
	private final static String sign = "MI";
	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Television#play()
	 */
	public void play() {
		
		System.out.println(sign + " television trun on!");

	}

}
