package snack;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;

import java.util.Set;

public class App {

  public static void main(String args[]) {
    Injector injector = Guice.createInjector(new SnackModule(), new ChipModule());
    Set<Snack> sm = injector.getInstance(Key.get(new TypeLiteral<Set<Snack>>() {
    }));
    System.out.println(sm.getClass().getName());
    for(Snack s : sm)
      System.out.println(s);

  }
}
