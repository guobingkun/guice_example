package binding_annotation;

import com.google.inject.Inject;

public class Cat extends Animal
{

  private Bone bone;
  private Liquid liquid;

  @Inject
  public void configure(Bone bone, Liquid liquid)
  {
    this.bone = bone;
    this.liquid = liquid;
  }

  @Override
  public String toString()
  {
    return String.format("I am a Cat, and I have a bone [%s] and I drink [%s]", bone, liquid);
  }
}
