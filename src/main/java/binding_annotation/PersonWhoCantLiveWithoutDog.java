package binding_annotation;

import com.google.inject.Inject;

/**
 * Created by guobingkun on 6/24/15.
 */
public class PersonWhoCantLiveWithoutDog
{
  private Animal myDog;

  public PersonWhoCantLiveWithoutDog(Animal dog)
  {
    myDog = dog;
  }
}
