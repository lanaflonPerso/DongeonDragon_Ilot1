package packageCombat;

import packageCharacters.CharactersPlayer;
import packageEnemies.CharactersEnemies;

public class CombatMace implements CombatType {

    @Override
    public void attack(CharactersPlayer charactersPlayer, CharactersEnemies charactersEnemies) {
        System.out.println("attaque avec une masse");
    }


}
