
public class Etudiant extends Personne {

	private String diplomeEncours;
	private static int nbEtudiant = 0;

	public Etudiant(String nom, String prenom, String rue, String ville, String diplomeEncours) {
		super(nom, prenom, rue, ville);
		this.diplomeEncours = diplomeEncours;
		nbEtudiant++;
	}

	public String getDiplomeEncours() {
		return diplomeEncours;
	}

	public void setDiplomeEncours(String diplomeEncours) {
		this.diplomeEncours = diplomeEncours;
	}

	@Override
	public String toString() {
		return "Etudiant [" + super.toString() + ", Diplome =" + diplomeEncours + "]";
	}

	@Override
	public void ecrirePersonne() {
		System.out.println("Etudiant [diplome =" + diplomeEncours + ", Nom =" + getNom() + ", Prenom ="
				+ getPrenom() + ", Rue =" + getRue() + ", Ville =" + getVille() + "]");

	}
	
	@Override
	public void modifierPersonne(String rue, String ville) {

		super.modifierPersonne(rue, ville);
	}
	
	public static int nbEtudiant() {

		return nbEtudiant;

	}
	
	public static void nbEtudiants() {
		System.out.println("Nombre des secretaires : " + nbEtudiant);
	}



}
