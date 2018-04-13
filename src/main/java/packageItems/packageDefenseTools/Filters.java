package packageItems.packageDefenseTools;

public class Filters extends DefenseTools {
    private String filterLevel3Wizard;

    public Filters(String pName, String pfilterLevel3Wizard) {
        super(pName);
        this.filterLevel3Wizard = pfilterLevel3Wizard;
    }

    public String getFilterLevel3Wizard() {
        return filterLevel3Wizard;
    }


    public void setFilterLevel3Wizard(String pFilterLevel3Wizard) {
        this.filterLevel3Wizard = pFilterLevel3Wizard;
    }

    public String toString() {
        String str = super.toString() + " - Level : " + getFilterLevel3Wizard();

        return str;
    }

}
