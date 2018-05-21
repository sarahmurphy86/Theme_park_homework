import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogFlumeTest {

    LogFlume logflume;

    @Before
    public void before(){
        logflume = new LogFlume("Wet and wild", 12.00,10, 120);
    }

    @Test
    public void hasName(){
        assertEquals("Wet and wild", logflume.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(12.00, logflume.getPrice(), 0.01);
    }

    @Test
    public void hasAge(){
        assertEquals(10, logflume.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(120, logflume.getHeight());
    }
}
