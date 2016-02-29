package binding_annotation;

import com.google.inject.Inject;

/**
 * Created by guobingkun on 6/24/15.
 */
public abstract class Lion extends Animal
{

  private Animal animalToEat;

  @Inject
  public void config(@Pigg Animal pig)
  {
    System.out.println("Confiuring Pig for Dinasour");
    animalToEat = pig;
  }

}
