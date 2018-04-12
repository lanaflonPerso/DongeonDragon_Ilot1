package packageAllList;

import packagePlayersNames.PlayersName;

import java.util.ArrayList;

public class PlayerNameList {
    public ArrayList<PlayersName> playerNameList(String namePlay) {
        ArrayList<PlayersName> playersNameArrayList = new ArrayList<PlayersName>();
        playersNameArrayList.add(new PlayersName(namePlay));
        return playersNameArrayList;
    }
}
