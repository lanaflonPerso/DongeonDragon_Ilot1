package packageCombat;

import packageCharacters.CharactersPlayer;
import packageEvent.packageEnemies.CharactersEnemies;

public interface CombatType {

    public void attack(CharactersPlayer charactersPlayer, CharactersEnemies charactersEnemies);

}


