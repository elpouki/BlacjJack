
public class Main {
	public static void main(String[] args) {
		for (Color couleur : Color.values()) {
			for (LeRang rang : LeRang.values()) {
				Carte carte = new Carte(couleur, rang);
				System.out.println("couleur : " + carte.getCouleur() + "  rang : " + carte.getFace());
			}
		}

	}
}
