package binding_annotation;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by guobingkun on 6/24/15.
 */
public class LifeTest
{
  @Test
  public void testName() throws Exception
  {
    Injector injector = Guice.createInjector(new AnimalModule());

    // the following ways of getInstance are same
    Animal animal = injector.getInstance(Key.get(Animal.class, Dogg.class));
    //Animal animal = injector.getInstance(Key.get(new TypeLiteral<Animal>(){}, Dogg.class));
    System.out.println(animal);

    Liquid liquid = injector.getInstance(Liquid.class);
  }

  @Test
  public void testCat() throws Exception
  {
    Injector injector = Guice.createInjector(new BoneModule(), new AnimalModule());
    Animal animal = injector.getInstance(Key.get(Animal.class, Catt.class));
    System.out.println(animal);
  }

  @Test
  public void testForestModule() throws Exception
  {
    Injector injector = Guice.createInjector(new BoneModule(), new AnimalModule(), new ForestModule());
    Animal animal = injector.getInstance(Key.get(Animal.class, Dogg.class));
    Assert.assertEquals("Dog", animal.toString());

    animal = injector.getInstance(Key.get(Animal.class, Catt.class));
    Assert.assertEquals("Cat", animal.toString());

    animal = injector.getInstance(Key.get(Animal.class, Tigerr.class));
    Assert.assertEquals("Tiger", animal.toString());

    System.out.println("End of test" + injector.getAllBindings().size());
  }

  @Test
  public void testDefaultAnimal() throws Exception
  {
    Injector injector = Guice.createInjector(new BoneModule(), new AnimalModule(), new ForestModule());
    Animal animal = injector.getInstance(Key.get(Animal.class, Tigerr.class));
    System.out.println(animal);
  }

  @Test
  public void testJsonConfigProvider() throws Exception
  {
    Injector injector = Guice.createInjector(new BoneModule(), new AnimalModule(), new ForestModule());
    //PersonWhoCantLiveWithoutDog personWhoCantLiveWithoutDog = injector.getInstance(PersonWhoCantLiveWithoutDog.class);
    Animal animal = injector.getInstance(Lion.class);
    System.out.println(animal.toString());
  }

  @Test
  public void testWaterDependency() throws Exception
  {
    Injector injector = Guice.createInjector(new WaterModule());
    Animal fish = injector.getInstance(Animal.class);
    System.out.println(fish.toString());
  }

  /**
   * com.google.inject.CreationException: Guice creation errors:
   * 1) Could not find a suitable constructor in binding_annotation.Dinasour.
   * Classes must have either one (and only one) constructor annotated with @Inject or a zero-argument constructor
   * that is not private.
   * @throws Exception
   */
  @Test
  public void testDinasourFail() throws Exception
  {
    Injector injector = Guice.createInjector(new BoneModule(), new AnimalModule(), new ForestModule());
    Dinasour dinasour = injector.getInstance(Dinasour.class);
  }

  @Test
  public void testDinasourSucceed() throws Exception
  {
    Injector injector = Guice.createInjector(
        new BoneModule(),
        new AnimalModule(),
        new ForestModule(),
        new DinasourModule()
    );
    Dinasour dinasour = injector.getInstance(Dinasour.class);
    System.out.println(dinasour);
  }

  @Test
  public void testSingleton() throws Exception
  {
    Injector injector = Guice.createInjector(new SingletonModule());
    Tiger tiger = (Tiger) injector.getInstance(Animal.class);
    System.out.println(tiger);
    tiger.setMonologue("I am a another tiger");
    System.out.println(tiger);
    Animal tigerr = injector.getInstance(Animal.class);
    System.out.println(tigerr);
  }

  @Test
  public void testToInstanceWithBinding()
  {
    Injector injector = Guice.createInjector(new HumanModule());
    Human human = injector.getInstance(Human.class);
    System.out.println(human);
  }
}