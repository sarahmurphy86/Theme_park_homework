import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer adult;
    Customer child;

    @Before
    public void before(){
        adult = new Customer(35, 140, 120.00);
        child = new Customer( 10, 100, 5.50);
    }

    @Test
    public void hasAge(){
        assertEquals( 35, adult.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(100, child.getHeight());
    }

    @Test
    public void hasWallet(){
        assertEquals(5.50, child.getWallet(), 0.01);
    }
}
