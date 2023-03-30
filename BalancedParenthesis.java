import java.util.*;
public class Main {
  //Balanced Parenthesis
  //My runtime complexities for my solutions are O(log n)
  //The runtime complexities for the given solutions are O(1)
  //My solutions are a bit more complicated than the given ones, I think I could have made the code easier to read
  //The queue would change how the function is inputed and outputted
  public static boolean balancedParenthesis(String str) {
    Stack stack = new Stack();
    for (int i = 0; i < str.length(); i++) {
      char x = str.charAt(i);
      if (x == '(') {
        stack.push(x);
        continue;
      }
      if (stack.isEmpty()) {
        return false;
      }
      if (x == ')') {
        stack.push(x);
        continue;
      }
      
    }
    return (stack.isEmpty());
  }
  //Balanced brackets
  public static boolean balancedBrackets(String str) {
    Stack stack = new Stack();
    for (int i = 0; i < str.length(); i++) {
      char x = str.charAt(i);
      if (x == '(' || x == '[' || x == '{' || x == '<') {
        stack.push(x);
        continue;
      }
      if (stack.isEmpty()) {
        return false;
      }
      char checkChar;
      switch (x) {
        case ')':
          checkChar = stack.pop();
          if (check == '{' || check == '[' || check == '<') {
            return false;
          }
          case ']':
          checkChar = stack.pop();
          if (check == '{' || check == '(' || check == '<') {
            return false;
          }
          case '}':
          checkChar = stack.pop();
          if (check == '(' || check == '[' || check == '<') {
            return false;
          }
          case '>':
          checkChar = stack.pop();
          if (check == '{' || check == '[' || check == '(') {
            return false;
          }
      }
      
    }
    return (stack.isEmpty());
  }
  public static void main(String[] args) {
   String str = "(())()";
    if(balancedParenthesis(str)) {
      System.out.println("True");
    }
    else {
      System.out.println("False");
    }
    testBalancedBrackets_balancedParens();
    testBalancedBrackets_tooManyOpenParens();
    testBalancedBrackets_tooManyClosedParens();
    testBalancedBrackets_startWithClosedParens();
    testBalancedBrackets_emptyString();
    testBalancedBrackets_balancedComboBrackets();
    testBalancedBrackets_mismatchedBrackets();
  }
}