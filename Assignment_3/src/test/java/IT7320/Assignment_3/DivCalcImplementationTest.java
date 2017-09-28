package IT7320.Assignment_3;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class  DivCalcImplementationTest extends TestCase {
	DivCalcImplementation obj;
	int x,y;

	protected void setUp() throws Exception {
		
		obj = new DivCalcImplementation();
		x=7;
		y=2;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.div(x, y)).thenReturn((double)(x/y));
		obj.setDoubleObj(mockObj);
	}

	protected void tearDown() throws Exception {
		obj=null;
		x=0;
		y=0;
			}

	public void  testDivTwoNums() {
		assertEquals (3.0, obj.divTwoNums(x,y));
		
		
	}

}
