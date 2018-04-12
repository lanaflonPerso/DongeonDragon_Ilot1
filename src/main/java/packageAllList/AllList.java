package packageAllList;

import java.util.ArrayList;


/**
 * The type All list.
 */
public class AllList {
    /**
     * Display array list.
     *
     * @param listElements the list elements
     */
    public  void displayArrayList(ArrayList<? extends Object> listElements) {
              listElements.forEach(l -> System.out.println(l.toString()));
          }
}
