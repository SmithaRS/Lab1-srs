 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

  private FizzBuzz fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzBuzz();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

@Test
  public void testNegativeTen(){
  assertNull(fixture.fizzBuzz(-10));

}

@Test
    public void testNegativeOne(){
        assertNull(fixture.fizzBuzz(-1));

    }

    @Test
    public void testZero(){
        assertNull(fixture.fizzBuzz(0));

    }
    @Test
    public void testOne(){
        assertNull(fixture.fizzBuzz(1));

    }

    @Test
    public void testSeven(){
        assertNull(fixture.fizzBuzz(7));

    }

    @Test
    public void testSeventeen(){
        assertNull(fixture.fizzBuzz(17));

    }
}
