import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collections;

public class BalancedBracketsTest {
  String balancedParens = "(1)";
  String tooManyOpenParens = "((1";
  String tooManyOpenParens1 = "(1)(";
  String tooManyClosedParens = "(1))";
  String startClosedParens = ")(";
  String emptyString = "";
  String balancedAngleBrackets = "<<>>";
  String balancedComboBrackets = "<({})>";
  String mismatchedBrackets = "<({)}>";
  
  BalancedBrackets bb = new BalancedBrackets();
  
  @Test
  public void testBalancedBrackets_balancedParens() {
      assertTrue(bb.balancedBrackets("(1)"));
  }
  
  @Test
  public void testBalancedBrackets_tooManyOpenParens() {
      assertFalse(bb.balancedBrackets("({1)"));
  }
  
  @Test
  public void testBalancedBrackets_tooManyClosedParens() {
      assertFalse(bb.balancedBrackets("({1})>"));
  }
  
  @Test
  public void testBalancedBrackets_startWithClosedParens() {
      assertFalse(bb.balancedBrackets(")("));
  }
  
  @Test
  public void testBalancedBrackets_emptyString() {
      assertTrue(bb.balancedBrackets(""));
  }
  
  @Test
  public void testBalancedBrackets_balancedComboBrackets() {
      assertTrue(bb.balancedBrackets("<({})>"));
  }
  
  @Test
  public void testBalancedBrackets_mismatchedBrackets() {
      assertTrue(bb.balancedBrackets("<({)}>"));
  }
  private String input;
  private boolean expectedOutput;
  BalancedBrackets bb = new BalancedBrackets();
  
  public ParameterizedTest(String input, boolean expectedOutput) {
      this.input = input;
      this.expectedOutput = expectedOutput;
  }
  
  @Parameters
  public static Collection<Object[]> testConditions() {
      String balancedParens = "(1)";
      String balancedAngleBrackets = "<<>>";
      String balancedComboBrackets = "<({})>";
      String emptyString = "";
      String tooManyOpenParens = "((1";
      String tooManyOpenParens1 = "(1)(";
      String tooManyClosedParens = "(1))";
      String startClosedParens = ")(";
      String mismatchedBrackets = "<({)}>";
  
      Object[][] expectedOutputs = {
      { balancedParens, true },
      { balancedAngleBrackets, true },
      { balancedComboBrackets, true },
      { emptyString, true },
      { tooManyOpenParens, false },
      { tooManyOpenParens1, false },
      { tooManyClosedParens, false },
      { startClosedParens, false },
      { mismatchedBrackets, false }
      };
  
      return Arrays.asList(expectedOutputs);
  
  }
  
  @Test
  public void testBalancedBrackets() {
      assertEquals(expectedOutput, bb.balancedBrackets(input));
  }
  }
}
