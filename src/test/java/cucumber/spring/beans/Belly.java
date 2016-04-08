package cucumber.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue") // The cucumber-spring integration automatically associates all hooks and
                        // step definitions with a scope called cucumber-glue, but we’ll need to
                        // associate any objects that we’ve created to share state with that scope
                        // too
public class Belly {
  private int cukes = 0;

  public void setCukes(int cukes) {
    this.cukes = cukes;
  }

  public int getCukes() {
    return cukes;
  }
}
