package binding_annotation;

/**
 * Created by guobingkun on 6/24/15.
 */
public class Water implements Liquid
{
  @Override
  public String getType()
  {
    return "Water";
  }

  @Override
  public String toString()
  {
    return "Water";
  }
}
