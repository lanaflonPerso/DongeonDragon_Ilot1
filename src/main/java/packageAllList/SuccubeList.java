package packageAllList;

import packageEnemies.Succube;

import java.util.ArrayList;

public class SuccubeList {
    public ArrayList<Succube> succubeList() {

        ArrayList<Succube> succubesList = new ArrayList<Succube>();
        succubesList.add(new Succube("succube attirante", "image", "40", "15"));
        succubesList.add(new Succube("succube fascinante", "image", "60", "25"));
        succubesList.add(new Succube("succube seduisante", "image", "80", "50"));
        succubesList.add(new Succube("succube maitresse", "image", "120", "75"));
        return succubesList;
    }
}
