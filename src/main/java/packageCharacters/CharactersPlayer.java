package packageCharacters;

import packageWeaponsOffense.WeaponsOffense;
import packageDefenseTools.DefenseTools;

/**
 * The type Characters player.
 */
public abstract class CharactersPlayer {

    /**
     * The Weapon offense.
     */
    protected WeaponsOffense weaponOffense;
    /**
     * The Defense tools.
     */
    protected DefenseTools defenseTools;
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Life.
     */
    protected String life;
    /**
     * The Image.
     */
    protected String image;
    /**
     * The Attack.
     */
    protected String Attack;

    /**
     * Instantiates a new Characters player.
     *
     * @param pName          the p name
     * @param pImage         the p image
     * @param pLife          the p life
     * @param pAttack        the p attack
     * @param pWeaponOffense the p weapon offense
     * @param pDefenseTools  the p defense tools
     */
    public CharactersPlayer(String pName, String pImage, String pLife, String pAttack, WeaponsOffense pWeaponOffense, DefenseTools pDefenseTools) {
        this.name = pName;
        this.life = pLife;
        this.image = pImage;
        this.Attack = pAttack;
        this.weaponOffense = pWeaponOffense;
        this.defenseTools = pDefenseTools;
    }

    public WeaponsOffense getWeaponOffense() {
        return weaponOffense;
    }

    public void setWeaponOffense(WeaponsOffense weaponOffense) {
        this.weaponOffense = weaponOffense;
    }

    public DefenseTools getDefenseTools() {
        return defenseTools;
    }

    public void setDefenseTools(DefenseTools defenseTools) {
        this.defenseTools = defenseTools;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    protected String getName() {
        return name;
    }


    /**
     * Sets name.
     *
     * @param name the name
     */
    protected void setName(String name) {
        this.name = name;
    }


    /**
     * Gets life.
     *
     * @return the life
     */
    protected String getLife() {
        return life;
    }


    /**
     * Sets life.
     *
     * @param life the life
     */
    protected void setLife(String life) {
        this.life = life;
    }


    /**
     * Gets image.
     *
     * @return the image
     */
    protected String getImage() {
        return image;
    }


    /**
     * Sets image.
     *
     * @param image the image
     */
    protected void setImage(String image) {
        this.image = image;
    }


    /**
     * Gets attack.
     *
     * @return the attack
     */
    protected String getAttack() {
        return Attack;
    }


    /**
     * Sets attack.
     *
     * @param attack the attack
     */
    protected void setAttack(String attack) {
        Attack = attack;
    }

    @Override
    public String toString() {
        return "CharactersPlayer [ weaponOffense = " + weaponOffense + "- defenseTools=" + defenseTools + ".\n- name : " + name + ".\n- life : " + life + ".\n- image : " + image + ".\n- Attack : " + Attack + ".]\n";
    }


}

