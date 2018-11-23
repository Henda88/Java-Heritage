
public class main {

	public static void main(String[] args) {

		Secretaire s1 = new Secretaire("Celine", "Celine", "11 rue de paris", "Paris", "A5");
		Secretaire s2 = new Secretaire("Alex", "Alex", "11 rue de créteil", "Créteil", "A6");

		System.out.println(s1.toString());
		System.out.println(s1.toString());

		s1.ecrirePersonne();
		s2.ecrirePersonne();
		
		s1.modifierPersonne("7 boulevard Pablo Picasso ", "Argenteuil");
		s2.modifierPersonne("23 rue royer", "Ivry sur seine");
	
		Secretaire.nbSeretaires();

		System.out.println("****************************************************************************************");

		Enseignant ens1 = new Enseignant("Elyes", "Elyes", "12 rue Palestine", "Marseille", "Informatique");
		Enseignant ens2 = new Enseignant("Seif", "Seif", "5 rue Madrid", "Nice", "Management");

		System.out.println(ens1.toString());
		System.out.println(ens2.toString());

		ens1.ecrirePersonne();
		ens2.ecrirePersonne();
		
		ens1.modifierPersonne("15 rue tunis", "Montreuil");

		Enseignant.nbEnseignants();;


		System.out.println("****************************************************************************************");

		Etudiant e1 = new Etudiant("Haythem", "Haythem", "7 rue de paris", "Paris", "Marketing"); 
		Etudiant e2 = new Etudiant("ABIR", "ABIR", "7 rue de paris", "Paris", "Informatique de gestion"); 
		
		e1.ecrirePersonne();
		e2.ecrirePersonne();
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		e1.modifierPersonne("11 rue Pinte", "Courbevoie");

		Etudiant.nbEtudiants();
		
		Personne.nbPersonnes();
		
	}

}
