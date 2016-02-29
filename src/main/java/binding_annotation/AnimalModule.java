package binding_annotation;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provides;

/**
 * Created by guobingkun on 5/28/15.
 */
public class AnimalModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    System.out.println("Inside AnimalModule");
    //binder.bind(PersonWhoCantLiveWithoutDog.class).toProvider(new PersonWhoCantLiveWithoutDogProvider());
    binder.bind(PersonWhoCantLiveWithoutDog.class).toProvider(PersonWhoCantLiveWithoutDogProvider.class);
    binder.bind(Animal.class).annotatedWith(Dogg.class).to(Dog.class);
    binder.bind(Animal.class).annotatedWith(Catt.class).toInstance(new Cat());
    binder.bind(Animal.class).annotatedWith(Pigg.class).to(Pig.class);
    binder.bind(Lion.class).toInstance(new Lion(){});
  }

  @Provides @Tigerr
  public Animal getTiger(final Injector injector)
  {
    System.out.println("Inside provides for tiger, creating tiger");
    System.out.println("Injector=" + injector.getAllBindings().size());
    return new Tiger();
  }
}
