package packageCombat;
import packageCharacters.CharactersPlayer;
import packageEnemies.CharactersEnemies;
import packageWeaponsOffense.*;

public class CombatSword implements CombatType {

    @Override
    public void attack (CharactersPlayer charactersPlayer, CharactersEnemies charactersEnemies) {
        System.out.println("attaque avec une epée");
    }
}
