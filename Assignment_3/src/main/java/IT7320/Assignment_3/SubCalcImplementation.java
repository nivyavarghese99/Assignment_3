package IT7320.Assignment_3;

public class SubCalcImplementation {

	CalcInterface intObj;
	public int subTwoNums(int c, int d)
	{
		return intObj.sub(c, d);
	}
	
	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}


}
