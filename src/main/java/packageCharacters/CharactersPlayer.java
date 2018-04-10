package packageCharacters;

import packageWeaponsOffense.WeaponsOffense;
import packageDefenseTools.DefenseTools;

public abstract class CharactersPlayer {
	
	protected WeaponsOffense weaponOffense;
	protected DefenseTools defenseTools;
	protected String name;
    protected String life;
    protected String image;
    protected String Attack;
    
    public CharactersPlayer(String pName ,String pImage ,String pLife ,String pAttack, WeaponsOffense pWeaponOffense, DefenseTools pDefenseTools) {
    	this.name = pName;
    	this.life = pLife;
    	this.image = pImage;
    	this.Attack = pAttack;
    	this.weaponOffense = pWeaponOffense;
    	this.defenseTools = pDefenseTools;
    }
    
	protected String getName() {
		return name;
	}



	protected void setName(String name) {
		this.name = name;
	}



	protected String getLife() {
		return life;
	}



	protected void setLife(String life) {
		this.life = life;
	}



	protected String getImage() {
		return image;
	}



	protected void setImage(String image) {
		this.image = image;
	}



	protected String getAttack() {
		return Attack;
	}



	protected void setAttack(String attack) {
		Attack = attack;
	}

	@Override
	public String toString() {
		return "CharactersPlayer [weaponOffense=" + weaponOffense + "\n defenseTools=" + defenseTools + ", name=" + name
				+ ", life=" + life + ", image=" + image + ", Attack=" + Attack + "]";
	}

        

   
}

