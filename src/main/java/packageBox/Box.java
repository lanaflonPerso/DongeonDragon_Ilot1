package packageBox;

import packageEvent.Event;

public abstract class Box extends Event {


	private String name;

	public Box(String pName) {
		this.name=pName;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {

        this.name = name;
    }

    public String toString() {
        return "Nom de la caisse surprise : " + getName();
    }

}
