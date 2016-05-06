import classes.ExampleClass;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 06.05.16.
 *
 * @author m
 */
public class ExampleClassTest {
    private ExampleClass ec;

    @Before
    public void setUp() throws Exception {
        ec = new ExampleClass();
        System.out.println("setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void succTest() {
        for (int i = -1000; i < 1000; i++) {
            int succ = ec.succ(i);
            Assert.assertEquals(i + 1, succ);
        }
    }

}