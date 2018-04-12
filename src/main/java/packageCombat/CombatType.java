package packageCombat;

import packageCharacters.CharactersPlayer;
import packageEnemies.CharactersEnemies;

/**
 * The interface Combat type.
 */
public interface CombatType {

    /**
     * Attack.
     *
     * @param charactersPlayer  the characters player
     * @param charactersEnemies the characters enemies
     */
    public void attack(CharactersPlayer charactersPlayer, CharactersEnemies charactersEnemies);

}


