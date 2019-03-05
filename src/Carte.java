
public class Carte {
	private Color couleur;
	private LeRang face;

	// Constructor
	public Carte(Color couleur, LeRang face) {
		super();
		this.couleur = couleur;
		this.face = face;
	}

//Getter & setter
	public Color getCouleur() {
		return couleur;
	}

	public LeRang getFace() {
		return face;
	}

}
