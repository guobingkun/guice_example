package presentation;

import binding_annotation.Animal;
import binding_annotation.AnimalModule;
import binding_annotation.Dinasour;
import binding_annotation.DinasourModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.util.Types;
import org.junit.Test;

import java.util.List;

/**
 * Created by guobingkun on 7/9/15.
 */
public class DemoTest
{

  @Test
  public void testSimple() throws Exception
  {
    Injector injector = Guice.createInjector(new PrAnimalModule());
    Animal animal = injector.getInstance(Animal.class);
    System.out.println(animal);
    Monkey monkey = injector.getInstance(Monkey.class);
    System.out.println(monkey);
  }

  @Test
  public void testZoo() throws Exception
  {
    Injector injector = Guice.createInjector(new ZooModule());
    List<Animal> animals = injector.getInstance(Zoo.class).getAnimals();
    System.out.println(animals);
  }

  @Test
  public void testDinasour() throws Exception
  {
    Injector injector = Guice.createInjector(new PrDinasourModule());
    Animal animal = injector.getInstance(Animal.class);
    System.out.println(animal);

    Provider<Animal> provider = (Provider<Animal>) injector.getInstance(Key.get(Types.newParameterizedType(Provider.class, Animal.class)));
    System.out.println(provider.get());

      // would work if the constructor of Dinasour has @Inject
//    Dinasour dinasour = injector.getInstance(Dinasour.class);
//    System.out.println(dinasour);
  }

  @Test
  public void testMultiBinder() throws Exception
  {
    Injector injector = Guice.createInjector(new PrDinasourModule(), new Set1Module(), new Set2Module(), new Set3Module());
    ZooWithSet zoo = injector.getInstance(ZooWithSet.class);
    System.out.println(zoo.getAnimalSet());
  }

  @Test
  public void testMultiMapBinder() throws Exception
  {
    Injector injector = Guice.createInjector(new Map1Module(), new Map2Module());
    ZooWithMap zooWithMap = injector.getInstance(ZooWithMap.class);
    System.out.println(zooWithMap.getAnimalMap());
    System.out.println(zooWithMap.getDuAnimalMap());
  }
}