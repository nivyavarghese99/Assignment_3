package IT7320.Assignment_3;

public class DivCalcImplementation {
	
	CalcInterface DoubleObj;
	public double divTwoNums(int m, int n)
	{
		return DoubleObj.div(m, n);
	}
	public void setDoubleObj(CalcInterface DoubleObj) {
		this.DoubleObj = DoubleObj;
	}
	
	

	
}
