/**
 * 
 */
package io.designpattern.demos.absfacmethodpattern;

/**
 * 联想工厂
 * @author Frank
 *
 */
public class LenovoFactory implements Factory {

	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Factory#createTelevision()
	 */
	public Television createTelevision() {
		
		return new LenovoTelevision();
	}

	/* (non-Javadoc)
	 * @see io.designpattern.demos.absfacmethodpattern.Factory#createPhone()
	 */
	public Screen createScreen() {
		return new LenovoScreen();
	}

	
	
}
