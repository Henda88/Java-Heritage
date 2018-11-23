
public abstract class Personne {

	private String nom;
	private String prenom;
	private String rue;
	private String ville;
	private static int nb_personne = 0;

	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, String rue, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		nb_personne++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", rue=" + rue + ", ville=" + ville + "]";
	}

	public abstract void ecrirePersonne();

	public static int nbPersonne() {

		return nb_personne++;
	}

	public void modifierPersonne(String rue, String ville) {

		this.rue = rue;
		this.ville = ville;
		ecrirePersonne();
	}

	public static void nbPersonnes() {
		System.out.println("Nombre d’employés : " + nb_personne);
	}

}
