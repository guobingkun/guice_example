package binding_annotation;

import com.google.inject.Inject;

/**
 * Created by guobingkun on 2/15/15.
 */
public class Dog extends Animal {

  private final Bone bone;
  private final Liquid liquid;

  @Inject
  public Dog(Bone bone, Liquid liquid)
  {
    this.bone = bone;
    this.liquid = liquid;
  }

  @Override
  public String toString()
  {
    return String.format("I am a dog, I have a bone [%s], and I drink [%s]", bone, liquid.getType());
  }
}
