
public class Enseignant extends Personne {

	private String specialite;
	private static int nbEnseignant = 0;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
		super(nom, prenom, rue, ville);
		this.specialite = specialite;
		nbEnseignant++;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Enseignant [" + super.toString() + ", specialté = " + specialite + "]";
	}

	@Override
	public void ecrirePersonne() {

		System.out.println("Enseignant [specialite=" + specialite + ", Nom =" + getNom() + ", Prenom =" + getPrenom()
				+ ", Rue =" + getRue() + ", Ville =" + getVille() + "]");

	}

	@Override
	public void modifierPersonne(String rue, String ville) {

		super.modifierPersonne(rue, ville);
	}

	public static int nbEnseignant() {

		return nbEnseignant;

	}

	public static void nbEnseignants() {
		System.out.println("Nombre des secretaires : " + nbEnseignant);
	}
}
