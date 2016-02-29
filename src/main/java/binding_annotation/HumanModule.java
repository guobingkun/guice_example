package binding_annotation;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by guobingkun on 10/20/15.
 */
public class HumanModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    binder.bind(Human.class).toInstance(new Human(new Water()));
  }
}
