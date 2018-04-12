package packageAllList;

import java.util.ArrayList;


public class AllList {
    public  void displayArrayList(ArrayList<? extends Object> listElements) {
              listElements.forEach(l -> System.out.println(l.toString()));
          }
}
