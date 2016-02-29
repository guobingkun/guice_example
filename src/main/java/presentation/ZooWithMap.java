package presentation;

import binding_annotation.Animal;
import com.google.inject.Inject;

import java.util.Map;
import java.util.Set;

/**
 * Created by guobingkun on 7/10/15.
 */
public class ZooWithMap
{
  private Map<String, Animal> animalMap;
  private Map<String, Set<Animal>> duAnimalMap;

  @Inject
  public ZooWithMap(
      Map<String, Animal> animalMap,
      Map<String, Set<Animal>> duAnimalMap
  )
  {
    this.animalMap = animalMap;
    this.duAnimalMap = duAnimalMap;
  }

  public Map<String, Animal> getAnimalMap()
  {
    return animalMap;
  }

  public Map<String, Set<Animal>> getDuAnimalMap()
  {
    return duAnimalMap;
  }
}
