package packageEnemies;

public abstract class CharactersEnemies {

    private String name;
    private String image;
    private String life;

    public CharactersEnemies(String pName, String pImage, String pLife){
        name = pName;
        image = pImage;
        life = pLife;
    }

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String toString() {
        return "Nom de la créature : " + getName() + " image : " + getImage() + " Santé de la créature : " + getLife();
    }
}
