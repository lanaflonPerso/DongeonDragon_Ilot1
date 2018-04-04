package packageCharacters;

public abstract class CharactersPlayer {
	protected String name;
    protected String life;
    protected String image;
    protected String Attack;
    protected String Weapon;
    
    public CharactersPlayer(String pName ,String pImage ,String pLife ,String pAttack ,String pWeapon) {
    	name = pName;
    	life = pLife;
    	image = pImage;
    	Attack = pAttack;
    	Weapon = pWeapon;
    	
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

	protected String getWeapon() {
		return Weapon;
	}

	protected void setWeapon(String weapon) {
		Weapon = weapon;
	}

	@Override
	public String toString() {
		return "CharactersPlayer [name=" + name + ", life=" + life + ", image=" + image + ", Attack=" + Attack
				+ ", Weapon=" + Weapon + "]";
	}
    
	
    

    
}

