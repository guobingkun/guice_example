package binding_annotation;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by guobingkun on 6/24/15.
 */
public class BoneModule implements Module
{
  @Override
  public void configure(Binder binder)
  {
    binder.bind(Bone.class).toInstance(
        new Bone()
        {
          @Override
          public String toString()
          {
            return "This bone is created in BoneModule";
          }
        }
    );
  }
}
