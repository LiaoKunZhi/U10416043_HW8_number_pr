//U10416043   廖崑智

import java.math.*;

//Class
public class NumberPr{

	//Data field
	BigDecimal npr1;
	BigDecimal npr2;
	
	//Constructor
	NumberPr (String newNpr1, String newNpr2) {
		npr1 = new BigDecimal(newNpr1);
		npr2 = new BigDecimal(newNpr2);
	}
	
	//Method
	String getCalculate (int want, int scale) {

		String result = "";

		if (want == 1) {
			result = String.valueOf(npr1.add(npr2));
		}			
		else if (want == 2) {
			result = String.valueOf(npr1.subtract(npr2));
		}
		else if (want == 3) {
			result = String.valueOf(npr1.multiply(npr2));
		}
		else if (want == 4) {			
			result = String.valueOf(npr1.divide(npr2,scale,BigDecimal.ROUND_HALF_UP));
		}
		else {
			result = "ERROR";
		}
		return result;
	}
}
