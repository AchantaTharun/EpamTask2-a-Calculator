import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {



	//Test cases for addition
	
	@Test
	public void SimpleAddTest(){
        assertEquals(10,Calculator.add(5,5),0.0);
        assertEquals(-3,Calculator.add(-1,-2),0.0);
        assertEquals(9,Calculator.add(9,0),0.0);
    }
	
	
	//Test cases for multiplication
	public void SimpleMulTest(){
        assertEquals(25,Calculator.mul(5,5),0.0);
        assertEquals(2,Calculator.mul(-1,-2),0.0);
        assertEquals(4.5,Calculator.mul(9.0,0.5),0.0);
    }
	
	
	//Test cases for division 
	
	public void SimpleDivTest(){
        assertEquals(1,Calculator.div(5,5),0.0);
        assertEquals(0.5,Calculator.div(1,2),0.0);
        assertEquals(22.2,Calculator.div(66.6,3.0),0.0);
    }
	
}
