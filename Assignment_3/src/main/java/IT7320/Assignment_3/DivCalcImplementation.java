package IT7320.Assignment_3;

public class DivCalcImplementation {
	
	CalcInterface IntObj;
	public double divTwoNums(int m, int n)
	{
		return IntObj.div(m, n);
	}
	public void setIntObj(CalcInterface intObj) {
		IntObj = intObj;
	}
	
	
	

	
}
