package binding_annotation;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Created by guobingkun on 2/15/15.
 */
public class DogProvider implements Provider<Dog>
{

  private final Liquid liquid;
  private final Cat cat;

  @Inject
  public DogProvider(Cat cat, Liquid liquid)
  {
    this.liquid = liquid;
    System.out.println("Inside dog provider " + cat);
    this.cat = cat;
  }

  @Override
  public Dog get()
  {
    System.out.println("give you a dog");
    return new Dog(
        new Bone()
        {
          @Override
          public String toString()
          {
            return "a bone";
          }
        }, liquid
    );
  }
}
