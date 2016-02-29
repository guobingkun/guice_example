package binding_annotation;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Module;

/**
 * Created by guobingkun on 6/24/15.
 */
public class ForestModule implements Module
{

  @Override
  public void configure(Binder binder)
  {
    // add default binding for Animal.class
    binder.bind(Animal.class).to(Key.get(Animal.class, Tigerr.class));

    binder.bind(Liquid.class).to(Water.class);
  }
}
