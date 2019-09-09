package mobily.com.calculator;

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
    public void testApp1()
    {
    	Calculator c= new Calculator(10,20);
        assertTrue(c.add()==30);
    }
    
    public void testApp2()
    {
    	Calculator c= new Calculator(10,20);
        assertTrue(c.substract()==30);
    }
    public void testApp3()
    {
    	Calculator c= new Calculator(10,20);
        assertTrue(c.multiply()==200);
    }
    public void testApp4()
    {
    	Calculator c= new Calculator(10,20);
        assertTrue(c.devide()==20);
    }
}

