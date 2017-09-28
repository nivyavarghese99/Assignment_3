package IT7320.Assignment_3;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class SubCalcImplementationTest extends TestCase {
	SubCalcImplementation obj;
	int x, y;

	protected void setUp() throws Exception {
		obj = new SubCalcImplementation();
		x=7;
		y=4;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.sub(x, y)).thenReturn(x-y);
		obj.setIntObj(mockObj);
		
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;
		
	}

	public void testSubTwoNums() {
		assertEquals(3, obj.subTwoNums(x,y));
		
	}

}
