package presentation;

import binding_annotation.Animal;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;

import java.util.List;

/**
 * Created by guobingkun on 7/9/15.
 */
public class Zoo
{
  private Animal a1;
  private Animal a2;

  @Inject
  public Zoo(@CanFly Animal a1, Animal a2)
  {
    this.a1 = a1;
    this.a2 = a2;
  }

  public List<Animal> getAnimals()
  {
    return ImmutableList.of(a1, a2);
  }
}
