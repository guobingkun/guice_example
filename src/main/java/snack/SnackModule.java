package snack;

import binding_annotation.Cat;
import binding_annotation.Dog;
import binding_annotation.DogProvider;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.multibindings.Multibinder;

public class SnackModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder<Snack> multibinder = Multibinder.newSetBinder(binder(), Snack.class);
    multibinder.addBinding().to(Skittles.class);
    multibinder.addBinding().to(Twix.class);
    System.out.println("here");
    bind(Dog.class).toProvider(DogProvider.class);
  }

  @Provides
  public Cat getCat() {
    return new Cat();
  }
}
