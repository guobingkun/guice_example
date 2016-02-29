package binding_annotation;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by guobingkun on 6/25/15.
 */
public class WaterModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    binder.bind(Animal.class).to(Fish.class);
    //binder.bind(Water.class); // this is optional
  }
}
