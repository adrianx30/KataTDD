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
}
