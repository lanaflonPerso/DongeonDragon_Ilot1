package packageGameStart;

public class PlayersName {

    protected String name;

    public PlayersName(String nameOfplayer) {
        this.name = nameOfplayer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Nom Du PLayer One : " + this.name;

    }
}
