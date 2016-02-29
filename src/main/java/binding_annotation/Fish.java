package binding_annotation;

import com.google.inject.Inject;

/**
 * Created by guobingkun on 6/25/15.
 */
public class Fish extends Animal
{
  private final Water water;
  private final Liquid liquid;

  @Inject
  public Fish(Water water, Liquid liquid)
  {
    this.water = water;
    this.liquid = liquid;
  }

}
