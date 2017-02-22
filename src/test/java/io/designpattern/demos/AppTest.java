package io.designpattern.demos;

import java.text.DateFormat;
import java.text.Format;
import java.util.Date;
import java.util.Locale;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);
    	
    	String year = format.format(new Date());
    	
    	System.out.println(year);
    	
        assertTrue( true );
    }
    
}
