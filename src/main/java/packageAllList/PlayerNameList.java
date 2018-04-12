package packageAllList;

import packagePlayersNames.PlayersName;

import java.util.ArrayList;

/**
 * The type Player name list.
 */
public class PlayerNameList {
    /**
     * Player name list array list.
     *
     * @param namePlay the name play
     * @return the array list
     */
    public ArrayList<PlayersName> playerNameList(String namePlay) {
        ArrayList<PlayersName> playersNameArrayList = new ArrayList<PlayersName>();
        playersNameArrayList.add(new PlayersName(namePlay));
        return playersNameArrayList;
    }
}
