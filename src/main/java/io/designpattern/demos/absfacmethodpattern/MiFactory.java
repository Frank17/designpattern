/**
 * 
 */
package io.designpattern.demos.absfacmethodpattern;

/**
 * 小米工厂
 * @author Frank
 *
 */
public class MiFactory implements Factory {

	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Factory#createTelevision()
	 */
	public Television createTelevision() {
		return new MiTelevision();
	}

	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Factory#createPhone()
	 */
	public Screen createScreen() {
		return new MiScreen();
	}

}
