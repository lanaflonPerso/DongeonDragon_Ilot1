package packageCombat;

import packageCharacters.CharactersPlayer;
import packageEvent.packageEnemies.CharactersEnemies;

public class CombatBow implements CombatType {

    @Override
    public void attack (CharactersPlayer charactersPlayer, CharactersEnemies charactersEnemies){
        System.out.println("attaque avec un Arc ( je suis une tarlouze a distance )");
    }

}
