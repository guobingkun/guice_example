package binding_annotation;

import com.google.inject.Inject;

/**
 * Created by guobingkun on 10/20/15.
 */
public class Human
{

  private final Water water;

  @Inject
  private Air air;

  public Human(Water water)
  {
    this.water = water;
  }

  @Override
  public String toString()
  {
    return "Human{" +
           "water=" + water +
           ", air=" + air +
           '}';
  }
}
