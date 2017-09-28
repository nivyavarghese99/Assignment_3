package IT7320.Assignment_3;

public class MultCalcImplementation {
	CalcInterface intObj;
	public int multTwoNums(int e, int f)
	{
		return intObj.mult(e, f);
	}
	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}
	
	

}
