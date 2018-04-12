package packageCombat;

import packageCharacters.CharactersPlayer;
import packageEnemies.CharactersEnemies;

/**
 * The type Combat bow.
 */
public class CombatBow implements CombatType {

    @Override
    public void attack (CharactersPlayer charactersPlayer, CharactersEnemies charactersEnemies){
        System.out.println("attaque avec un Arc ( je suis une tarlouze a distance )");
    }

}
