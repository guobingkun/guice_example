package binding_annotation;

import com.google.inject.Inject;

/**
 * Created by guobingkun on 6/25/15.
 */
public class Dinasour extends Animal
{
  private final Meat meat;

//  public Dinasour()
//  {
//    meat = new Beef();
//    System.out.println("Default constructor");
//  }

  //@Inject
  public Dinasour(Meat meat)
  {
    this.meat = meat;
    System.out.println("inject constructor");
  }

  @Override
  public String toString()
  {
    return String.format("Dinasour depends on [%s]", meat);
  }
}
