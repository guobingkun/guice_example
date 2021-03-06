package presentation;

import binding_annotation.Animal;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.multibindings.Multibinder;

/**
 * Created by guobingkun on 7/10/15.
 */
public class Set2Module implements Module
{
  @Override
  public void configure(Binder binder)
  {
    Multibinder<Animal> multibinder = Multibinder.newSetBinder(binder, Animal.class);
    multibinder.addBinding().to(Gorilla.class);
  }
}
