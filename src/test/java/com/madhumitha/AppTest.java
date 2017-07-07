package com.madhumitha;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.madhumitha.*;

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
		App app = new App();
		long result = app.add(10, 5);
		assertEquals("The result is equal...", 15, result);
        assertTrue( false );
    }
}
