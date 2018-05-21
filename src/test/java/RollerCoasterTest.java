import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Loop D Loop", 15.00,15, 120);
    }

    @Test
    public void hasName(){
        assertEquals("Loop D Loop", rollerCoaster.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(15.00, rollerCoaster.getPrice(), 0.01);
    }

    @Test
    public void hasAge(){
        assertEquals(15, rollerCoaster.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(120, rollerCoaster.getHeight());
    }
}

