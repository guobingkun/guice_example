package snack;

import com.google.inject.Inject;

import java.util.Set;

public class SnackMachine {
  
  @Inject
  public SnackMachine(Set<Snack> snacks) {
    System.out.println(snacks);
  }
  
  
}
