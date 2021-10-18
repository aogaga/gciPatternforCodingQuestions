package slidingWindow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class SampleEx {
  public static void main(String [] args){
    String [] names = {"ogaga", "agi", "fidelis", "ogaga", "agi", "ono"};
    Set<String> fam = new HashSet<>();
    for(String x : names){
      fam.add(x);
    }


    System.out.println(fam);

  }
}
