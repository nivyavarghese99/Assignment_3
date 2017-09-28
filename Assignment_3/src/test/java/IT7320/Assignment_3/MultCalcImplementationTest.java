package IT7320.Assignment_3;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class MultCalcImplementationTest extends TestCase {
	MultCalcImplementation obj;
	int x, y;
	

	protected void setUp() throws Exception {
		obj = new MultCalcImplementation();
		x=3;
		y=4;
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.mult(x, y)).thenReturn(x*y);
		obj.setIntObj(mockObj);
		
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;
	
	
	}

	public void testMultTwoNums() {
		assertEquals(12,obj.multTwoNums(x,y));
		
	}

}
