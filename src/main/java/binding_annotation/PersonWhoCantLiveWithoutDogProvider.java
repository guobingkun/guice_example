package binding_annotation;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Created by guobingkun on 6/24/15.
 */
public class PersonWhoCantLiveWithoutDogProvider implements Provider<PersonWhoCantLiveWithoutDog>
{
  private Animal dogToProvide;

  @Inject
  public void config(@Dogg Animal dog)
  {
    System.out.println("PersonWhoCantLiveWithoutDogProvider configuring Dog: " + dog);
    dogToProvide = dog;
  }

  @Override
  public PersonWhoCantLiveWithoutDog get()
  {
    System.out.println("PersonWhoCantLiveWithoutDogProvider getting Dog");
    return new PersonWhoCantLiveWithoutDog(dogToProvide);
  }
}
