package presentation;

import binding_annotation.Animal;
import binding_annotation.Water;
import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by guobingkun on 7/9/15.
 */
public class PrAnimalModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    binder.bind(Water.class);
    binder.bind(Animal.class).to(Monkey.class);
    binder.bind(Fruit.class).to(WaterMelon.class);
  }
}
