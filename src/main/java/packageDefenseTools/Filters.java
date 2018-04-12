package packageDefenseTools;

/**
 * The type Filters.
 */
public class Filters extends DefenseTools {
    private String filterLevel3Wizard;

    /**
     * Instantiates a new Filters.
     *
     * @param pName               the p name
     * @param pfilterLevel3Wizard the pfilter level 3 wizard
     */
    public Filters(String pName, String pfilterLevel3Wizard) {
        super(pName);
        this.filterLevel3Wizard = pfilterLevel3Wizard;
    }

    /**
     * Gets filter level 3 wizard.
     *
     * @return the filter level 3 wizard
     */
    public String getFilterLevel3Wizard() {
        return filterLevel3Wizard;
    }


    /**
     * Sets filter level 3 wizard.
     *
     * @param pFilterLevel3Wizard the p filter level 3 wizard
     */
    public void setFilterLevel3Wizard(String pFilterLevel3Wizard) {
        this.filterLevel3Wizard = pFilterLevel3Wizard;
    }

    public String toString() {
        String str = super.toString() + " - Level : " + getFilterLevel3Wizard();

        return str;
    }

}
