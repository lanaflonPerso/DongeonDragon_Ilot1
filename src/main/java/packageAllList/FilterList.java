package packageAllList;

import packageDefenseTools.Filters;

import java.util.ArrayList;

/**
 * The type Filter list.
 */
public class FilterList {
    /**
     * Filter list array list.
     *
     * @return the array list
     */
    public ArrayList<Filters> filterList() {
        ArrayList<Filters> filtersListBox = new ArrayList<Filters>();
        filtersListBox.add(new Filters("Love", "5"));
        filtersListBox.add(new Filters("Persuasion", "3"));
        filtersListBox.add(new Filters("Protection", "2"));
        return filtersListBox;


    }
}
