package io.designpattern.demos;

import io.designpattern.demos.absfacmethodpattern.Factory;
import io.designpattern.demos.absfacmethodpattern.LenovoFactory;
import io.designpattern.demos.absfacmethodpattern.MiFactory;
import io.designpattern.demos.absfacmethodpattern.Screen;
import io.designpattern.demos.absfacmethodpattern.Television;
import junit.framework.TestCase;

public class AbstractFactoryPatternTest extends TestCase{

	public void test() {
		
		Factory lenovoFac = new LenovoFactory();
		
		Television lenovoTv = lenovoFac.createTelevision();
		
		Screen lenovoPhone = lenovoFac.createScreen();
		
		lenovoTv.play();
		
		lenovoPhone.show();
		
		Factory miFac = new MiFactory();
		
		Television miTv = miFac.createTelevision();
		
		Screen miPhone = miFac.createScreen();
		
		miTv.play();
		
		miPhone.show();
		
		
	}
	
}
