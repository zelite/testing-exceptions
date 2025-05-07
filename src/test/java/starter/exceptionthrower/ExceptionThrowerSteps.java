package starter.exceptionthrower;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Step;
import org.apache.commons.jexl3.JexlException;
import org.apache.commons.jexl3.parser.ASTNullLiteral;

public class ExceptionThrowerSteps {

  @Step
  @Given("i throw an exception")
  public void iThrowAnException() {
    throwAnException();
  }

  private void throwAnException() {
    throw new MyCustomException(
        "this is my custom exception with a jexl cause.",
        new JexlException(new ASTNullLiteral(0), "This is thrown from the library being used."));
  }
}
