package packagePlayersNames;

/**
 * The type Players name.
 */
public class PlayersName {

    /**
     * The Name.
     */
    protected String name;

    /**
     * Instantiates a new Players name.
     *
     * @param nameOfplayer the name ofplayer
     */
    public PlayersName(String nameOfplayer) {
        this.name = nameOfplayer;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Nom Du PLayer One : " + this.name;

    }
}
