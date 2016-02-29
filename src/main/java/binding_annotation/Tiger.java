package binding_annotation;

/**
 * Created by guobingkun on 6/24/15.
 */
public class Tiger extends Animal
{

  private String monologue = "I am a tiger";

  @Override
  public String toString()
  {
    return monologue;
  }

  public void setMonologue(String monologue)
  {
    this.monologue = monologue;
  }
}
