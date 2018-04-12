package packageAllList;

import packageWeaponsOffense.*;

import java.util.ArrayList;

public class WeaponsOffenseList {
    public ArrayList<WeaponsOffense> weaponsOffenseList = new ArrayList<WeaponsOffense>();
    public  ArrayList<WeaponsOffense>sortListBox(){
        ArrayList<WeaponsOffense> sortsListBox = new ArrayList<WeaponsOffense>();
        sortsListBox.add(new Bow("Bow", "50", "80"));
        sortsListBox.add(new Lightning("Lightning", "80", "50"));
        return sortsListBox;
    }

    public  ArrayList<WeaponsOffense>armeListBox(){
        ArrayList<WeaponsOffense> armesListBox = new ArrayList<WeaponsOffense>();
        armesListBox.add(new Sword("Excaliburne", "65"));
        armesListBox.add(new Mace("KiKogne", "55"));
        return armesListBox;
    }

    public  ArrayList<WeaponsOffense>armeListWarrior(){
        ArrayList<WeaponsOffense> armesListWarrior = new ArrayList<WeaponsOffense>();
        armesListWarrior.add(new Mace("KiKogne", "55"));
        armesListWarrior.add(new Sword("Excaliburne", "65"));
        armesListWarrior.add(new Bow("Arc flamboyant", "50", "80"));
        return armesListWarrior;
    }

    public  ArrayList<WeaponsOffense>sortListMagician(){
        ArrayList<WeaponsOffense> sortListMagician = new ArrayList<WeaponsOffense>();
        sortListMagician.add(new FireWall("FireWall", "25"));
        sortListMagician.add(new Invisibility("Invisibility","30"));
        sortListMagician.add(new Lightning("Lightning", "50", "25"));//3
        return sortListMagician;
    }
}
