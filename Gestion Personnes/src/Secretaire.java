
public class Secretaire extends Personne {

	private String numBureau;
	private static int nbSecretaire = 0;

	public Secretaire(String nom, String prenom, String rue, String ville, String numBureau) {
		super(nom, prenom, rue, ville);
		this.setNumBureau(numBureau);
		nbSecretaire++;
	}

	public String getNumBureau() {
		return numBureau;
	}

	public void setNumBureau(String numBureau) {
		this.numBureau = numBureau;
	}

	@Override
	public String toString() {
		return "Secretaire [" + super.toString() + ", numero bureau = " + numBureau + "]";
	}

	@Override
	public void ecrirePersonne() {

		System.out.println("Secretaire [numBureau=" + numBureau + ", Nom =" + getNom() + ", Prenom =" + getPrenom()
				+ ", Rue =" + getRue() + ", Ville =" + getVille() + ", numero bureau =" + getNumBureau() + "]");
	}

	@Override
	public void modifierPersonne(String rue, String ville) {
		super.modifierPersonne(rue, ville);
	}

	public static int nbSecretaires() {

		return nbSecretaire;
	}
	
	public static void nbSeretaires() {
		System.out.println("Nombre des secretaires : " + nbSecretaire);
	}

}
