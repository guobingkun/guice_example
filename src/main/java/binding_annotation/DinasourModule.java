package binding_annotation;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by guobingkun on 6/25/15.
 */
public class DinasourModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    binder.bind(Dinasour.class).toProvider(new DinasourProvider());
    binder.bind(Meat.class).to(Beef.class);
    //binder.bind(Dinasour.class).toProvider(DinasourProvider.class);
  }
}
