package presentation;

import binding_annotation.Animal;
import binding_annotation.Water;
import com.google.inject.Inject;

/**
 * Created by guobingkun on 7/9/15.
 */
public class Monkey extends Animal
{

  private Fruit fruit;
  private Water water;

  @Inject
  public Monkey(Fruit fruit, Water water)
  {
    this.fruit = fruit;
    this.water = water;
  }

  @Override
  public String toString()
  {
    return String.format("Monkey depends on [%s] and [%s]", fruit.toString(), water.toString());
  }
}
