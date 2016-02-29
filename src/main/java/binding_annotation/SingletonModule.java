package binding_annotation;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

/**
 * Created by guobingkun on 7/9/15.
 */
public class SingletonModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    binder.bind(Animal.class).to(Tiger.class).in(Singleton.class);
    //binder.bind(Animal.class).to(Tiger.class);
  }
}
