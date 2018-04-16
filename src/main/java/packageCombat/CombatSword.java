package packageCombat;
import packageCharacters.CharactersPlayer;
import packageEvent.packageEnemies.CharactersEnemies;

public class CombatSword implements CombatType {

    @Override
    public void attack (CharactersPlayer charactersPlayer, CharactersEnemies charactersEnemies) {
        System.out.println("attaque avec une epée");
    }
}
