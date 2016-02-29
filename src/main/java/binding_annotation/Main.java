package binding_annotation;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Created by guobingkun on 5/28/15.
 */
public class Main
{
  @Inject @Catt
  private Animal animal1;

  @Inject @Dogg
  private Animal animal2;

  @Inject
  private Animal animal3;

  public static void main(String[] args)
  {
    Main main = new Main();

    Injector injector = Guice.createInjector(new AnimalModule());
    injector.injectMembers(main);
    System.out.println(main.animal1);
    System.out.println(main.animal2);
    System.out.println(main.animal3);
  }
}
