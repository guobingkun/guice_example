package binding_annotation;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Created by guobingkun on 6/25/15.
 */
public class DinasourProvider implements Provider<Dinasour>
{

  private Meat meat;

  @Inject
  public void setMeat(Meat meat)
  {
    System.out.println("Preparing meat for Dinasour");
    this.meat = meat;
  }

  @Override
  public Dinasour get()
  {
    return new Dinasour(meat);
  }
}
