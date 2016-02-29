package snack;

import binding_annotation.Dog;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.multibindings.Multibinder;
import org.codehaus.jackson.map.annotate.JacksonInject;

public class ChipModule extends AbstractModule {

  @Inject
  private Dog dog;
  
  @Override
  protected void configure() {
    Multibinder<Snack> multibinder = Multibinder.newSetBinder(binder(), Snack.class);
    multibinder.addBinding().to(Lays.class);
    multibinder.addBinding().to(Chipotle.class);
  
    System.out.println("printing dog " + dog);
  }

}
