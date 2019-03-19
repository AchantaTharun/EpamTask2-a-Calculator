import org.junit.Test;
import static org.junit.Assert.*;

class Calculator{
	/*method for addition
	 * @param num1
	 * @param num2
	 * @return
	 * */
	
	public static double add(double num1 ,double num2) {
		return num1+num2;
	}
	//method for multiplication
	 /* @param num1
		 * @param num2
		 * @return
		 * */
	public static double mul(double num1 ,double num2) {
		return num1*num2;
	}
	//method for division
	/* @param num1
	 * @param num2
	 * @return
	 * */
	public static double div(double num1 ,double num2) {
		if(num2==0)throw new IllegalArgumentException("division by 0 not possible");
		return num1/num2;
	}

}
