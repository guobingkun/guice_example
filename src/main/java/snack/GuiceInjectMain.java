package snack;

import binding_annotation.Dog;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceInjectMain
{
  public static void main(String args[]) {
    System.out.println("creating injector");
    Injector injector = Guice.createInjector(new SnackModule(), new ChipModule());
    System.out.println("finish injector");
    Dog dog = injector.getInstance(Dog.class);
    System.out.println(dog);
  }

}
