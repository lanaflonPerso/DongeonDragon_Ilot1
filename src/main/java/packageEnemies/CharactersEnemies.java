package packageEnemies;

/**
 * The type Characters enemies.
 */
public abstract class CharactersEnemies {

    private String name;
    private String image;
    private String life;

    /**
     * Instantiates a new Characters enemies.
     *
     * @param pName  the p name
     * @param pImage the p image
     * @param pLife  the p life
     */
    public CharactersEnemies(String pName, String pImage, String pLife) {
        name = pName;
        image = pImage;
        life = pLife;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Gets life.
     *
     * @return the life
     */
    public String getLife() {
        return life;
    }

    /**
     * Sets life.
     *
     * @param life the life
     */
    public void setLife(String life) {
        this.life = life;
    }

    public String toString() {
        return "Nom de la créature : " + getName() + " image : " + getImage() + " Santé de la créature : " + getLife();
    }
}
