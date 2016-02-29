package presentation;

import binding_annotation.Animal;
import binding_annotation.Beef;
import binding_annotation.Dinasour;
import binding_annotation.DinasourProvider;
import binding_annotation.Meat;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;

/**
 * Created by guobingkun on 7/9/15.
 */
public class PrDinasourModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    /**
     * Could not find a suitable constructor in binding_annotation.Dinasour.
     * Classes must have either one (and only one) constructor annotated with
     * @Inject or a zero-argument constructor that is not private.
     */
    binder.bind(Animal.class).to(Dinasour.class);
    binder.bind(Dinasour.class).toProvider(DinasourProvider.class);
    binder.bind(Meat.class).to(Beef.class);
    //binder.bind(Animal.class).toInstance(new Dinasour(new Beef()));
  }

  @Provides
  public Animal getDinasour(Meat meat)
  {
    return new Dinasour(meat);
  }
}
