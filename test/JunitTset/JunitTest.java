package test.JunitTset;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * Junit Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>08/08/2018</pre>
 */
public class JunitTest extends TestCase {
    public JunitTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: add(int a, int b)
     */
    public void testAdd() throws Exception {
//TODO: Test goes here... 
    }


    public static Test suite() {
        return new TestSuite(JunitTest.class);
    }
} 
