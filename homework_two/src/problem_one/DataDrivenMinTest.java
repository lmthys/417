package problem_one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

class DataDrivenMinTest {

	@RunWith (Parameterized.class)
	public class DataDrivenCalcTest
	{
	   public List<Integer> a, b;
	   public int min;

	   public DataDrivenCalcTest (List<Integer> a, List<Integer> b, int min)
	   {
	      this.a = a;
	      this.b = b;
	      this.min = min; 
	   }

	  @Parameters
	  public Collection<Object[]> calcValues()
	  {
	     return Arrays.asList (new Object [][] {{1, 1, 2}, {2, 3, 5}}); 
	  }

	  @Test
	  public void additionTest()
	  {
	     assertTrue ("Addition Test", min == Min.min(a));
	  }
	}
}

}
