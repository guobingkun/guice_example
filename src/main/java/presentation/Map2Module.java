package presentation;

import binding_annotation.Animal;
import binding_annotation.Beef;
import binding_annotation.DinasourProvider;
import binding_annotation.Meat;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.multibindings.MapBinder;

/**
 * Created by guobingkun on 7/10/15.
 */
public class Map2Module implements Module
{
  @Override
  public void configure(Binder binder)
  {
    MapBinder<String, Animal> mapBinder = MapBinder.newMapBinder(binder, String.class, Animal.class).permitDuplicates();
    mapBinder.addBinding("canWalk").to(Monkey.class);
    binder.bind(Fruit.class).to(WaterMelon.class);
    binder.bind(Meat.class).to(Beef.class);
    mapBinder.addBinding("canWalk").toProvider(DinasourProvider.class);
  }
}
