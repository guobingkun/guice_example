package presentation;

import binding_annotation.Animal;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.multibindings.MapBinder;

/**
 * Created by guobingkun on 7/10/15.
 */
public class Map1Module implements Module
{
  @Override
  public void configure(Binder binder)
  {
    MapBinder<String, Animal> mapBinder = MapBinder.newMapBinder(binder, String.class, Animal.class).permitDuplicates();
    mapBinder.addBinding("canFly").to(Bird.class);
  }
}
