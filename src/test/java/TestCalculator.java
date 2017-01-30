import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

	@Test
	public void emptyStringShouldReturn0(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("");
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void fiveStringShouldReturn1(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("5");
		Assert.assertEquals(5, result);
	}
	
	@Test
	public void twoStringShouldReturnAddResult(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("2,5");
		Assert.assertEquals(7, result);
	}
	
	@Test
	public void fourStringShouldReturnAddResult(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("3,2,5,8");
		Assert.assertEquals(18, result);
	}
	
	@Test
	public void twoWaysSeparateString(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("4\n2\n4,8");
		Assert.assertEquals(18, result);
	}
	
	@Test
	public void anyDelimiter(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("//*\n1*2");
		Assert.assertEquals(3, result);
	}
}
