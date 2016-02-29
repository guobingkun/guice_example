package presentation;

import binding_annotation.Animal;
import com.google.inject.Inject;

import java.util.Set;

/**
 * Created by guobingkun on 7/10/15.
 */
public class ZooWithSet
{
  private Set<Animal> animalSet;

  @Inject
  public ZooWithSet(Set<Animal> animalSet)
  {
    this.animalSet = animalSet;
  }

  public Set<Animal> getAnimalSet()
  {
    return animalSet;
  }
}
